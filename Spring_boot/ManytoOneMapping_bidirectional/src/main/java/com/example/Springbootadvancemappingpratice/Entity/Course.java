package com.example.Springbootadvancemappingpratice.Entity;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;

@Entity

public class Course {
@Id
private  int course_id;
private String title;
    public Course() {
    }

    public Course(int course_id, String title) {
        this.course_id = course_id;
        this.title = title;
    }


}
