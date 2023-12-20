package com.example.Springbootadvancemappingpratice.StudentRepository;

import com.example.Springbootadvancemappingpratice.Entity.Student;
import org.springframework.data.jpa.repository.JpaRepository;

public interface Student_repository extends JpaRepository<Student, Integer> {

}
