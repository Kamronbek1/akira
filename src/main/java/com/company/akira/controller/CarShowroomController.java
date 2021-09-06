package com.company.akira.controller;

import com.company.akira.model.Actor;
import com.company.akira.model.CarShowroom;
import com.company.akira.repository.ActorRepository;
import com.company.akira.repository.CarShowroomRepository;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/catalog/avtosalon")
public class CarShowroomController {


    private final CarShowroomRepository repo;

    public CarShowroomController(CarShowroomRepository repo) {
        this.repo = repo;
    }

    @GetMapping("/all")
    public String showAll(Model model) {
        Iterable<CarShowroom> all = repo.findAll();
        model.addAttribute("avtosalon",all);
        return "/catalog/card/cards_avtosalon";
    }
}
