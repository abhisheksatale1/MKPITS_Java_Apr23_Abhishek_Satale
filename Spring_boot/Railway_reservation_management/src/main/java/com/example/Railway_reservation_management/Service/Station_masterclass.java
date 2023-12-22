package com.example.Railway_reservation_management.Service;

import com.example.Railway_reservation_management.Entity.Station_Master;
import com.example.Railway_reservation_management.Stationrepository.Stationmasterrepo;
import jakarta.transaction.Transactional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class Station_masterclass implements Station_masterInter{
    private Stationmasterrepo stationmasterrepo;
    @Autowired
    public Station_masterclass(Stationmasterrepo stationmasterrepo) {
        this.stationmasterrepo = stationmasterrepo;
    }

    @Override
    @Transactional
    public String save(Station_Master stationMaster) {
        stationmasterrepo.save(stationMaster);
        return "data inserted";
    }

}
