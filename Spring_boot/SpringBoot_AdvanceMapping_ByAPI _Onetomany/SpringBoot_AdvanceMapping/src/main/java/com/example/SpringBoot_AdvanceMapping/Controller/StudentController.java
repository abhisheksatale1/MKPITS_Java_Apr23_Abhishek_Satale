package com.example.SpringBoot_AdvanceMapping.Controller;


import com.example.SpringBoot_AdvanceMapping.Entity.Student;
import com.example.SpringBoot_AdvanceMapping.Service.Studentserviceclass;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class StudentController {
    private Studentserviceclass studentserviceclass;
    @Autowired
    public StudentController(Studentserviceclass studentserviceclass) {
        this.studentserviceclass = studentserviceclass;
    }
    @GetMapping("/Student")
    public Student save(@RequestBody Student student){
//        Address address = new Address("new nanded", "Nashik");
//        Student student = new Student(12,"abhi",address);
        return studentserviceclass.save(student);

    }
}
