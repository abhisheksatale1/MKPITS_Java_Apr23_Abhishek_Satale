package com.example.Springbootadvancemappingpratice.Entity;

import jakarta.persistence.*;

@Entity
@Table(name = "Address_details")
public class Address {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int address_id;
    private String address;
    private String city;

    public Address() {
    }

    public Address(String address, String city) {
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
