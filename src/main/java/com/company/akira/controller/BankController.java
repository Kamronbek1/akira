package com.company.akira.controller;

import com.company.akira.model.AutoService;
import com.company.akira.model.Bank;
import com.company.akira.repository.BankRepository;
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
@RequestMapping("/catalog/bank")
public class BankController {


    private final BankRepository repo;

    public BankController(BankRepository repo) {
        this.repo = repo;
    }

    @GetMapping("/all")
    public String showAll(Model model) {
        Iterable<Bank> all = repo.findAll();
        model.addAttribute("bank", all);
        return "catalog/card/cards_bank";
    }
    @GetMapping("/add")
    public String add(Model model) {
        model.addAttribute("bank", new Bank());
        return "catalog/post/bank";
    }

    @PostMapping("/post")
    public String submitForm(@RequestParam("file") MultipartFile file,
                             RedirectAttributes redirectAttributes,
                             @ModelAttribute("bank") Bank bank) {
        if (file.isEmpty()) {
            redirectAttributes.addFlashAttribute("message", "Please select a file to upload");
            return "redirect:uploadStatus";
        }

        try {
            // Get the file and save it somewhere
            byte[] bytes = file.getBytes();

            Path path = Paths.get(Const.UPLOAD_PATH + file.getOriginalFilename());
            bank.setImageUrl("/images/"+file.getOriginalFilename());
            Files.write(path, bytes);
            redirectAttributes.addFlashAttribute("message",
                    "You successfully uploaded '" + file.getOriginalFilename() + "'");
        } catch (IOException e) {
            e.printStackTrace();
        }
        repo.save(bank);
        return "redirect:/uploadStatus";
    }
}
