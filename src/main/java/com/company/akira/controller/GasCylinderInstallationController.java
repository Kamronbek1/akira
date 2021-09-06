package com.company.akira.controller;

import com.company.akira.model.Actor;
import com.company.akira.model.GasCylinderInstallation;
import com.company.akira.repository.ActorRepository;
import com.company.akira.repository.GasCylinderInstallationRepository;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/catalog/metan-ustanovka")
public class GasCylinderInstallationController {


    private final GasCylinderInstallationRepository repo;

    public GasCylinderInstallationController(GasCylinderInstallationRepository repo) {
        this.repo = repo;
    }

    @GetMapping("/all")
    public String showAll(Model model) {
        Iterable<GasCylinderInstallation> all = repo.findAll();
        model.addAttribute("metan",all);
        return "/catalog/card/cards_metan";
    }
}
