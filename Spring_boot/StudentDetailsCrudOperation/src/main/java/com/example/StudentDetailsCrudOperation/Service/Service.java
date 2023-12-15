package com.example.StudentDetailsCrudOperation.Service;

import com.example.StudentDetailsCrudOperation.Deo.StudentDao;
import com.example.StudentDetailsCrudOperation.Entity.Student;
import jakarta.transaction.Transactional;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;
@org.springframework.stereotype.Service

public class Service implements ServiceClass{
    @Autowired
private StudentDao studentDao;

    public Service(StudentDao studentDao) {
        this.studentDao = studentDao;
    }

    @Override
    @Transactional
    public String InventoryItembyId(Student  thestudent){
        return null;

}

    @Override
    public List<Student> getalldata() {
        return studentDao.findAll();
    }


}
