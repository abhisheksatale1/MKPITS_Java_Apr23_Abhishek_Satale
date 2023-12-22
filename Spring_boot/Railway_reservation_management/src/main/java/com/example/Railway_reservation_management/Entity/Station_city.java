package com.example.Railway_reservation_management.Entity;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "Station_city")
public class Station_city {
   @Id
   private int city_id;
   private String city_name;
   private int state_id;

    public Station_city() {
    }

    public Station_city(int city_id, String city_name, int state_id) {
        this.city_id = city_id;
        this.city_name = city_name;
        this.state_id = state_id;
    }

    public int getCity_id() {
        return city_id;
    }

    public void setCity_id(int city_id) {
        this.city_id = city_id;
    }

    public String getCity_name() {
        return city_name;
    }

    public void setCity_name(String city_name) {
        this.city_name = city_name;
    }

    public int getState_id() {
        return state_id;
    }

    public void setState_id(int state_id) {
        this.state_id = state_id;
    }
}
