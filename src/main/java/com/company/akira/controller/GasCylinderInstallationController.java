package com.company.akira.controller;

import com.company.akira.model.GasCylinderInstallation;
import com.company.akira.repository.GasCylinderInstallationRepository;
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
@RequestMapping("/catalog/metan-ustanovka")
public class GasCylinderInstallationController {


    private final GasCylinderInstallationRepository repo;

    public GasCylinderInstallationController(GasCylinderInstallationRepository repo) {
        this.repo = repo;
    }

    @GetMapping("/all")
    public String showAll(Model model) {
        Iterable<GasCylinderInstallation> all = repo.findAll();
        model.addAttribute("metan", all);
        return "catalog/card/cards_metan";
    }

    @GetMapping("/add")
    public String add(Model model) {
        model.addAttribute("metan", new GasCylinderInstallation());
        return "catalog/post/metan";
    }

    @PostMapping("/post")
    public String submitForm(@RequestParam("file") MultipartFile file,
                             RedirectAttributes redirectAttributes,
                             @ModelAttribute("metan") GasCylinderInstallation service) {
        if (file.isEmpty()) {
            redirectAttributes.addFlashAttribute("message", "Please select a file to upload");
            return "redirect:uploadStatus";
        }

        try {
            // Get the file and save it somewhere
            Utils.saveImage(file, service);
            redirectAttributes.addFlashAttribute("message",
                    "You successfully uploaded '" + file.getOriginalFilename() + "'");
        } catch (IOException e) {
            e.printStackTrace();
        }
        repo.save(service);
        return "redirect:/uploadStatus";
    }
}
