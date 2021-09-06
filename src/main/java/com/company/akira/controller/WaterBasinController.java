package com.company.akira.controller;

import com.company.akira.model.Actor;
import com.company.akira.model.WaterBasin;
import com.company.akira.repository.ActorRepository;
import com.company.akira.repository.WaterBasinRepository;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/catalog/basseyn")
public class WaterBasinController {


    private final WaterBasinRepository repo;

    public WaterBasinController(WaterBasinRepository repo) {
        this.repo = repo;
    }

    @GetMapping("/all")
    public String showAll(Model model) {
        Iterable<WaterBasin> all = repo.findAll();
        model.addAttribute("basseyn",all);
        return "/catalog/card/cards_basseyn";
    }
}
