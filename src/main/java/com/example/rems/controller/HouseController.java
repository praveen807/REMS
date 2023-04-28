package com.example.rems.controller;

import com.example.rems.entity.House;
import com.example.rems.service.HouseService;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;
import java.math.BigInteger;
import java.util.List;

@RestController
@RequestMapping("/House")
public class HouseController {

    @Resource
    private HouseService houseService;
    @GetMapping
    public ResponseEntity<List<House>> getHouse(){
        return new ResponseEntity<>(houseService.getHouses(), HttpStatus.FOUND);
    }

}
