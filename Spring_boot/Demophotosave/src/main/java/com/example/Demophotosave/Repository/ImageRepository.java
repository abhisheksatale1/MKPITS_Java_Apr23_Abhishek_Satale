package com.example.Demophotosave.Repository;

import com.example.Demophotosave.Entity.Image;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ImageRepository extends JpaRepository<Image, Long> {

}
