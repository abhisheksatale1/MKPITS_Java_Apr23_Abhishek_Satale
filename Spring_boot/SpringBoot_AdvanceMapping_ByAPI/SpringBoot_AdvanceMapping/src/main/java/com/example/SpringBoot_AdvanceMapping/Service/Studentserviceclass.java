package com.example.SpringBoot_AdvanceMapping.Service;

import com.example.SpringBoot_AdvanceMapping.Entity.Student;
import com.example.SpringBoot_AdvanceMapping.Studentrepository.Student_repository;
import jakarta.transaction.Transactional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class Studentserviceclass implements StudentService{

    private Student_repository studentRepository;
    @Autowired
    public Studentserviceclass(Student_repository studentRepository) {
        this.studentRepository = studentRepository;
    }
    @Override
    @Transactional
    public Student save(Student student) {
        return  studentRepository.save(student);

    }

    @Override
    public Student find(Integer rollno) {
        return studentRepository.findById(rollno).get();
    }
}
