package com.example.StudentManagementCrudOperation.Controller;

import com.example.StudentManagementCrudOperation.EntityClass.Student;
import com.example.StudentManagementCrudOperation.Service.ServiceClass;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

@Controller
public class StudentRestController {

    private ServiceClass serviceClass;
@Autowired
    public StudentRestController(ServiceClass serviceClass) {
        this.serviceClass = serviceClass;
    }

    @GetMapping("/form")
    public String insertData( Model model){
        Student student= new Student();
        model.addAttribute("stud",student);
        return "Studentform";
    }
    @PostMapping ("/processstudform")
    public String showData(@ModelAttribute("stud") Student thestudent, BindingResult bindingResult){
    return"Display";

    }
}
