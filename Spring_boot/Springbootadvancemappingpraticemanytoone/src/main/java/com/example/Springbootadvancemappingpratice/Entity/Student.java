package com.example.Springbootadvancemappingpratice.Entity;

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
@OneToOne(cascade = CascadeType.ALL)
    private Address address;
//-------------------------------------------------one to many-----------------------//
@OneToMany(cascade = CascadeType.ALL)
private List <Course> courseList;

    public List<Course> getCourseList() {
        return courseList;
    }

    public void setCourseList(List<Course> courseList) {
        this.courseList = courseList;
    }

    public Address getAddress() {
        return address;
    }

    public void setAddress(Address address) {
        this.address = address;
    }

    public Student() {
    }

    public Student( String name,Address address) {
        this.address=address;
        this.name = name;

    }

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
