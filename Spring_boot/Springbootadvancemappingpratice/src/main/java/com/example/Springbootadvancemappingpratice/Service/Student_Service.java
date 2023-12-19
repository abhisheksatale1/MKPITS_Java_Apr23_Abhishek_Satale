package com.example.Springbootadvancemappingpratice.Service;

import com.example.Springbootadvancemappingpratice.Entity.Student;

import java.util.List;

public interface Student_Service {
    public Student save(Student student);

    public Student findbyid(Integer student);

    public List <Student> findall();

    public void deletebyid(Integer rollno);
}
