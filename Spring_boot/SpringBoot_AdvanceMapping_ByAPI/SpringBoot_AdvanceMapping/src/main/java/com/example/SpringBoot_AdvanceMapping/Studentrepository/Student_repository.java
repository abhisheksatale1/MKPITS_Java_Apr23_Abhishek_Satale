package com.example.SpringBoot_AdvanceMapping.Studentrepository;

import com.example.SpringBoot_AdvanceMapping.Entity.Student;
import org.springframework.data.jpa.repository.JpaRepository;

public interface Student_repository extends JpaRepository<Student, Integer> {


}
