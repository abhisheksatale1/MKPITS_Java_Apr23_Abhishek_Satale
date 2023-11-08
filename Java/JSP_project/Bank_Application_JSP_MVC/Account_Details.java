package com.example.bank_applicationjsp_mvc.Model;

import java.sql.Timestamp;

public class Account_Details {
    private String user_id;
    private String user_Password;
    private  String user_name;
    private String user_Address;

    private String user_City;

    private Double user_Balance;

    private Timestamp timestamp;

    public Timestamp getTimestamp() {
        return timestamp;
    }

    public void setTimestamp(Timestamp timestamp) {
        this.timestamp = timestamp;
    }

    public Account_Details() {
    }

    public Account_Details(String user_id, String user_Password, String user_name, String user_Address, String user_City, Double user_Balance) {
        this.user_id = user_id;
        this.user_Password = user_Password;
        this.user_name = user_name;
        this.user_Address = user_Address;
        this.user_City = user_City;
        this.user_Balance = user_Balance;
    }



    public String getUser_id() {
        return user_id;
    }

    public void setUser_id(String user_id) {
        this.user_id = user_id;
    }

    public String getUser_Password() {
        return user_Password;
    }

    public void setUser_Password(String user_Password) {
        this.user_Password = user_Password;
    }

    public String getUser_name() {
        return user_name;
    }

    public void setUser_name(String user_name) {
        this.user_name = user_name;
    }

    public String getUser_Address() {
        return user_Address;
    }

    public void setUser_Address(String user_Address) {
        this.user_Address = user_Address;
    }

    public String getUser_City() {
        return user_City;
    }

    public void setUser_City(String user_City) {
        this.user_City = user_City;
    }

    public Double getUser_Balance() {
        return user_Balance;
    }

    public void setUser_Balance(Double user_Balance) {
        this.user_Balance = user_Balance;
    }
}
