package com.company.akira.controller;

import com.company.akira.model.Actor;
import com.company.akira.model.AutoService;
import com.company.akira.repository.ActorRepository;
import com.company.akira.repository.AutoServiceRepository;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/catalog/avtoservice")
public class AutoServiceController {


    private final AutoServiceRepository repo;

    public AutoServiceController(AutoServiceRepository repo) {
        this.repo = repo;
    }

    @GetMapping("/all")
    public String showAll(Model model) {
        Iterable<AutoService> all = repo.findAll();
        model.addAttribute("avtoservice",all);
        return "/catalog/card/cards_avtoservice";
    }
}
