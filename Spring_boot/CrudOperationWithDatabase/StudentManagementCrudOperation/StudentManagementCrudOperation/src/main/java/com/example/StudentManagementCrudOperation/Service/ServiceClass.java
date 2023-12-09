package com.example.StudentManagementCrudOperation.Service;

import com.example.StudentManagementCrudOperation.Dao.StudentDao;
import com.example.StudentManagementCrudOperation.EntityClass.Student;
import org.springframework.web.bind.annotation.RequestAttribute;

public interface ServiceClass {

String InventoryItembyId(Student thestudent);

}
