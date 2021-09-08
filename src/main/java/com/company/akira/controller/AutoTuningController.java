package com.company.akira.controller;

import com.company.akira.model.AutoTuning;
import com.company.akira.model.Hospital;
import com.company.akira.repository.AutoTuningRepository;
import com.company.akira.utl.Const;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.multipart.MultipartFile;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

@Controller
@RequestMapping("/catalog/avtotuning")
public class AutoTuningController {


    private final AutoTuningRepository repo;

    public AutoTuningController(AutoTuningRepository repo) {
        this.repo = repo;
    }

    @GetMapping("/all")
    public String showAll(Model model) {
        Iterable<AutoTuning> all = repo.findAll();
        model.addAttribute("avtotuning", all);
        return "/catalog/card/cards_avtotuning";
    }

    @GetMapping("/add")
    public String add(Model model) {
        model.addAttribute("tuning", new AutoTuning());
        return "/catalog/post/autotuning";
    }

    @PostMapping("/post")
    public String submitForm(@RequestParam("file") MultipartFile file,
                             RedirectAttributes redirectAttributes,
                             @ModelAttribute("avtotuning") AutoTuning tuning) {
        if (file.isEmpty()) {
            redirectAttributes.addFlashAttribute("message", "Please select a file to upload");
            return "redirect:uploadStatus";
        }

        try {
            // Get the file and save it somewhere
            byte[] bytes = file.getBytes();

            Path path = Paths.get(Const.UPLOAD_PATH + file.getOriginalFilename());
            tuning.setImageUrl("/images/"+file.getOriginalFilename());
            Files.write(path, bytes);
            redirectAttributes.addFlashAttribute("message",
                    "You successfully uploaded '" + file.getOriginalFilename() + "'");
        } catch (IOException e) {
            e.printStackTrace();
        }
        repo.save(tuning);
        return "redirect:/uploadStatus";
    }
}
