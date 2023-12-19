package com.example.Springbootadvancemappingpratice.Controller;

import com.example.Springbootadvancemappingpratice.Entity.Address;
import com.example.Springbootadvancemappingpratice.Entity.Student;
import com.example.Springbootadvancemappingpratice.Service.Address_service;
import com.example.Springbootadvancemappingpratice.Service.Addressserviceclass;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class AddressController {

    private Address_service addressService;
    @Autowired
    public AddressController(Address_service addressService) {
        this.addressService = addressService;
    }
    @GetMapping("/findbyaddressid/{address_id}")
    public Address findbyid(@PathVariable int address_id){
        return addressService.findbyid(address_id);
    }
    @GetMapping("/findbyaddress/{address_id}")
    public Student findbyaddress(@PathVariable int address_id){
        Address address= addressService.findbyaddress(address_id);
        Student student= address.getStudent();
        return student;
    }
    @DeleteMapping("/deleteaddressbyid/{address_id}")
    public void deleteaddress(@PathVariable int address_id){
        Address address = addressService.findbyaddress(address_id);
        Student student= address.getStudent();
            student.setAddress(null);
         addressService.deletebyid(address_id);
    }
}
