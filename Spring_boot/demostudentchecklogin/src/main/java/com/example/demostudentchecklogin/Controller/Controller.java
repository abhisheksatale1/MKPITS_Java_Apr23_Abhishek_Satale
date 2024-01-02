package com.example.demostudentchecklogin.Controller;

import com.example.demostudentchecklogin.Entity.Student;
import com.example.demostudentchecklogin.Service.StudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
@org.springframework.stereotype.Controller
//@RequestMapping("/students")
public class Controller {

   private StudentService studentService;
    @Autowired
    public Controller(StudentService studentService) {
        this.studentService = studentService;
    }

    @GetMapping("/register")
    public String showRegistrationForm(Model model) {
        model.addAttribute("student", new Student());
        return "register";
    }

    @PostMapping("/register")
    public String registerStudent(@ModelAttribute("student") Student student) {
        studentService.registerStudent(student);
        return "redirect:/login";
    }

}
