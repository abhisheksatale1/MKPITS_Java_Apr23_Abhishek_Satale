package com.example.Springbootadvancemappingpratice.Entity;

import com.fasterxml.jackson.annotation.JsonManagedReference;
import jakarta.persistence.*;
import org.hibernate.service.spi.InjectService;

import java.util.List;

@Entity
@Table(name="Student_details")
public class Student {
@Id
@GeneratedValue(strategy = GenerationType.AUTO)
    private int rollno;
    private String name;
    @JsonManagedReference

    @OneToMany(cascade = CascadeType.ALL)
    private List<Course> courseList;




    public int getRollno() {
        return rollno;
    }

    public void setRollno(int rollno) {
        this.rollno = rollno;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
