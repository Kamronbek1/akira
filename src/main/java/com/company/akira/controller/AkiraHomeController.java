/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.company.akira.controller;

import com.company.akira.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
//@RequestMapping("/catalog0")
public class AkiraHomeController {

    private final UserRepository userRepo;

    public AkiraHomeController(UserRepository userRepo) {
        this.userRepo = userRepo;
    }

    @GetMapping("/home")
    public String index() {
        /*User user = new User();
        user.setUsername("admin");
        user.setPassword("@admin");
        user.setActive(true);
        user.setRoles(Collections.singleton(Role.ADMIN));
        userRepo.save(user);*/
        return "index";
    }

    /*@GetMapping("/{link}")
    public String link(@PathVariable("link") String link) {
        return String.format("/catalog/card/cards_%s", link);
    }*/
}
