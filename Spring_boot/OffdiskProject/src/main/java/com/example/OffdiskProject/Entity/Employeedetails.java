package com.example.OffdiskProject.Entity;

import jakarta.persistence.*;


import java.sql.Date;

@Entity
@Table(name = "Employ_details")
public class Employeedetails {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int User_id;
    private String User_name;
    private String user_password;
    private Date date_of_joining;
    @OneToOne(cascade = CascadeType.ALL)

    private Employ_address employ_address;

    public Employeedetails() {
    }

    public Employeedetails(String user_name, String user_password, Date date_of_joining, Employ_address employ_address) {
        this.User_name = user_name;
        this.user_password = user_password;
        this.date_of_joining=date_of_joining;
        this.employ_address=employ_address;
    }


    public String getUser_name() {
        return User_name;
    }

    public void setUser_name(String user_name) {
        User_name = user_name;
    }

    public String getUser_password() {
        return user_password;
    }

    public void setUser_password(String user_password) {
        this.user_password = user_password;
    }

    public Date getDate_of_joining() {
        return date_of_joining;
    }

    public void setDate_of_joining(Date date_of_joining) {
        this.date_of_joining = date_of_joining;
    }

    public Employ_address getEmploy_address() {
        return employ_address;
    }

    public void setEmploy_address(Employ_address employ_address) {
        this.employ_address = employ_address;
    }
}
