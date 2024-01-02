package com.example.demostudentchecklogin.Service;

import com.example.demostudentchecklogin.Entity.Student;
import com.example.demostudentchecklogin.Repository.StudentRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class StudentService {
    @Autowired
  private   StudentRepository studentRepository;

    public StudentService(StudentRepository studentRepository) {
        this.studentRepository = studentRepository;
    }

    public void registerStudent(Student student) {
        studentRepository.save(student);
    }
    public Optional<Student> findByUsername(String username) {
        return studentRepository.findByUsername(username);
    }
}
