package com.company.akira.controller;

import com.company.akira.model.Actor;
import com.company.akira.model.AutoTuning;
import com.company.akira.repository.ActorRepository;
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
@RequestMapping("/catalog/artist")
public class ActorController {

    private final ActorRepository repo;

    public ActorController(ActorRepository repo) {
        this.repo = repo;
    }

    @GetMapping("/all")
    public String showAll(Model model) {
        Iterable<Actor> all = repo.findAll();
        model.addAttribute("actor",all);
        return "catalog/card/cards_artist";
    }
    @GetMapping("/add")
    public String add(Model model) {
        model.addAttribute("actor", new Actor());
        return "catalog/post/artist";
    }

    @PostMapping("/post")
    public String submitForm(@RequestParam("file") MultipartFile file,
                             RedirectAttributes redirectAttributes,
                             @ModelAttribute("actor") Actor actor) {
        if (file.isEmpty()) {
            redirectAttributes.addFlashAttribute("message", "Please select a file to upload");
            return "redirect:uploadStatus";
        }

        try {
            // Get the file and save it somewhere
         Utils.saveImage(file,service);
            redirectAttributes.addFlashAttribute("message",
                    "You successfully uploaded '" + file.getOriginalFilename() + "'");
        } catch (IOException e) {
            e.printStackTrace();
        }
        repo.save(actor);
        return "redirect:/uploadStatus";
    }
    @PutMapping(value = "/edit/{id}")
    public String edit(@PathVariable("id") Long id){
        return "";
    }

}
