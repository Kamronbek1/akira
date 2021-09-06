package com.company.akira.controller;

import com.company.akira.model.Actor;
import com.company.akira.model.JewelryStore;
import com.company.akira.repository.ActorRepository;
import com.company.akira.repository.JewelryStoreRepository;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/catalog/zargarlik")
public class JewelryStoreController {


    private final JewelryStoreRepository repo;

    public JewelryStoreController(JewelryStoreRepository repo) {
        this.repo = repo;
    }

    @GetMapping("/all")
    public String showAll(Model model) {
        Iterable<JewelryStore> all = repo.findAll();
        model.addAttribute("zargarlik",all);
        return "/catalog/card/cards_zargarlik";
    }
}
