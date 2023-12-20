package com.example.Springbootadvancemappingpratice.Controller;

import com.example.Springbootadvancemappingpratice.Entity.Address;
import com.example.Springbootadvancemappingpratice.Entity.Course;
import com.example.Springbootadvancemappingpratice.Entity.Student;
import com.example.Springbootadvancemappingpratice.Service.Student_Service;
import com.example.Springbootadvancemappingpratice.StudentRepository.Student_repository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;

@RestController
public class StudentController {
    private Student_Service studentService;
    @Autowired
    public StudentController(Student_Service studentService) {

        this.studentService = studentService;
    }
    @PostMapping("/studentinfo")
    public Student save(@RequestBody Student student){

        return studentService.save(student);
    }

    @GetMapping("/findbystudentid/{rollno}")
    public Student findbyid(@PathVariable  int rollno){

        return studentService.findbyid(rollno);
    }
    @GetMapping("/findall")
        public List<Student> findall(){

        return studentService.findall();
    }
    @GetMapping("/deletebystudentid/{rollno}")
    public void deletebyid(@PathVariable int rollno){

         studentService.deletebyid(rollno);
    }
    @PostMapping("/updatestudent")
    public Student update(@RequestBody Student student){

        return studentService.updatebyid(student);
    }
//------------------------------------------one to many mapping------------------------
    //------------------------------------save manually----------------
//    @PostMapping("/student")
//    public void saveStudent(){
//        Address address= new Address("Gadipura","nanded");
//        List<Course> courselist = new ArrayList<>();
//        Course courselist1 = new Course("Java");
//        Course courselist2= new Course("Pythan");
//        Course courselist3= new Course("Dotnet");
//        courselist.add(courselist1);
//        courselist.add(courselist2);
//        courselist.add(courselist3);
//        Student student = new Student("Abhishek",address,courselist);
//        student.setCourseList(courselist);
//        String string = studentService.savecourse(student);
//        System.out.println(string);
//    }
   // ______________________________________displaydata-------------------------
    //-------------------------------------Findall-----------------------
    @GetMapping("/Displaycourse")
    public List<Student> findallcourse(){
       return studentService.findallcourse();

    }
   // ---------------------- save by postman---------------------------
    @PostMapping("/savecoursedetails")
    public String savecouse(@RequestBody Student student){
        studentService.save(student);
        System.out.println(student);
        return "data inserted";
    }
}
