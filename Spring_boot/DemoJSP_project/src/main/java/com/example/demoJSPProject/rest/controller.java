package com.example.demoJSPProject.rest;

import com.example.demoJSPProject.dao.Studentdao;

import com.example.demoJSPProject.entity.Student;
import com.example.demoJSPProject.service.StudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api")
public class controller  {
private StudentService studentService;
@Autowired
    public controller(StudentService studentService) {
        this.studentService = studentService;
    }
    @PostMapping ("/students")
    public void saveDeatiulsInTable(Student student){
    studentService.insertdata(student);

}




}
