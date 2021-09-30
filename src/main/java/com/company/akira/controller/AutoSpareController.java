package com.company.akira.controller;

import com.company.akira.model.AutoService;
import com.company.akira.model.AutoSpare;
import com.company.akira.repository.AutoSpareRepository;
import com.company.akira.utl.Const;
import com.company.akira.utl.Utils;
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
@RequestMapping("/catalog/avtozapchast")
public class AutoSpareController {


    private final AutoSpareRepository repo;

    public AutoSpareController(AutoSpareRepository repo) {
        this.repo = repo;
    }

    @GetMapping("/all")
    public String showAll(Model model) {
        Iterable<AutoSpare> all = repo.findAll();
        model.addAttribute("avtozapchast", all);
        return "catalog/card/cards_avtozapchast";
    }

    @GetMapping("/add")
    public String add(Model model) {
        model.addAttribute("avtozapchast", new AutoSpare());
        return "catalog/post/autozapchast";
    }

    @PostMapping("/post")
    public String submitForm(@RequestParam("file") MultipartFile file,
                             RedirectAttributes redirectAttributes,
                             @ModelAttribute("avtozapchast") AutoSpare spare) {
        if (file.isEmpty()) {
            redirectAttributes.addFlashAttribute("message", "Please select a file to upload");
            return "redirect:uploadStatus";
        }

        try {
            // Get the file and save it somewhere

            Utils.saveImage(file, spare);
            redirectAttributes.addFlashAttribute("message",
                    "You successfully uploaded '" + file.getOriginalFilename() + "'");
        } catch (IOException e) {
            e.printStackTrace();
        }
        repo.save(spare);
        return "redirect:/uploadStatus";
    }
}
