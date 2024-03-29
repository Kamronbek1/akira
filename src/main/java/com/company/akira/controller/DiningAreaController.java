package com.company.akira.controller;

import com.company.akira.model.DiningArea;
import com.company.akira.repository.DiningAreaRepository;
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
@RequestMapping("/catalog/oshxonalar")
public class DiningAreaController {


    private final DiningAreaRepository repo;

    public DiningAreaController(DiningAreaRepository repo) {
        this.repo = repo;
    }

    @GetMapping("/all")
    public String showAll(Model model) {
        Iterable<DiningArea> all = repo.findAll();
        model.addAttribute("diningarea", all);
        return "catalog/card/cards_stolovoy";
    }

    @GetMapping("/add")
    public String add(Model model) {
        model.addAttribute("diningarea", new DiningArea());
        return "catalog/post/stolovoy";
    }

    @PostMapping("/post")
    public String submitForm(@RequestParam("file") MultipartFile file,
                             RedirectAttributes redirectAttributes,
                             @ModelAttribute("diningarea") DiningArea service) {
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
