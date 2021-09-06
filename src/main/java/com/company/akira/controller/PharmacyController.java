package com.company.akira.controller;

import com.company.akira.model.Pharmacy;
import com.company.akira.repository.PharmacyRepository;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller()
@RequestMapping("/catalog/apteka")
public class PharmacyController {

    private final PharmacyRepository repo;

    public PharmacyController(PharmacyRepository repo) {
        this.repo = repo;
    }

    @GetMapping("/all")
    public String showAll(Model model) {
        Iterable<Pharmacy> all = repo.findAll();
        model.addAttribute("pharmacy",all);
        return "/catalog/card/cards_apteka";
    }
}
