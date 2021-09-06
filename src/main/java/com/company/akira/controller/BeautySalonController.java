package com.company.akira.controller;

import com.company.akira.model.Actor;
import com.company.akira.model.BeautySalon;
import com.company.akira.repository.ActorRepository;
import com.company.akira.repository.BeautySalonRepository;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/catalog/beauty-salon")
public class BeautySalonController {


    private final BeautySalonRepository repo;

    public BeautySalonController(BeautySalonRepository repo) {
        this.repo = repo;
    }

    @GetMapping("/all")
    public String showAll(Model model) {
        Iterable<BeautySalon> all = repo.findAll();
        model.addAttribute("beauty",all);
        return "/catalog/card/cards_beauty";
    }
}
