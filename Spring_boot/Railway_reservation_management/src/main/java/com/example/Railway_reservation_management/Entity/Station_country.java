package com.example.Railway_reservation_management.Entity;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "Station_country")
public class Station_country {
    @Id
        private int country_id;
        private String country_name;

    public Station_country() {
    }

    public Station_country(int country_id, String country_name) {
        this.country_id = country_id;
        this.country_name = country_name;
    }

    public int getCountry_id() {
        return country_id;
    }

    public void setCountry_id(int country_id) {
        this.country_id = country_id;
    }

    public String getCountry_name() {
        return country_name;
    }

    public void setCountry_name(String country_name) {
        this.country_name = country_name;
    }
}
