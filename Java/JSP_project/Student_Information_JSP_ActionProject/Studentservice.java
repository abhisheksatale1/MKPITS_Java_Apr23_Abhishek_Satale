package com.example.studentinformationjspactionproject.service;

import com.example.studentinformationjspactionproject.model.Studentdetails;

import java.sql.*;

public class Studentservice {
    Connection connection;
    public Studentservice()  {

        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/DatabaseStudent", "root", "Abhi@123");
            System.out.println("Connection Established from database");
        } catch (Exception e) {
            System.out.println(e);

        }


    }

    public int insertRecord(Studentdetails student) {
    int result=0;
        try{
            PreparedStatement preparedStatement = connection.prepareStatement("insert into Students values(?,?,?,?)");
            preparedStatement.setString(1,student.getRollNo());
            preparedStatement.setString(2,student.getName());
            preparedStatement.setString(3,student.getAddress());
            preparedStatement.setString(4,student.getCity());
             result = preparedStatement.executeUpdate();
        }
        catch (Exception e){

        }
        return result;
    }

    public ResultSet Displayrecord(){
        ResultSet resultSet=null;
        try {
            Statement statement= connection.createStatement();
            resultSet=statement.executeQuery("select * from Students");

        }
        catch (Exception e){
            System.out.println(e);
        }
        return resultSet;
    }

}
