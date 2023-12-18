package com.example.SpringBoot_AdvanceMapping.Service;

import com.example.SpringBoot_AdvanceMapping.Entity.Address;
import com.example.SpringBoot_AdvanceMapping.Studentrepository.Student_repository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.RestController;

@Service
public class Addressserviceclass implements Addressservice{
    @Autowired
    private Student_repository studentRepository;

    public Addressserviceclass(Student_repository studentRepository) {
        this.studentRepository = studentRepository;
    }

    @Override
    public Address find(Integer address_id) {
//        return studentRepository.findById(address_id).get();
        return null;
    }
}
