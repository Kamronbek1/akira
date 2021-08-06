/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.company.akira.controller;

import com.company.akira.model.Hospital;
import com.company.akira.repository.HospitalRepository;
import com.company.akira.model.Sort;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

/**
 *
 * @author User
 */
@Controller
public class HospialController {

    @Autowired
    private HospitalRepository hospitalRepo;

    @GetMapping("/hospitals")
    public String getAll(Model model) {
        /*for (int i = 0; i < 10; i++) {
            Hospital save = hospitalRepo.save(new Hospital("Shaxnoza"+i, "9999", "chilonzor", Sort.JARROH));
            System.out.println(save);
        }*/
        Iterable<Hospital> hospitals = hospitalRepo.findAll();
        model.addAttribute("hospitals", hospitals);
        return "main";
    }
    @GetMapping("/add")
    public String showForm(Model model){
        Hospital hospital = new Hospital();
        model.addAttribute("hospital", hospital);
        return "";
    }

}
