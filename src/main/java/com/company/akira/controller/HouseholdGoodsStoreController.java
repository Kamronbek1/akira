package com.company.akira.controller;

import com.company.akira.model.Actor;
import com.company.akira.model.HouseholdGoodsStore;
import com.company.akira.repository.ActorRepository;
import com.company.akira.repository.HouseholdGoodsStoreRepository;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/catalog/xojalik-mollari")
public class HouseholdGoodsStoreController {


    private final HouseholdGoodsStoreRepository repo;

    public HouseholdGoodsStoreController(HouseholdGoodsStoreRepository repo) {
        this.repo = repo;
    }

    @GetMapping("/all")
    public String showAll(Model model) {
        Iterable<HouseholdGoodsStore> all = repo.findAll();
        model.addAttribute("xojalik",all);
        return "/catalog/card/cards_xozmag";
    }
}
