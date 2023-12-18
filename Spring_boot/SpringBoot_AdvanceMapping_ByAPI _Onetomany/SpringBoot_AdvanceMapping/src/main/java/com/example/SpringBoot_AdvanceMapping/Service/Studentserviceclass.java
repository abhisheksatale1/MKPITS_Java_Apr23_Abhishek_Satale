package com.example.SpringBoot_AdvanceMapping.Service;

import com.example.SpringBoot_AdvanceMapping.Entity.Student;
import com.example.SpringBoot_AdvanceMapping.Studentrepository.Student_repository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class Studentserviceclass implements StudentService{
    @Autowired
    private Student_repository studentRepository;

    public Studentserviceclass(Student_repository studentRepository) {
        this.studentRepository = studentRepository;
    }

    @Override
    public Student save(Student student) {


        return  studentRepository.save(student);

    }
}
