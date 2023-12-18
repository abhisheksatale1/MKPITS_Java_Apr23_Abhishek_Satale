package com.example.SpringBoot_AdvanceMapping.Studentrepository;

import com.example.SpringBoot_AdvanceMapping.Entity.Address;
import org.springframework.data.jpa.repository.JpaRepository;

public interface Address_repository extends JpaRepository<Address, Integer> {
}
