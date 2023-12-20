package com.example.Springbootadvancemappingpratice.Service;

import com.example.Springbootadvancemappingpratice.Entity.Student;
import com.example.Springbootadvancemappingpratice.StudentRepository.Student_repository;
import jakarta.persistence.criteria.CriteriaBuilder;
import jakarta.transaction.Transactional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class Studentserviceclass implements Student_Service {

    private Student_repository studentRepository;
    @Autowired
    public Studentserviceclass(Student_repository studentRepository) {
        this.studentRepository = studentRepository;
    }


    @Override
    @Transactional
    public Student save(Student student) {
        return studentRepository.save(student);
    }

    @Override
    public Student findbyid(Integer rollno) {
        return studentRepository.findById(rollno).get();
    }

    @Override
    public List<Student> findall() {
        return studentRepository.findAll();
    }

    @Override
    public void deletebyid(Integer rollno) {
        studentRepository.deleteById(rollno);
    }

    @Override
    @Transactional
    public Student updatebyid(Student student) {
        Optional<Student> optionalStudent= studentRepository.findById(student.getRollno());
       if(optionalStudent.isPresent()){
           studentRepository.save(student);
       }else {
           System.out.println("Data is not fatched");
       }

      return student;
    }

    @Override
    @Transactional
    public Student updatemultiplerecord(Student student) {
        List<Student> list = studentRepository.findAll();

        return null;
    }
//------------------------one to many------------------------------------------
    @Override
    @Transactional
    public String savecourse(Student student) {
        studentRepository.save(student);
        return "record inserted";
    }

    @Override
    public List<Student> findallcourse() {
        return studentRepository.findAll();
    }


}
