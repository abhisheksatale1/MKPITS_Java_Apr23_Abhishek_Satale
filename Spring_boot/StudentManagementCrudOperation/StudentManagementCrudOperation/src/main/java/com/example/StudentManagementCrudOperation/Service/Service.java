package com.example.StudentManagementCrudOperation.Service;

import com.example.StudentManagementCrudOperation.Dao.StudentDao;
import com.example.StudentManagementCrudOperation.EntityClass.Student;
@org.springframework.stereotype.Service
public class Service implements ServiceClass{
    private StudentDao studentDao;

    public Service(StudentDao studentDao) {
        this.studentDao = studentDao;
    }

    @Override
    public String InventoryItembyId(Student thestudent) {
        studentDao.save(thestudent);
        return "Insert";
    }
}
