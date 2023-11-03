package com.example.studentinformationjspactionproject.model;

public class Studentdetails {
    private String rollNo;
    private String name;
    private String address;
    private String city;

    public Studentdetails() {
    }

    public Studentdetails(String rollNo, String name, String address, String city) {
        this.rollNo = rollNo;
        this.name = name;
        this.address = address;
        this.city = city;
    }

    public String getRollNo() {
        return rollNo;
    }

    public void setRollNo(String rollNo) {
        this.rollNo = rollNo;
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
}
