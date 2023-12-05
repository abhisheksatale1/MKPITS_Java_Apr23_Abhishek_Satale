package com.example.demoHETEOAS_Datarest.controller;

import jakarta.servlet.http.HttpServletRequest;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class RestController {
    @RequestMapping("/hello")
    public String display(Model model ){
        model.addAttribute("name","Abhishek");
        return "hello";
    }

        @RequestMapping("/second")
        public String displayform(){
            return "Infoform";


    }
    @RequestMapping("/process")
    public String processform(HttpServletRequest request, Model model ){
        String rollno= request.getParameter("rollno");
        String name=   request.getParameter("name");
        String address=request.getParameter("address");
        String city= request.getParameter("city");



        model.addAttribute("rn",rollno);
        model.addAttribute("nm",name);
        model.addAttribute("add",address);
        model.addAttribute("ct",city);
        return "Display";
    }

}
