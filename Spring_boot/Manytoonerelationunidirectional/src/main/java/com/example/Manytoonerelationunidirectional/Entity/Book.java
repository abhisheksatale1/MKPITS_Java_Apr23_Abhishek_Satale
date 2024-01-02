package com.example.Manytoonerelationunidirectional.Entity;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;

@Entity
public class Book {
    @Id
    private Long id;
    private String title;
    
}
