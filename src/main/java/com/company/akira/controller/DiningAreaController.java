package com.company.akira.controller;

import com.company.akira.model.Actor;
import com.company.akira.model.DiningArea;
import com.company.akira.repository.ActorRepository;
import com.company.akira.repository.DiningAreaRepository;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/catalog/oshxonalar")
public class DiningAreaController {


    private final DiningAreaRepository repo;

    public DiningAreaController(DiningAreaRepository repo) {
        this.repo = repo;
    }

    @GetMapping("/all")
    public String showAll(Model model) {
        Iterable<DiningArea> all = repo.findAll();
        model.addAttribute("diningarea",all);
        return "/catalog/card/cards_stolovoy";
    }
}
