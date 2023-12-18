package com.example.SpringBoot_AdvanceMapping.Controller;

import com.example.SpringBoot_AdvanceMapping.Entity.Address;
import com.example.SpringBoot_AdvanceMapping.Entity.Student;
import com.example.SpringBoot_AdvanceMapping.Service.Addressserviceclass;
import com.example.SpringBoot_AdvanceMapping.Service.Studentserviceclass;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
public class StudentController {
    private Studentserviceclass studentserviceclass;
    @Autowired
    public StudentController(Studentserviceclass studentserviceclass) {
        this.studentserviceclass = studentserviceclass;
    }
    @PostMapping("/Studentinfo")
    public Student save(@RequestBody Student student){
        return studentserviceclass.save(student);

    }
    @GetMapping("/findinformation/{rollno}")
    public Student find(@PathVariable int rollno){

        return studentserviceclass.find(rollno);
    }

}
