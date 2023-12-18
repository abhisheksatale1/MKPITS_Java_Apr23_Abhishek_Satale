package com.example.SpringBoot_AdvanceMapping.Service;

import com.example.SpringBoot_AdvanceMapping.Entity.Student;

public interface StudentService {
    public Student save(Student student);

    public Student find(Integer student);
}
