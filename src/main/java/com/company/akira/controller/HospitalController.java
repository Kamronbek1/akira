/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.company.akira.controller;

import com.company.akira.model.Actor;
import com.company.akira.model.Hospital;
import com.company.akira.repository.HospitalRepository;
import com.company.akira.model.Sort;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

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
    /*@GetMapping("/hospitals")
    public String getAll(Model model) {
        *//*for (int i = 0; i < 10; i++) {
            Hospital save = hospitalRepo.save(new Hospital("Shaxnoza"+i, "9999", "chilonzor", Sort.JARROH));
            System.out.println(save);
        }*//*
        Iterable<Hospital> hospitals = hospitalRepo.findAll();
        model.addAttribute("hospitals", hospitals);
        return "preview";
    }

    @GetMapping("/post")
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

    @PostMapping("/addHospital")
    public String submitForm(@ModelAttribute("hospital") Hospital hospital) {
        System.out.println(hospital);
        hospitalRepo.save(hospital);
        return "input_form";
    }*/
}
