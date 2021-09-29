package com.company.akira.controller;

import com.company.akira.model.AutoService;
import com.company.akira.repository.AutoServiceRepository;
import com.company.akira.utl.Const;
import com.company.akira.utl.Utils;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.multipart.MultipartFile;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

import javax.rmi.CORBA.Util;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

@Controller
@RequestMapping("/catalog/avtoservice")
public class AutoServiceController {


    private final AutoServiceRepository repo;

    public AutoServiceController(AutoServiceRepository repo) {
        this.repo = repo;
    }

    @GetMapping("/all")
    public String showAll(Model model) {
        Iterable<AutoService> all = repo.findAll();
        model.addAttribute("avtoservice",all);
        return "catalog/card/cards_avtoservice";
    }


    @GetMapping("/add")
    public String add(Model model) {
        model.addAttribute("avtoservice", new AutoService());
        return "catalog/post/autoservice";
    }

    @PostMapping("/post")
    public String submitForm(@RequestParam("file") MultipartFile file,
                             RedirectAttributes redirectAttributes,
                             @ModelAttribute("avtoservice") AutoService service) {
        if (file.isEmpty()) {
            redirectAttributes.addFlashAttribute("message", "Please select a file to upload");
            return "redirect:uploadStatus";
        }

        try {
            /*// Get the file and save it somewhere
            byte[] bytes = file.getBytes();

            Path path = Paths.get(Const.UPLOAD_PATH + file.getOriginalFilename());
            service.setImageUrl("/images/"+file.getOriginalFilename());
            Files.write(path, bytes);*/
            Utils.saveImage(file,service);
            redirectAttributes.addFlashAttribute("message",
                    "You successfully uploaded '" + file.getOriginalFilename() + "'");
        } catch (IOException e) {
            e.printStackTrace();
        }
        repo.save(service);
        return "redirect:/uploadStatus";
//     return Utils.downloadImage(file,redirectAttributes,service);
    }
}
