package com.example.rems.service;

import com.example.rems.domain.HouseProperty;
import com.example.rems.domain.RenterDetails;
import com.example.rems.entity.House;
import com.example.rems.entity.Renter;
import com.example.rems.repository.HouseRepo;
import com.example.rems.repository.Renterrepo;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.Date;
import java.util.List;

@Service
public class RenterService {

    @Resource
    private Renterrepo renterrepo;

    public String addRenter(RenterDetails renterDetails) {
        Renter renter = Renter.builder().rid(renterDetails.getRid()).budget(renterDetails.getBudget())
                .move_in_date(renterDetails.getMove_in_date()).name(renterDetails.getName()).preferred_location(renterDetails.getPreferred_location()).build();
        renterrepo.save(renter);

        return "Success";
    }
}
