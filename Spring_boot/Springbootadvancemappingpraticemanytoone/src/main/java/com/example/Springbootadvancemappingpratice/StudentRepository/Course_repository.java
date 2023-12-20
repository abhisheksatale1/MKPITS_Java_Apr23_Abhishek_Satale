package com.example.Springbootadvancemappingpratice.StudentRepository;

import com.example.Springbootadvancemappingpratice.Entity.Course;
import org.springframework.data.jpa.repository.JpaRepository;

public interface Course_repository extends JpaRepository<Course,Integer> {
}
