package com.example.SpringBoot_AdvanceMapping.Entity;

import jakarta.persistence.*;

import static org.apache.tomcat.jni.Buffer.address;

@Entity
@Table(name = "Student_info")

public class Student {
    @Id

    private int rollno;
    private String name;
    @OneToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "student_address_id")
   private Address address;
    public Student() {
    }

    public Student(int rollno, String name, Address address ) {
        this.rollno = rollno;
        this.name = name;
        this.address= address;
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

    public Address getAddress() {
        return address;
    }

    public void setAddress(Address address) {
        this.address = address;
    }

    @Override
    public String toString() {
        return "Student{" +
                "rollno=" + rollno +
                ", name=" + name +
                '}';
    }
}
