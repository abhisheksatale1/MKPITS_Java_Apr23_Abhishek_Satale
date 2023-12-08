package com.example.StudentManagementCrudOperation.Dao;

import com.example.StudentManagementCrudOperation.EntityClass.Student;

import org.springframework.data.jpa.repository.JpaRepository;


public interface StudentDao extends JpaRepository <Student, Integer>{

}
