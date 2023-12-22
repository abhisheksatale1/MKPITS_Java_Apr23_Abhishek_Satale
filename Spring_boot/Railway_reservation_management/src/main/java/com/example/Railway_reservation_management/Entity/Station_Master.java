package com.example.Railway_reservation_management.Entity;

import jakarta.persistence.*;

import java.sql.Timestamp;

@Entity
@Table(name = "Station_Master")
public class Station_Master {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int station_id;
    private String name;
    private String station_type;
    private String station_code;
    private int Contact_id;
    private Timestamp station_update;
@OneToOne(cascade = CascadeType.ALL)
@JoinColumn(name = "Contact_id")
private Station_Contact stationContact;

    public Station_Contact getStationContact() {
        return stationContact;
    }

    public void setStationContact(Station_Contact stationContact) {
        this.stationContact = stationContact;
    }

    public Station_Master() {
    }

    public Station_Master(String name,
                          String station_type,
                          String station_code,
                          int contact_id,
                          Timestamp station_update,
                          Station_Contact stationContact) {
        this.name = name;
        this.station_type = station_type;
        this.station_code = station_code;
        Contact_id = contact_id;
        this.station_update = station_update;
        this.stationContact = stationContact;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getStation_type() {
        return station_type;
    }

    public void setStation_type(String station_type) {
        this.station_type = station_type;
    }

    public String getStation_code() {
        return station_code;
    }

    public void setStation_code(String station_code) {
        this.station_code = station_code;
    }

    public int getContact_id() {
        return Contact_id;
    }

    public void setContact_id(int contact_id) {
        Contact_id = contact_id;
    }

    public Timestamp getStation_update() {
        return station_update;
    }

    public void setStation_update(Timestamp station_update) {
        this.station_update = station_update;
    }
}
