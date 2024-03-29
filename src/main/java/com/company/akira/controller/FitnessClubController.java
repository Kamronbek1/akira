package com.company.akira.controller;

import com.company.akira.model.FitnessClub;
import com.company.akira.repository.FitnessClubRepository;
import com.company.akira.utl.Utils;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.multipart.MultipartFile;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

import java.io.IOException;

@Controller
@RequestMapping("/catalog/fitnes-club")
public class FitnessClubController {
    private final FitnessClubRepository repo;

    public FitnessClubController(FitnessClubRepository repo) {
        this.repo = repo;
    }

    @GetMapping("/all")
    public String showAll(Model model) {
        Iterable<FitnessClub> all = repo.findAll();
        model.addAttribute("fitnes",all);
        return "catalog/card/cards_trenajor";
    }
    @GetMapping("/add")
    public String add(Model model) {
        model.addAttribute("fitnes", new FitnessClub());
        return "catalog/post/trenajor";
    }

    @PostMapping("/post")
    public String submitForm(@RequestParam("file") MultipartFile file,
                             RedirectAttributes redirectAttributes,
                             @ModelAttribute("fitnes") FitnessClub service) {
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
        FitnessClub save = repo.save(service);
        System.out.println(save);
        return "redirect:/uploadStatus";
    }
}
