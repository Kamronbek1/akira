package com.company.akira.controller;

import com.company.akira.model.Category;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

public abstract class AbstractRestController<T extends Category, R extends CrudRepository<T, ?>> {

    protected R repo;

    public AbstractRestController(R repo) {
        this.repo = repo;
    }

    @GetMapping("/add/{name}")
    public String add(@PathVariable("name") String name, Model model) {
        Iterable<T> all = repo.findAll();
        model.addAttribute("products", all);
        return name.trim().equals("") ? "index" : name;
    }
    @GetMapping("/catalog/{name}")
    public String getCategory(@PathVariable("name") String name,Model model){
        System.out.println("boo ");
        Iterable<T> all = repo.findAll();
        model.addAttribute("products", all);
        return name.trim().equals("") ? "index" : String.format("/catalog/card/cards_%s",name);
    }

    @PostMapping
    public T add(@ModelAttribute T obj) {
        return repo.save(obj);
    }
}
