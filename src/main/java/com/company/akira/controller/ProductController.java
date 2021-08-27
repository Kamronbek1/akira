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
        return "cards";
    }
    @GetMapping("/gen")
    public String generate(){
        Product product2 = new Product("Apteka-2" ,"/images/apteka2.jpg","+998(94) 666 06 66","Uzbekistan, Tashkent, Feruza Street, 3","https://yandex.uz/map-widget/v1/-/CCUmQ2RSSC");
        Product product1 = new Product("Apteka-1" ,"/images/apteka1.jpg","+998(97)255 25 25","Uzbekistan, Tashkent, Feruza Street, 15","https://yandex.uz/map-widget/v1/-/CCUmQ2VsSA");
        Product product3 = new Product("Apteka-3" ,"/images/apteka3.jpg","+998(93) 330 33 03","Uzbekistan, Tashkent, Feruza Street, 9","https://yandex.uz/map-widget/v1/-/CCUmQ2VsSA");
        Product product4 = new Product("Apteka-4" ,"/images/apteka4.jpg","+998(99) 889 99 39","Uzbekistan, Tashkent, Feruza Street, 2","https://yandex.uz/map-widget/v1/-/CCUmQ2VsSA");
        Product product5 = new Product("Apteka-5" ,"/images/apteka5.jpg","+998(93) 256 56 46","Uzbekistan, Tashkent, Feruza Street, 5","https://yandex.uz/map-widget/v1/-/CCUmUAQVXA");
        Product product6 = new Product("Apteka-6" ,"/images/apteka6.jpg","+998(91) 330 45 15","Uzbekistan, Tashkent, Feruza Street, 8","https://yandex.uz/map-widget/v1/-/CCUmQ2VsSA");
        productRepo.save(product1);
        productRepo.save(product2);
        productRepo.save(product3);
        productRepo.save(product4);
        productRepo.save(product5);
        productRepo.save(product6);
        return "index";
    }
}
