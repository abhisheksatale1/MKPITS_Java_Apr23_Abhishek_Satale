/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bank;

/**
 *
 * @author Abhishek
 */
public class Account_details {
    private String User_id;
    private String Password;
    private String Name;
    private String Address;
    private String City;
    private double balance;

    public Account_details() {
    }

    public Account_details(String User_id, String Password, String Name, String Address, String City, double balance) {
        this.User_id = User_id;
        this.Password = Password;
        this.Name = Name;
        this.Address = Address;
        this.City = City;
        this.balance = balance;
    }

    public String getUser_id() {
        return User_id;
    }

    public void setUser_id(String User_id) {
        this.User_id = User_id;
    }

    public String getPassword() {
        return Password;
    }

    public void setPassword(String Password) {
        this.Password = Password;
    }

    public String getName() {
        return Name;
    }

    public void setName(String Name) {
        this.Name = Name;
    }

    public String getAddress() {
        return Address;
    }

    public void setAddress(String Address) {
        this.Address = Address;
    }

    public String getCity() {
        return City;
    }

    public void setCity(String City) {
        this.City = City;
    }

    public double getBalance() {
        return balance;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }
    
}
