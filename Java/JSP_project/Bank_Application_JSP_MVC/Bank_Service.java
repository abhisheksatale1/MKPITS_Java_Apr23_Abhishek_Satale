package com.example.bank_applicationjsp_mvc.Banking_Services;

import java.sql.Connection;
import java.sql.DriverManager;

public class Bank_Service {
    Connection connection;

    public Bank_Service() {

        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/BankApplicationJSP_MVC", "root", "Abhi@123");
            System.out.println("Connection Established from database");

        } catch (Exception e) {
            System.out.println(e);

        }
    }
public  int insertRecord(){

}
}