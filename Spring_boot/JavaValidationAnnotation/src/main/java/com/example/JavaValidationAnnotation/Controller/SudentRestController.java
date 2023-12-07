package com.example.JavaValidationAnnotation.Controller;

import com.example.JavaValidationAnnotation.EntityClass.Student;
import jakarta.validation.Valid;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

@Controller
public class SudentRestController {
@GetMapping("/studentform")
    public String Studentform(Model model){
    Student student = new Student();
    model.addAttribute("stud",student);
    return "StudentinfoForm";

}
@GetMapping("/processstudform")
    public String processform(@Valid @ModelAttribute("stud") Student thstudent, BindingResult bindingResult  ){
    if(bindingResult.hasErrors()){
        return "StudentinfoForm";
    }
else{
    return "Display";
    }
}


}
