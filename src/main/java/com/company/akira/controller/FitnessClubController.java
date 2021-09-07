package com.company.akira.controller;

import com.company.akira.model.Actor;
import com.company.akira.model.FitnessClub;
import com.company.akira.repository.ActorRepository;
import com.company.akira.repository.FitnessClubRepository;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/catalog/fitnes-club")
public class FitnessClubController {
    private final FitnessClubRepository repo;

    public FitnessClubController(FitnessClubRepository repo) {
        this.repo = repo;
    }

    @GetMapping("/all")
    public String showAll(Model model) {
        Iterable<FitnessClub> all = repo.findAll();
        model.addAttribute("fitnes",all);
        return "/catalog/card/cards_trenajor";
    }
}
