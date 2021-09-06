package com.company.akira.controller;

import com.company.akira.model.Actor;
import com.company.akira.model.GroceryStore;
import com.company.akira.repository.ActorRepository;
import com.company.akira.repository.GroceryStoreRepository;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/catalog/oziqovqat")
public class GroceryStoreController {


    private final GroceryStoreRepository repo;

    public GroceryStoreController(GroceryStoreRepository repo) {
        this.repo = repo;
    }

    @GetMapping("/all")
    public String showAll(Model model) {
        Iterable<GroceryStore> all = repo.findAll();
        model.addAttribute("oziqovqat",all);
        return "/catalog/card/cards_oziqovqat";
    }
}
