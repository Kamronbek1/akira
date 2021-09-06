package com.company.akira.controller;

import com.company.akira.model.AutoTuning;
import com.company.akira.repository.AutoTuningRepository;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/catalog/avtotuning")
public class AutoTuningController {


    private final AutoTuningRepository repo;

    public AutoTuningController(AutoTuningRepository repo) {
        this.repo = repo;
    }

    @GetMapping("/all")
    public String showAll(Model model) {
        Iterable<AutoTuning> all = repo.findAll();
        model.addAttribute("avtotuning",all);
        return "/catalog/card/cards_avtotuning";
    }
}
