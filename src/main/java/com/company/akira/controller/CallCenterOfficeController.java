package com.company.akira.controller;

import com.company.akira.model.Actor;
import com.company.akira.model.AutoService;
import com.company.akira.model.CallCenterOffice;
import com.company.akira.repository.ActorRepository;
import com.company.akira.repository.CallCenterOfficeRepository;
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
@RequestMapping("/catalog/call-center")
public class CallCenterOfficeController {


    private final CallCenterOfficeRepository repo;

    public CallCenterOfficeController(CallCenterOfficeRepository repo) {
        this.repo = repo;
    }

    @GetMapping("/all")
    public String showAll(Model model) {
        Iterable<CallCenterOffice> all = repo.findAll();
        model.addAttribute("aloqa",all);
        return "/catalog/card/cards_svyazofis";
    }
    @GetMapping("/add")
    public String add(Model model) {
        model.addAttribute("aloqa", new CallCenterOffice());
        return "/catalog/post/svyazoffice";
    }

    @PostMapping("/post")
    public String submitForm(@RequestParam("file") MultipartFile file,
                             RedirectAttributes redirectAttributes,
                             @ModelAttribute("aloqa") CallCenterOffice office) {
        if (file.isEmpty()) {
            redirectAttributes.addFlashAttribute("message", "Please select a file to upload");
            return "redirect:uploadStatus";
        }

        try {
            // Get the file and save it somewhere
            byte[] bytes = file.getBytes();

            Path path = Paths.get(Const.UPLOAD_PATH + file.getOriginalFilename());
            office.setImageUrl("/images/"+file.getOriginalFilename());
            Files.write(path, bytes);
            redirectAttributes.addFlashAttribute("message",
                    "You successfully uploaded '" + file.getOriginalFilename() + "'");
        } catch (IOException e) {
            e.printStackTrace();
        }
        repo.save(office);
        return "redirect:/uploadStatus";
    }
}
