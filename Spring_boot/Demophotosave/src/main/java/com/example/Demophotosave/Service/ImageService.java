package com.example.Demophotosave.Service;

import com.example.Demophotosave.Entity.Image;
import com.example.Demophotosave.Repository.ImageRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ImageService {
    @Autowired
    private ImageRepository imageRepository;

    public void saveImage(Image image){
        imageRepository.save(image);
    }
    public Image getImageById(Long id){
        return imageRepository.findById(id).orElse(null);

    }
}
