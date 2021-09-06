package com.company.akira.controller;

import com.company.akira.model.Actor;
import com.company.akira.model.CarWash;
import com.company.akira.repository.ActorRepository;
import com.company.akira.repository.CarWashRepository;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/catalog/avtomoyka")
public class CarWashController {

    private final CarWashRepository repo;

    public CarWashController(CarWashRepository repo) {
        this.repo = repo;
    }

    @GetMapping("/all")
    public String showAll(Model model) {
        Iterable<CarWash> all = repo.findAll();
        model.addAttribute("avtomoyka",all);
        return "/catalog/card/cards_avtomoyka";
    }
}
