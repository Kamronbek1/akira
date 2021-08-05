/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.company.akira.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class AkiraHelloController {
    @GetMapping("/")
    public String index(@RequestParam(value="name",defaultValue="world")
    String name){
        return String.format("Hello %s!",name);
    }
}
