package com.example.demoHETEOAS_Datarest.controller;

import com.example.demoHETEOAS_Datarest.Entitiy.Student;
import jakarta.servlet.http.HttpServletRequest;
import org.hibernate.annotations.Target;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

@Controller
public class RestController {
    @GetMapping("/studform")
   public String myform(Model model){
        Student student = new Student();
        model.addAttribute("stud",student);
        return "infoform";
    }
    @PostMapping("/processstudform")
    public String proessform(@ModelAttribute("stud") Student theStudent ){
        return "Display";
    }

//    public String display(Model model ){
//        model.addAttribute("name","Abhishek");
//        return "hello";
//    }
//
//        @RequestMapping("/second")
//        public String displayform(){
//            return "Infoform";
//
//
//    }
//    @RequestMapping("/process")
//    //--------------------------------by using RequestParam-----------------------------
//    public String processform(@RequestParam String rollno,
//                              @RequestParam String name,
//                              @RequestParam String address,
//                              @RequestParam String city, Model model ){
//        //-------------------------------------------------------------------------------------//
//        // by using Servlet
//        // (httpRequestServlet requestservlet,model model)
////        String rollno= request.getParameter("rollno");
////        String name=   request.getParameter("name");
////        String address=request.getParameter("address");
////        String city= request.getParameter("city");
//
//
//
//        model.addAttribute("rn",rollno);
//        model.addAttribute("nm",name);
//        model.addAttribute("add",address);
//        model.addAttribute("ct",city);
//        return "Display";
//    }

}
