package com.company.akira.controller;

import com.company.akira.model.Actor;
import com.company.akira.model.CallCenterOffice;
import com.company.akira.repository.ActorRepository;
import com.company.akira.repository.CallCenterOfficeRepository;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/catalog/call-center")
public class CallCenterOfficeController {


    private final CallCenterOfficeRepository repo;

    public CallCenterOfficeController(CallCenterOfficeRepository repo) {
        this.repo = repo;
    }

    @GetMapping("/all")
    public String showAll(Model model) {
        Iterable<CallCenterOffice> all = repo.findAll();
        model.addAttribute("aloqa",all);
        return "/catalog/card/cards_svyazofis";
    }
}
