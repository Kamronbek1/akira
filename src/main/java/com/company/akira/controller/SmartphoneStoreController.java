package com.company.akira.controller;

import com.company.akira.model.Actor;
import com.company.akira.model.SmartphoneStore;
import com.company.akira.repository.ActorRepository;
import com.company.akira.repository.SmartphoneStoreRepository;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/catalog/smartfon")
public class SmartphoneStoreController {


    private final SmartphoneStoreRepository repo;

    public SmartphoneStoreController(SmartphoneStoreRepository repo) {
        this.repo = repo;
    }

    @GetMapping("/all")
    public String showAll(Model model) {
        Iterable<SmartphoneStore> all = repo.findAll();
        model.addAttribute("smartfon",all);
        return "/catalog/card/cards_smartfon";
    }
}
