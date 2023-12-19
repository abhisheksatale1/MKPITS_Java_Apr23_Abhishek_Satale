package com.example.Springbootadvancemappingpratice.Service;

import com.example.Springbootadvancemappingpratice.Entity.Address;

import java.util.List;

public interface Address_service {
    public Address findbyid(Integer Address);

    public Address findbyaddress(Integer id);

    public void deletebyid(Integer id);
}
