package com.example.demoJSPProject.service;

import com.example.demoJSPProject.dao.Studentdao;
import com.example.demoJSPProject.entity.Student;
import jakarta.transaction.Transactional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class StudentServiceImplementation implements StudentService {

    private Studentdao studentdao;
@Autowired
    public StudentServiceImplementation(Studentdao studentdao) {
        this.studentdao = studentdao;
    }

    @Override
    @Transactional
    public String insertdata(Student student) {
    studentdao.insertdata(student);
      return "Data inserted ...!!!";
    }
}
