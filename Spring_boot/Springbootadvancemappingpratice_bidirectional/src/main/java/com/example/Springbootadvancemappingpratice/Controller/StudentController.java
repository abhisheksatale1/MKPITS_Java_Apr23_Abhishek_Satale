package com.example.Springbootadvancemappingpratice.Controller;

import com.example.Springbootadvancemappingpratice.Entity.Student;
import com.example.Springbootadvancemappingpratice.Service.Student_Service;
import com.example.Springbootadvancemappingpratice.StudentRepository.Student_repository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class StudentController {
    private Student_Service studentService;
    @Autowired
    public StudentController(Student_Service studentService) {

        this.studentService = studentService;
    }
    @PostMapping("/studentinfo")
    public Student save(@RequestBody Student student){

        return studentService.save(student);
    }

    @GetMapping("/findbystudentid/{rollno}")
    public Student findbyid(@PathVariable  int rollno){

        return studentService.findbyid(rollno);
    }
    @GetMapping("/findall")
        public List<Student> findall(){

        return studentService.findall();
    }
    @GetMapping("/deletebystudentid/{rollno}")
    public void deletebyid(@PathVariable int rollno){

         studentService.deletebyid(rollno);
    }

}
