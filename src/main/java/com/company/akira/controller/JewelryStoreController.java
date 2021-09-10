package com.company.akira.controller;

import com.company.akira.model.JewelryStore;
import com.company.akira.repository.JewelryStoreRepository;
import com.company.akira.utl.Const;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.multipart.MultipartFile;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

@Controller
@RequestMapping("/catalog/zargarlik")
public class JewelryStoreController {


    private final JewelryStoreRepository repo;

    public JewelryStoreController(JewelryStoreRepository repo) {
        this.repo = repo;
    }

    @GetMapping("/all")
    public String showAll(Model model) {
        Iterable<JewelryStore> all = repo.findAll();
        model.addAttribute("zargarlik",all);
        return "/catalog/card/cards_zargarlik";
    }
    @GetMapping("/add")
    public String add(Model model) {
        model.addAttribute("zargarlik", new JewelryStore());
        return "/catalog/post/zargarlik";
    }

    @PostMapping("/post")
    public String submitForm(@RequestParam("file") MultipartFile file,
                             RedirectAttributes redirectAttributes,
                             @ModelAttribute("zargarlik") JewelryStore service) {
        if (file.isEmpty()) {
            redirectAttributes.addFlashAttribute("message", "Please select a file to upload");
            return "redirect:uploadStatus";
        }

        try {
            // Get the file and save it somewhere
            byte[] bytes = file.getBytes();

            Path path = Paths.get(Const.UPLOAD_PATH + file.getOriginalFilename());
            service.setImageUrl("/images/" + file.getOriginalFilename());
            Files.write(path, bytes);
            redirectAttributes.addFlashAttribute("message",
                    "You successfully uploaded '" + file.getOriginalFilename() + "'");
        } catch (IOException e) {
            e.printStackTrace();
        }
        repo.save(service);
        return "redirect:/uploadStatus";
    }
}
