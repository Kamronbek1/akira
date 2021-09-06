package com.company.akira.controller;

import com.company.akira.model.AutoSpare;
import com.company.akira.repository.AutoSpareRepository;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/catalog/avtozapchast")
public class AutoSpareController {


    private final AutoSpareRepository repo;

    public AutoSpareController(AutoSpareRepository repo) {
        this.repo = repo;
    }

    @GetMapping("/all")
    public String showAll(Model model) {
        Iterable<AutoSpare> all = repo.findAll();
        model.addAttribute("avtozapchast",all);
        return "/catalog/card/cards_avtozapchast";
    }
}
