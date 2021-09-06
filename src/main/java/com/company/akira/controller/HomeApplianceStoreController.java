package com.company.akira.controller;

import com.company.akira.model.Actor;
import com.company.akira.model.HomeApplianceStore;
import com.company.akira.repository.ActorRepository;
import com.company.akira.repository.HomeApplianceStoreRepository;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/catalog/maishiy")
public class HomeApplianceStoreController {


    private final HomeApplianceStoreRepository repo;

    public HomeApplianceStoreController(HomeApplianceStoreRepository repo) {
        this.repo = repo;
    }

    @GetMapping("/all")
    public String showAll(Model model) {
        Iterable<HomeApplianceStore> all = repo.findAll();
        model.addAttribute("maishiy",all);
        return "/catalog/card/cards_maishiy";
    }
}
