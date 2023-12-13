package com.example.StudentManagementCrudOperation.Service;
import com.example.StudentManagementCrudOperation.Dao.StudentDao;
import com.example.StudentManagementCrudOperation.EntityClass.Student;
import jakarta.transaction.Transactional;
import org.springframework.beans.factory.annotation.Autowired;
import java.util.List;
import java.util.Optional;

@org.springframework.stereotype.Service
public class Service implements ServiceClass{
    private StudentDao studentDao;
    @Autowired
    public Service(StudentDao studentDao)
    {
        this.studentDao = studentDao;
    }
    @Override
    @Transactional
    public String InventoryItembyId(Student thestudent) {
    studentDao.save(thestudent);
        return "inserted";
    }
    @Override
    public List<Student> getalldata() {
        return studentDao.findAll();
    }

    @Override
    public Student updateRecord(Integer rollno) {
        Optional<Student> optionalStudent = studentDao.findById(rollno);
        return optionalStudent.get();
    }

    @Override
    public void  deleteRecord(Integer rollno) {
      Student student=studentDao.findById(rollno).get();
      studentDao.delete(student);
    }


}
