package com.example.demoHETEOAS_Datarest.controller;

import jakarta.servlet.http.HttpServletRequest;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

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
    //--------------------------------by using RequestParam-----------------------------
    public String processform(@RequestParam String rollno,
                              @RequestParam String name,
                              @RequestParam String address,
                              @RequestParam String city, Model model ){
        //-------------------------------------------------------------------------------------//
        // by using Servlet
        // (httpRequestServlet requestservlet,model model)
//        String rollno= request.getParameter("rollno");
//        String name=   request.getParameter("name");
//        String address=request.getParameter("address");
//        String city= request.getParameter("city");



        model.addAttribute("rn",rollno);
        model.addAttribute("nm",name);
        model.addAttribute("add",address);
        model.addAttribute("ct",city);
        return "Display";
    }

}
