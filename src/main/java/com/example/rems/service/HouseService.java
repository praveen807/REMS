package com.example.rems.service;

import com.example.rems.entity.House;
import com.example.rems.repository.HouseRepo;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.math.BigInteger;
import java.util.List;
import java.util.Optional;

@Service
public class HouseService {

    @Resource
    private HouseRepo houseRepo;

    public List<House> getHouses(){
        return houseRepo.findAll();
    }


}
