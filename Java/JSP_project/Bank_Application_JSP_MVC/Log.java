package com.example.bank_applicationjsp_mvc.Model;

import java.sql.Timestamp;

public class Log {
    private Timestamp timestamps;
    private String Activities;
    private String UserId;

    public Log() {
    }

    public Log(Timestamp timestamps, String activities, String userId) {
        this.timestamps = timestamps;
        Activities = activities;
        UserId = userId;
    }

    public Timestamp getTimestamps() {
        return timestamps;
    }

    public void setTimestamps(Timestamp timestamps) {
        this.timestamps = timestamps;
    }

    public String getActivities() {
        return Activities;
    }

    public void setActivities(String activities) {
        Activities = activities;
    }

    public String getUserId() {
        return UserId;
    }

    public void setUserId(String userId) {
        UserId = userId;
    }
}
