package com.example.OffdiskProject.Service;

import com.example.OffdiskProject.Employ_repository.Employrepository;
import com.example.OffdiskProject.Entity.Employeedetails;
import jakarta.transaction.Transactional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class EmployServiceclass implements EmployServiceInt{
    private Employrepository employrepository;
    @Autowired
    public EmployServiceclass(Employrepository employrepository) {
        this.employrepository = employrepository;
    }

    @Override
    @Transactional
    public String save(Employeedetails employeeDetails) {
         employrepository.save(employeeDetails);
        return "inserted";
    }

    @Override
    public Employeedetails findbyid(Integer userid, Integer password) {
        employrepository.findById(userid).get();
        return employrepository.findById(password).get();
    }





//    @Override
//    public Employeedetails inventoryitembyid(Employeedetails employeeDetails) {
//            return null;
//    }
}
