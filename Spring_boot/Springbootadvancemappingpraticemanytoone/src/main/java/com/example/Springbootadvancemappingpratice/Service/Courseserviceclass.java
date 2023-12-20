package com.example.Springbootadvancemappingpratice.Service;


import com.example.Springbootadvancemappingpratice.StudentRepository.Course_repository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class Courseserviceclass implements CourseService {
    private Course_repository courseRepository;
    @Autowired
    public Courseserviceclass(Course_repository courseRepository) {
        this.courseRepository = courseRepository;
    }



}
