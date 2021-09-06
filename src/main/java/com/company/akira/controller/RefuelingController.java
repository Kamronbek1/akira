package com.company.akira.controller;

import com.company.akira.model.Actor;
import com.company.akira.model.Refueling;
import com.company.akira.repository.ActorRepository;
import com.company.akira.repository.RefuelingRepository;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/catalog/avtozapravka")
public class RefuelingController {


    private final RefuelingRepository repo;

    public RefuelingController(RefuelingRepository repo) {
        this.repo = repo;
    }

    @GetMapping("/all")
    public String showAll(Model model) {
        Iterable<Refueling> all = repo.findAll();
        model.addAttribute("avtozapravka",all);
        return "/catalog/card/cards_avtozapravka";
    }
}
