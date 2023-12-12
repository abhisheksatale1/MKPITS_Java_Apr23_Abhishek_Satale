package com.example.StudentManagementCrudOperation.Service;

import com.example.StudentManagementCrudOperation.Dao.StudentDao;
import com.example.StudentManagementCrudOperation.EntityClass.Student;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.web.bind.annotation.RequestAttribute;

import java.util.List;
public interface ServiceClass {

String InventoryItembyId(Student thestudent);
    public List <Student> getalldata();

Student updateRecord(Integer rollno);

void deleteRecord(Integer rollno);

Page<Student> getPage(Pageable pageable);
}
