package com.company.akira.controller;

import com.company.akira.model.BuildingMaterialsStore;
import com.company.akira.repository.BuildingMaterialsStoreRepository;
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
@RequestMapping("/catalog/qurilish-mollari")
public class BuildingMaterialsStoreController {


    private final BuildingMaterialsStoreRepository repo;

    public BuildingMaterialsStoreController(BuildingMaterialsStoreRepository repo) {
        this.repo = repo;
    }

    @GetMapping("/all")
    public String showAll(Model model) {
        Iterable<BuildingMaterialsStore> all = repo.findAll();
        model.addAttribute("qurilish",all);
        return "catalog/card/cards_stroymag";
    }
    @GetMapping("/add")
    public String add(Model model) {
        model.addAttribute("qurilish", new BuildingMaterialsStore());
        return "catalog/post/stroymag";
    }

    @PostMapping("/post")
    public String submitForm(@RequestParam("file") MultipartFile file,
                             RedirectAttributes redirectAttributes,
                             @ModelAttribute("qurilish") BuildingMaterialsStore materialsStore) {
        if (file.isEmpty()) {
            redirectAttributes.addFlashAttribute("message", "Please select a file to upload");
            return "redirect:uploadStatus";
        }

        try {
            // Get the file and save it somewhere
            Utils.saveImage(file,materialsStore);
            redirectAttributes.addFlashAttribute("message",
                    "You successfully uploaded '" + file.getOriginalFilename() + "'");
        } catch (IOException e) {
            e.printStackTrace();
        }
        repo.save(materialsStore);
        return "redirect:/uploadStatus";
    }
}
