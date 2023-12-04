package com.example.demoJSPProject.dao;


import com.example.demoJSPProject.entity.Student;
import jakarta.persistence.EntityManager;
import jakarta.transaction.Transactional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

@Repository

public class Student_implimentation implements Studentdao {
    private EntityManager entityManager;
@Autowired
    public Student_implimentation(EntityManager entityManager) {
        this.entityManager = entityManager;
    }

    @Override
    @Transactional
    public String insertdata(Student student) {
     entityManager.persist(student);
    return "inserted";
    }
}
