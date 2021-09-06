package com.company.akira.controller;

import com.company.akira.model.Actor;
import com.company.akira.model.BuildingMaterialsStore;
import com.company.akira.repository.ActorRepository;
import com.company.akira.repository.BuildingMaterialsStoreRepository;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/catalog/qurilish-mollari")
public class BuildingMaterialsStoreController {


    private final BuildingMaterialsStoreRepository repo;

    public BuildingMaterialsStoreController(BuildingMaterialsStoreRepository repo) {
        this.repo = repo;
    }

    @GetMapping("/all")
    public String showAll(Model model) {
        Iterable<BuildingMaterialsStore> all = repo.findAll();
        model.addAttribute("qurilish",all);
        return "/catalog/card/cards_stroymag";
    }
}
