package com.example.StudentDetailsCrudOperation.Controller;

import com.example.StudentDetailsCrudOperation.Deo.StudentDao;
import com.example.StudentDetailsCrudOperation.Entity.Student;
import com.example.StudentDetailsCrudOperation.Service.ServiceClass;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
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
public String showAllData(Model model){
    Student student = new Student();
    model.addAttribute("stud",student);
return "Studentform";
}
@PostMapping("/processstudform")
    public String Displayinsertdata(@ModelAttribute("stud")Student thestudent){
        serviceClass.InventoryItembyId(thestudent);
        return"redirect:getdata";
}
}
