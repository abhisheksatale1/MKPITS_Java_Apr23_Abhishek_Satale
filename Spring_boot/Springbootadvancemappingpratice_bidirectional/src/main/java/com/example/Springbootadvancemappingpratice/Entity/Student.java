package com.example.Springbootadvancemappingpratice.Entity;

import com.fasterxml.jackson.annotation.JsonManagedReference;
import jakarta.persistence.*;
import org.hibernate.service.spi.InjectService;

@Entity
@Table(name="Student_details")
public class Student {
@Id
@GeneratedValue(strategy = GenerationType.AUTO)
    private int rollno;
    private String name;
    @JsonManagedReference
@OneToOne(cascade = CascadeType.ALL)
@JoinColumn(name = "studentaddress_id")
    private Address address;

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
