/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.company.akira.controller;

import com.company.akira.model.Actor;
import com.company.akira.model.AutoService;
import com.company.akira.model.Hospital;
import com.company.akira.repository.HospitalRepository;
import com.company.akira.model.Sort;
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
import java.util.Arrays;
import java.util.List;

/**
 * @author User
 */
@Controller
@RequestMapping("/catalog/medical")
public class HospitalController {

    private final HospitalRepository repo;

    public HospitalController(HospitalRepository hospitalRepo) {
        this.repo = hospitalRepo;
    }

    @GetMapping("/all")
    public String showAll(Model model) {
        Iterable<Hospital> all = repo.findAll();
        model.addAttribute("hospital", all);
        return "/catalog/card/cards_medical";
    }
    @GetMapping("/add")
    public String add(Model model) {
        model.addAttribute("tuning", new AutoService());
        return "/catalog/post/";
    }

    @PostMapping("/post")
    public String submitForm(@RequestParam("file") MultipartFile file,
                             RedirectAttributes redirectAttributes,
                             @ModelAttribute("hospital") Hospital service) {
        if (file.isEmpty()) {
            redirectAttributes.addFlashAttribute("message", "Please select a file to upload");
            return "redirect:uploadStatus";
        }

        try {
            // Get the file and save it somewhere
            byte[] bytes = file.getBytes();

            Path path = Paths.get(Const.UPLOAD_PATH + file.getOriginalFilename());
            service.setImageUrl("/images/" + file.getOriginalFilename());
            Files.write(path, bytes);
            redirectAttributes.addFlashAttribute("message",
                    "You successfully uploaded '" + file.getOriginalFilename() + "'");
        } catch (IOException e) {
            e.printStackTrace();
        }
        repo.save(service);
        return "redirect:/uploadStatus";
    }
}
