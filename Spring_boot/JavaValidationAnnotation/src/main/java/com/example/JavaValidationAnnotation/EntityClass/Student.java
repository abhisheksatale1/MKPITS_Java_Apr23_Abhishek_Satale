package com.example.JavaValidationAnnotation.EntityClass;

import jakarta.validation.constraints.Max;
import jakarta.validation.constraints.Min;
import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Size;

public class Student {

    private int rollno;
    @Size(min = 1,message = "hiiiiiiiiiii")
@NotNull(message = "is required")
    private String name="";

    private String address;

    private String city;

    private String gender;

    private String language;

    public Student() {
    }

    public Student(int rollno, String name, String address, String city, String gender,String language) {
        this.rollno = rollno;
        this.name = name;
        this.address = address;
        this.city = city;
        this.gender=gender;
        this.language=language;
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

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public String getLanguage() {
        return language;
    }

    public void setLanguage(String language) {
        this.language = language;
    }
}
