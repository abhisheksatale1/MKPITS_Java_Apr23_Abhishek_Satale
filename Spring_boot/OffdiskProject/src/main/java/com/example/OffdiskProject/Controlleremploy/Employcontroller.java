package com.example.OffdiskProject.Controlleremploy;

import com.example.OffdiskProject.Entity.Employeedetails;
import com.example.OffdiskProject.Service.EmployServiceInt;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;

@Controller
public class Employcontroller {
    private EmployServiceInt employServiceInt;
    @Autowired
    public Employcontroller(EmployServiceInt employServiceInt) {
        this.employServiceInt = employServiceInt;
    }

    @GetMapping("/form")
    public String insertdata(Model model){
        Employeedetails employeeDetails= new Employeedetails();
        model.addAttribute("employ",employeeDetails);
        return "Employ_details";
    }
    @PostMapping("/processform")
    public String displayinsertData(@ModelAttribute Employeedetails theemploydetails){
        System.out.println(theemploydetails.getUser_name());
        employServiceInt.save(theemploydetails);
        return "Display";

    }
    @GetMapping("/findbyid/{rollno,password}")
    public Employeedetails findbyiddata(@PathVariable int userid, int password){

    return employServiceInt.findbyid(userid,password);

    }
}
