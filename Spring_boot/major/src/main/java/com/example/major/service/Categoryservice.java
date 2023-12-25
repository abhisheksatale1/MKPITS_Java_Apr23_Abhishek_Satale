package com.example.major.service;

import com.example.major.model.Category;
import com.example.major.repository.CategoryRepository;
import jakarta.transaction.Transactional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class Categoryservice {
  private  CategoryRepository categoryRepository;
    @Autowired

    public Categoryservice(CategoryRepository categoryRepository) {
        this.categoryRepository = categoryRepository;
    }

    public List<Category> getAllCategory(){
        return categoryRepository.findAll();
    }
    @Transactional
    public void addCategory(Category category){
        categoryRepository.save(category);
    }
    @Transactional
    public void removeCategoryBYId(int id){
        categoryRepository.deleteById(id);
    }
    public Optional<Category> getCategoryById(int id){
        return categoryRepository.findById(id);
    }

}
