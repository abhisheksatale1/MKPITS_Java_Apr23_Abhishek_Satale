package com.example.OffdiskProject.Service;

import com.example.OffdiskProject.Entity.Employeedetails;

public interface EmployServiceInt {
public String save( Employeedetails employeeDetails);


    Employeedetails  findbyid(Integer userid, Integer password);
}
