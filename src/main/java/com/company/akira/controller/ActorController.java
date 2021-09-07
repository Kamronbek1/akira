package com.company.akira.controller;

import com.company.akira.model.Actor;
import com.company.akira.model.Pharmacy;
import com.company.akira.repository.ActorRepository;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/catalog/artist")
public class ActorController {


    private final ActorRepository repo;

    public ActorController(ActorRepository repo) {
        this.repo = repo;
    }

    @GetMapping("/all")
    public String showAll(Model model) {
        Iterable<Actor> all = repo.findAll();
        model.addAttribute("actor",all);
        return "/catalog/card/cards_artist";
    }
    @PostMapping("/add")
    public Actor add(){
        return repo.save(new Actor());
    }
}
