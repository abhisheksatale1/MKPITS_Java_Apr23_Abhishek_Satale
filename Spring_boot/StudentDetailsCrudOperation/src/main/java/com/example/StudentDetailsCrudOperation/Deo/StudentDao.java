package com.example.StudentDetailsCrudOperation.Deo;

import com.example.StudentDetailsCrudOperation.Entity.Student;
import org.springframework.data.jpa.repository.JpaRepository;

public interface StudentDao extends JpaRepository<Student, Integer> {

}
