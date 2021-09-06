package com.company.akira.controller;

import com.company.akira.model.Bank;
import com.company.akira.repository.BankRepository;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/catalog/bank")
public class BankController {


    private final BankRepository repo;

    public BankController(BankRepository repo) {
        this.repo = repo;
    }

    @GetMapping("/all")
    public String showAll(Model model) {
        Iterable<Bank> all = repo.findAll();
        model.addAttribute("bank", all);
        return "/catalog/card/cards_bank";
    }
}
