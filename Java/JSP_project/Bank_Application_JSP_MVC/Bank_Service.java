package com.example.bank_applicationjsp_mvc.Banking_Services;

import com.example.bank_applicationjsp_mvc.Model.Account_Details;
import com.example.bank_applicationjsp_mvc.Model.User_Transactions;

import java.security.PublicKey;
import java.sql.*;

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

    public int insertRecord(Account_Details accountDetails) {
        int result = 0;
        try {
            PreparedStatement preparedStatement = connection.prepareStatement("insert into Account_Details values(?,?,?,?,?,?)");
            preparedStatement.setString(1, accountDetails.getUser_id());
            preparedStatement.setString(2, accountDetails.getUser_Password());
            preparedStatement.setString(3, accountDetails.getUser_name());
            preparedStatement.setString(4, accountDetails.getUser_Address());
            preparedStatement.setString(5, accountDetails.getUser_City());
            preparedStatement.setDouble(6, accountDetails.getUser_Balance());
            result = preparedStatement.executeUpdate();


        } catch (Exception e) {
            System.out.println(e);

        }
        return result;


    }

    public ResultSet checkRecord(Account_Details accountDetails, String activity ) {
        ResultSet resultSet = null;
        try {
            PreparedStatement preparedStatement = connection.prepareStatement("select * from Account_Details where Users_id=? and User_Password=?");
            preparedStatement.setString(1, accountDetails.getUser_id());
            preparedStatement.setString(2, accountDetails.getUser_Password());
            resultSet = preparedStatement.executeQuery();

            PreparedStatement preparedStatement1 = connection.prepareStatement("insert into log values (?,?,?)");
            preparedStatement1.setTimestamp(1,accountDetails.getTimestamp());

            preparedStatement1.setString(2, activity);
            preparedStatement1.setString(3,accountDetails.getUser_id());
            preparedStatement1.executeUpdate();


        }catch (Exception e){
            System.out.println(e);
        }
        return resultSet;


    }

    public int depositAmount (User_Transactions user_transactions) {


        int resultSet = 0;
        try {
            PreparedStatement preparedStatement = connection.prepareStatement("insert into User_Transactions values(?,?,?,?)");
            preparedStatement.setString(1, user_transactions.getLoginUser_id());
            preparedStatement.setDate(2, user_transactions.getTransaction_date());
            preparedStatement.setDouble(3, user_transactions.getTransaction_amount());
            preparedStatement.setString(4, user_transactions.getTransaction_type());
            preparedStatement.executeUpdate();


            PreparedStatement preparedStatement1 = connection.prepareStatement("update Account_Details set User_Balance = User_Balance+? where Users_id=?");
            preparedStatement1.setDouble(1, user_transactions.getTransaction_amount());
            preparedStatement1.setString(2, user_transactions.getLoginUser_id());
            resultSet = preparedStatement1.executeUpdate();

        } catch (Exception e) {
            System.out.println(e);
        }
        return resultSet;


    }
    public int WithdrawBalance(User_Transactions user_transactions){


        int resultset=0;
        try {
            PreparedStatement preparedStatement = connection.prepareStatement("insert into User_Transactions values(?,?,?,?)");
            preparedStatement.setString(1,user_transactions.getLoginUser_id());
            preparedStatement.setDate(2,user_transactions.getTransaction_date());
            preparedStatement.setDouble(3,user_transactions.getTransaction_amount());
            preparedStatement.setString(4,user_transactions.getTransaction_type());
            preparedStatement.executeUpdate();

            PreparedStatement preparedStatementupdate = connection.prepareStatement("update Account_Details set User_Balance = User_Balance-? where Users_id=?");
            preparedStatementupdate.setDouble(1,user_transactions.getTransaction_amount());
            preparedStatementupdate.setString(2,user_transactions.getLoginUser_id());
            resultset=preparedStatementupdate.executeUpdate();


        } catch (Exception e) {
            System.out.println(e);
        }

    return resultset;
    }

    public int TransferAmount (User_Transactions user_transactions){
        int result = 0;
        System.out.println(user_transactions.getLoginUser_id());
        System.out.println(user_transactions.getTransfer_userid());
        try {
            PreparedStatement preparedStatement= connection.prepareStatement("insert into User_Transactions values (?,?,?,?)");
            preparedStatement.setString(1,user_transactions.getTransfer_userid());
            preparedStatement.setDate(2,user_transactions.getTransaction_date());
            preparedStatement.setDouble(3,user_transactions.getTransaction_amount());
            preparedStatement.setString(4,user_transactions.getTransaction_type());
            preparedStatement.executeUpdate();
            //--------------------------update account balance in Account_details---------------------

            PreparedStatement preparedStatementupdate= connection.prepareStatement("update Account_Details set User_Balance = User_Balance+? where Users_id=? ");
            preparedStatementupdate.setDouble(1, user_transactions.getTransaction_amount());
            preparedStatementupdate.setString(2,user_transactions.getTransfer_userid());
            preparedStatementupdate.executeUpdate();

            //-----------------------transferout(amount credited)------------------------------------------

            PreparedStatement preparedStatementout = connection.prepareStatement("insert into User_Transactions values(?,?,?,?)");
            preparedStatementout.setString(1,user_transactions.getLoginUser_id());
            preparedStatement.setDate(2,user_transactions.getTransaction_date());
            preparedStatement.setDouble(3,user_transactions.getTransaction_amount());
            preparedStatement.setString(4,user_transactions.getTransaction_type2());
            preparedStatementout.executeUpdate();

            //--------------------------update account balance in account_details --------------------
            PreparedStatement preparedStatementupdateout=connection.prepareStatement("update Account_Details set User_Balance =User_Balance-? where Users_id=?");
            preparedStatementupdateout.setDouble(1, user_transactions.getTransaction_amount());
            preparedStatementupdateout.setString(2,user_transactions.getLoginUser_id());
            result= preparedStatementupdateout.executeUpdate();
        } catch (Exception e) {
            System.out.println(e);
        }
        return result;
    }


}
