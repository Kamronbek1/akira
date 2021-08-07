/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.company.akira.controller;

import com.company.akira.model.Hospital;
import com.company.akira.model.Sort;
import com.company.akira.repository.HospitalRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.multipart.MultipartFile;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

import java.io.File;
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
public class HospitalUprloadController {


    private static String UPLOADED_FOLDER = "/static/assets/images/";

    @Autowired
    private HospitalRepository hospitalRepo;

    @GetMapping("/hospitals0")
    public String getAll(Model model) {
        /*for (int i = 0; i < 10; i++) {
            Hospital save = hospitalRepo.save(new Hospital("Shaxnoza"+i, "9999", "chilonzor", Sort.JARROH));
            System.out.println(save);
        }*/
        Iterable<Hospital> hospitals = hospitalRepo.findAll();
        model.addAttribute("hospitals", hospitals);
        return "preview";
    }

    @GetMapping("/add0")
    public String showForm(Model model) {
        Hospital hospital = new Hospital();
        model.addAttribute("hospital", hospital);
        List<Sort> types = Arrays.asList(Sort.values());
        for (Sort type : types) {
            System.out.println(type);
        }
        model.addAttribute("types", types);
        return "input_form";
    }

    @PostMapping("/addHospital0")
    public String submitForm(@RequestParam("file") MultipartFile file,
                             RedirectAttributes redirectAttributes,
                             @ModelAttribute("hospital") Hospital hospital) {
        if (file.isEmpty()) {
            redirectAttributes.addFlashAttribute("message", "Please select a file to upload");
            return "redirect:uploadStatus";
        }

        try {
            // Get the file and save it somewhere
            byte[] bytes = file.getBytes();
            File pathU = new File("./static/image/");
            Path path = Paths.get(new File("src\\main\\resources\\static\\uploads").getAbsolutePath() + "\\"+ file.getOriginalFilename());
            Files.write(path, bytes);
            System.out.println(path);

            redirectAttributes.addFlashAttribute("message",
                    "You successfully uploaded '" + file.getOriginalFilename() + "'");

        } catch (IOException e) {
            e.printStackTrace();
        }

        System.out.println(hospital);
        hospitalRepo.save(hospital);
        return "redirect:/add0";
    }
}