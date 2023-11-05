package com.example.bank_applicationjsp_mvc.Model;

import java.util.Date;

public class User_Transactions {
    private String loginUser_id;
    private Date transaction_date;
    private Double transaction_amount;
    private String transaction_type;

    public User_Transactions() {
    }

    public User_Transactions(String loginUser_id, Date transaction_date, Double transaction_amount, String transaction_type) {
        this.loginUser_id = loginUser_id;
        this.transaction_date = transaction_date;
        this.transaction_amount = transaction_amount;
        this.transaction_type = transaction_type;
    }

    public String getLoginUser_id() {
        return loginUser_id;
    }

    public void setLoginUser_id(String loginUser_id) {
        this.loginUser_id = loginUser_id;
    }

    public Date getTransaction_date() {
        return transaction_date;
    }

    public void setTransaction_date(Date transaction_date) {
        this.transaction_date = transaction_date;
    }

    public Double getTransaction_amount() {
        return transaction_amount;
    }

    public void setTransaction_amount(Double transaction_amount) {
        this.transaction_amount = transaction_amount;
    }

    public String getTransaction_type() {
        return transaction_type;
    }

    public void setTransaction_type(String transaction_type) {
        this.transaction_type = transaction_type;
    }
}
