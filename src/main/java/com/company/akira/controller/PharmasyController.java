package com.company.akira.controller;

import com.company.akira.model.Pharmacy;
import com.company.akira.repository.PharmacyRepository;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller()
@RequestMapping("/catalog")
public class PharmasyController extends AbstractRestController<Pharmacy, PharmacyRepository> {

    public PharmasyController(PharmacyRepository repo) {
        super(repo);
    }

    @Override
    @GetMapping("/card/cards_apteka")
    public String getCategory(String name, Model model) {
        return super.getCategory(name, model);
    }
}
