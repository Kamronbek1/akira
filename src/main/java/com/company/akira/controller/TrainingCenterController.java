package com.company.akira.controller;

import com.company.akira.model.Actor;
import com.company.akira.model.TrainingCenter;
import com.company.akira.repository.ActorRepository;
import com.company.akira.repository.TrainingCenterRepository;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/catalog/oquv-markaz")
public class TrainingCenterController {


    private final TrainingCenterRepository repo;

    public TrainingCenterController(TrainingCenterRepository repo) {
        this.repo = repo;
    }

    @GetMapping("/all")
    public String showAll(Model model) {
        Iterable<TrainingCenter> all = repo.findAll();
        model.addAttribute("oquv",all);
        return "/catalog/card/cards_trainingcenter";
    }
}
