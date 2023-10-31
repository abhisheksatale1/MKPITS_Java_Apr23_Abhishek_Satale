/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package services;

import bank.Account_details;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import static org.eclipse.jdt.internal.compiler.codegen.ConstantPool.Out;

/**
 *
 * @author Abhishek
 */
public class BankingService {
            int values=1;
            ResultSet resultset;

    static Connection connection;
    public static void connection()  {
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            connection=DriverManager.getConnection("jdbc:mysql://localhost:3306/Bank","root","Abhi@123");
        } catch (Exception ex) {
            System.out.println(ex);
        }
        
            
        }
    public int insertdata(Account_details accountdetails){
        int values=1;
        try {
            BankingService.connection();
           PreparedStatement prep= connection.prepareStatement("insert into Account_Details values(?,?,?,?,?,?)");
           prep.setString(1, accountdetails.getUser_id());
           prep.setString(2, accountdetails.getPassword());
           prep.setString(3, accountdetails.getName());
           prep.setString(4, accountdetails.getAddress());
           prep.setString(5, accountdetails.getCity());
           prep.setDouble(6,accountdetails.getBalance());
           prep.executeUpdate();
        } catch (Exception ex) {
           System.out.println(ex);
        }
        return values;
        
    }
    public ResultSet insertLoginPage(Account_details accountdetails ){
                try {
                    PreparedStatement prepd = connection.prepareStatement("select * from Account_Details where User_id=? and Password=?");
                    prepd.setString(1, accountdetails.getUser_id());
                    prepd.setString(2, accountdetails.getPassword());
                    ResultSet resultset = prepd.executeQuery();
                } catch (Exception ex) {
                    System.out.println(ex);
                }
                return resultset;
        
    }
    
    }
    

