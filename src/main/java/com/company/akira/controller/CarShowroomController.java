package com.company.akira.controller;

import com.company.akira.model.Actor;
import com.company.akira.model.AutoService;
import com.company.akira.model.CarShowroom;
import com.company.akira.repository.ActorRepository;
import com.company.akira.repository.CarShowroomRepository;
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
@RequestMapping("/catalog/avtosalon")
public class CarShowroomController {


    private final CarShowroomRepository repo;

    public CarShowroomController(CarShowroomRepository repo) {
        this.repo = repo;
    }

    @GetMapping("/all")
    public String showAll(Model model) {
        Iterable<CarShowroom> all = repo.findAll();
        model.addAttribute("avtosalon",all);
        return "/catalog/card/cards_avtosalon";
    }
    @GetMapping("/add")
    public String add(Model model) {
        model.addAttribute("avtosalon", new CarShowroom());
        return "/catalog/post/autosalon";
    }

    @PostMapping("/post")
    public String submitForm(@RequestParam("file") MultipartFile file,
                             RedirectAttributes redirectAttributes,
                             @ModelAttribute("avtosalon") CarShowroom carShowroom) {
        if (file.isEmpty()) {
            redirectAttributes.addFlashAttribute("message", "Please select a file to upload");
            return "redirect:uploadStatus";
        }

        try {
            // Get the file and save it somewhere
            byte[] bytes = file.getBytes();

            Path path = Paths.get(Const.UPLOAD_PATH + file.getOriginalFilename());
            carShowroom.setImageUrl("/images/"+file.getOriginalFilename());
            Files.write(path, bytes);
            redirectAttributes.addFlashAttribute("message",
                    "You successfully uploaded '" + file.getOriginalFilename() + "'");
        } catch (IOException e) {
            e.printStackTrace();
        }
        repo.save(carShowroom);
        return "redirect:/uploadStatus";
    }
}
