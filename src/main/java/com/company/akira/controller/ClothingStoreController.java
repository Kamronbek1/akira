package com.company.akira.controller;

import com.company.akira.model.Actor;
import com.company.akira.model.ClothingStore;
import com.company.akira.repository.ActorRepository;
import com.company.akira.repository.ClothingStoreRepository;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/catalog/kiyim-kechak")
public class ClothingStoreController {


    private final ClothingStoreRepository repo;

    public ClothingStoreController(ClothingStoreRepository repo) {
        this.repo = repo;
    }

    @GetMapping("/all")
    public String showAll(Model model) {
        Iterable<ClothingStore> all = repo.findAll();
        model.addAttribute("kiyim",all);
        return "/catalog/card/cards_kiyimkechak";
    }
}
