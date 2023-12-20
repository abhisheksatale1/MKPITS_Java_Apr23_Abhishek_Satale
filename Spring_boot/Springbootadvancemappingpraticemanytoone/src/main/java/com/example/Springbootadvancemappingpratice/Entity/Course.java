package com.example.Springbootadvancemappingpratice.Entity;

import jakarta.persistence.*;

@Entity
@Table(name = "student_course")
public class Course {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
        private int course_id;
        private String title;


    public Course() {
    }

    public Course(String title) {
        this.title = title;
    }

    public int getCourse_id() {
        return course_id;
    }

    public void setCourse_id(int course_id) {
        this.course_id = course_id;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }
}
