package com.example.Railway_reservation_management.Entity;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "Station_state")
public class Station_state {
    @Id
        private int station_id;
        private String station_name;
        private int country_id;

    public Station_state() {
    }

    public Station_state(int station_id, String station_name, int country_id) {
        this.station_id = station_id;
        this.station_name = station_name;
        this.country_id = country_id;
    }

    public int getStation_id() {
        return station_id;
    }

    public void setStation_id(int station_id) {
        this.station_id = station_id;
    }

    public String getStation_name() {
        return station_name;
    }

    public void setStation_name(String station_name) {
        this.station_name = station_name;
    }

    public int getCountry_id() {
        return country_id;
    }

    public void setCountry_id(int country_id) {
        this.country_id = country_id;
    }
}
