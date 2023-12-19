package com.example.Springbootadvancemappingpratice.Service;

import com.example.Springbootadvancemappingpratice.Entity.Student;
import com.example.Springbootadvancemappingpratice.StudentRepository.Student_repository;
import jakarta.persistence.criteria.CriteriaBuilder;
import jakarta.transaction.Transactional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class Studentserviceclass implements Student_Service {

    private Student_repository studentRepository;
    @Autowired
    public Studentserviceclass(Student_repository studentRepository) {
        this.studentRepository = studentRepository;
    }


    @Override
    @Transactional
    public Student save(Student student) {
        return studentRepository.save(student);
    }

    @Override
    public Student findbyid(Integer rollno) {
        return studentRepository.findById(rollno).get();
    }

    @Override
    public List<Student> findall() {
        return studentRepository.findAll();
    }

    @Override
    public void deletebyid(Integer rollno) {
        studentRepository.deleteById(rollno);
    }


}
