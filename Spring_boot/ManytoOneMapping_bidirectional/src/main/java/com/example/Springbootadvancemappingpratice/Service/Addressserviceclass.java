package com.example.Springbootadvancemappingpratice.Service;

import com.example.Springbootadvancemappingpratice.Entity.Address;
import com.example.Springbootadvancemappingpratice.StudentRepository.Addess_repository;
import com.example.Springbootadvancemappingpratice.StudentRepository.Student_repository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class Addressserviceclass implements Address_service{
    private Addess_repository addessRepository;
    @Autowired
    public Addressserviceclass(Addess_repository addessRepository) {
        this.addessRepository = addessRepository;
    }

    @Override
    public Address findbyid(Integer address_id) {
        return addessRepository.findById(address_id).get();
    }

    @Override
    public Address findbyaddress(Integer id) {
        return addessRepository.findById(id).get();
    }

    @Override
    public void deletebyid(Integer id) {
        addessRepository.deleteById(id);
    }


}
