package com.example.Demophotosave.Controller;

import com.example.Demophotosave.Entity.Image;
import com.example.Demophotosave.Repository.ImageRepository;
import com.example.Demophotosave.Service.ImageService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.multipart.MultipartFile;

import java.io.IOException;

@Controller
public class ImageController {

    @Autowired
    private ImageRepository imageRepository;

    @GetMapping("/upload")
    public String showUploadForm() {
        return "Image_upload";
    }

    @PostMapping("/upload")
    public String handleFileUpload(@RequestParam("file") MultipartFile file, @RequestParam("name") String name) {
        try {
            Image image = new Image();
            image.setImageName(name);
            image.setImageData(file.getBytes());
            imageRepository.save(image);
            return "redirect:/Image_List?success";
        } catch (Exception e) {
            return "redirect:/Image_upload?error";
        }
    }

    @GetMapping("/Image_List")
    public String listImages(Model model) {
        model.addAttribute("images", imageRepository.findAll());
        return "Image_List";
    }
}
