package com.company.akira.controller;

import com.company.akira.model.Actor;
import com.company.akira.model.Sanatorium;
import com.company.akira.repository.ActorRepository;
import com.company.akira.repository.SanatoriumRepository;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/catalog/sanatorium")
public class SanatoriumController {


    private final SanatoriumRepository repo;

    public SanatoriumController(SanatoriumRepository repo) {
        this.repo = repo;
    }

    @GetMapping("/all")
    public String showAll(Model model) {
        Iterable<Sanatorium> all = repo.findAll();
        model.addAttribute("sanatorium",all);
        return "/catalog/card/cards_sanatory";
    }
}
