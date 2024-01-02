package com.example.demostudentchecklogin.Controller;

import com.example.demostudentchecklogin.Entity.Student;
import com.example.demostudentchecklogin.Entity.User;
import com.example.demostudentchecklogin.Service.StudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.Optional;

@Controller
//@RequestMapping("/users")
public class UserController {
    private StudentService studentService;
    @Autowired
    public UserController(StudentService studentService) {
        this.studentService = studentService;
    }
    @GetMapping("/login")
    public String showLoginForm(Model model) {
        model.addAttribute("user", new User());
        return "login";
    }

    @PostMapping("/login")
    public String login(@ModelAttribute("user") User user, Model model) {
        Optional<Student> existingStudent = studentService.findByUsername(user.getUsername());

        if (existingStudent.isPresent() && existingStudent.get().getPassword().equals(user.getPassword())) {
            return "redirect:/home";
        } else {
            model.addAttribute("error", "Invalid_credentials");
            return "error";
        }
    }

}
