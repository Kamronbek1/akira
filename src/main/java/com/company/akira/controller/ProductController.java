package com.company.akira.controller;

import com.company.akira.model.Product;
import com.company.akira.repository.ProductRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class ProductController {
    @Autowired
    ProductRepository productRepo;

    @GetMapping("/products")
    public String getProducts(Model model){
        Iterable<Product> products = productRepo.findAll();
        model.addAttribute("products", products);
        return "card";

    }
}
