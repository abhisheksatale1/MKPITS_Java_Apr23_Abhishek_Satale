package com.example.Railway_reservation_management.Stationrepository;

import com.example.Railway_reservation_management.Entity.Station_city;
import jakarta.persistence.criteria.CriteriaBuilder;
import org.springframework.data.jpa.repository.JpaRepository;

public interface Stationcity extends JpaRepository<Station_city, Integer> {
}
