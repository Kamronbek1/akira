package com.company.akira.controller;

import com.company.akira.model.Actor;
import com.company.akira.model.AutoService;
import com.company.akira.model.BeautySalon;
import com.company.akira.repository.ActorRepository;
import com.company.akira.repository.BeautySalonRepository;
import com.company.akira.utl.Const;
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
@RequestMapping("/catalog/beauty-salon")
public class BeautySalonController {


    private final BeautySalonRepository repo;

    public BeautySalonController(BeautySalonRepository repo) {
        this.repo = repo;
    }

    @GetMapping("/all")
    public String showAll(Model model) {
        Iterable<BeautySalon> all = repo.findAll();
        model.addAttribute("beauty",all);
        return "catalog/card/cards_beauty";
    }
    @GetMapping("/add")
    public String add(Model model) {
        model.addAttribute("beauty", new BeautySalon());
        return "catalog/post/beauty";
    }

    @PostMapping("/post")
    public String submitForm(@RequestParam("file") MultipartFile file,
                             RedirectAttributes redirectAttributes,
                             @ModelAttribute("beauty") BeautySalon beautySalon) {
        if (file.isEmpty()) {
            redirectAttributes.addFlashAttribute("message", "Please select a file to upload");
            return "redirect:uploadStatus";
        }

        try {
            // Get the file and save it somewhere
            byte[] bytes = file.getBytes();

            Path path = Paths.get(Const.UPLOAD_PATH + file.getOriginalFilename());
            beautySalon.setImageUrl("/images/"+file.getOriginalFilename());
            Files.write(path, bytes);
            redirectAttributes.addFlashAttribute("message",
                    "You successfully uploaded '" + file.getOriginalFilename() + "'");
        } catch (IOException e) {
            e.printStackTrace();
        }
        repo.save(beautySalon);
        return "redirect:/uploadStatus";
    }
}
