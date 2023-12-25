package com.example.OffdiskProject.Entity;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "Employ_address")
public class Employ_address {
    @Id
    private int address_id;
    private String address;
    private String city;

    public Employ_address() {
    }

    public Employ_address(int address_id, String address, String city) {
        this.address_id = address_id;
        this.address = address;
        this.city = city;
    }

    public int getAddress_id() {
        return address_id;
    }

    public void setAddress_id(int address_id) {
        this.address_id = address_id;
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
