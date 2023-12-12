package com.example.StudentManagementCrudOperation.Controller;

import com.example.StudentManagementCrudOperation.EntityClass.Student;
import com.example.StudentManagementCrudOperation.Service.ServiceClass;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.web.PageableDefault;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.*;

import java.security.PublicKey;
import java.util.List;

@Controller
public class StudentRestController {

    private ServiceClass serviceClass;
@Autowired
    public StudentRestController(ServiceClass serviceClass) {
        this.serviceClass = serviceClass;
    }

    @GetMapping("/getdata")
    public String showAllData(Model model) {
        List<Student> list = serviceClass.getalldata();
        model.addAttribute("student", list);
        return "Display";
    }
    @GetMapping("/form")
    public String insertData( Model model){
        Student student= new Student();
        model.addAttribute("stud",student);
        return "Studentform";
    }
    @PostMapping ("/processstudform")
    public String displayInserteData(@ModelAttribute("stud") Student thestudent){
    //--converting string into integer for exception handling//
//    Integer.parseInt(thestudent.getName());
        serviceClass.InventoryItembyId(thestudent);
    return "redirect:/getdata";

    }
    //------------------------------------------------Update-------------
    @GetMapping("/updateStudent")
    public String update(@RequestParam("rollno") int roll_no, Model model){
    Student student= serviceClass.updateRecord(roll_no);
    model.addAttribute("stud",student);
    return "Studentform";
    }
//--------------------------------delete-----------------
    @GetMapping("/deleteStudent")
    public String delete(@RequestParam("rollno") int roll_no){
    serviceClass.deleteRecord(roll_no);
    return "redirect:/getdata";
    }
    @ExceptionHandler(value = NumberFormatException.class)
    public String Exception(){
    return "errorpage";

    }
    @GetMapping("/pagenation")
    public String pagination(@PageableDefault(size = 5)Pageable pageable, Model model){
        Page<Student> studentPage=serviceClass.getPage(pageable);
        model.addAttribute("page",studentPage);
        return "pagination";
    }
    }

