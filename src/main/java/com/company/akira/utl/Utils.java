package com.company.akira.utl;

import com.company.akira.model.Category;
import org.springframework.web.multipart.MultipartFile;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.UUID;
import java.util.logging.Level;
import java.util.logging.Logger;

public class Utils {
    public static <T extends Category> String downloadImage(MultipartFile file,
                                                            RedirectAttributes redirectAttributes, T t) {
        if (file.isEmpty()) {
            redirectAttributes.addFlashAttribute("message", "Please select a file to upload");
            return "redirect:uploadStatus";
        }

        try {
            // Get the file and save it somewhere
            byte[] bytes = file.getBytes();
            UUID uuid = UUID.randomUUID();
            StringBuilder var = new StringBuilder();
            var.append(Const.UPLOAD_PATH);
            var.append(uuid);
            var.append( file.getOriginalFilename());
            Path path = Paths.get(String.valueOf(var));
            t.setImageUrl("/images/"+uuid+file.getOriginalFilename());
            Files.write(path, bytes);
            redirectAttributes.addFlashAttribute("message",
                    "You successfully uploaded '" + file.getOriginalFilename() + "'");
        } catch (IOException e) {
            e.printStackTrace();
        }
        return "redirect:uploadStatus";
    }

    public static void saveImage(MultipartFile file,Category category) throws IOException {
        byte[] bytes = file.getBytes();
        UUID uuid = UUID.randomUUID();
        StringBuilder var = new StringBuilder();
        var.append(Const.UPLOAD_PATH);
        var.append(uuid);
        var.append( file.getOriginalFilename());
        Path path = Paths.get(String.valueOf(var));
        category.setImageUrl("/images/"+uuid+file.getOriginalFilename());
         Files.write(path, bytes);
        System.out.println("success");
    }
}
