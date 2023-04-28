package com.example.rems.controller;

import com.example.rems.domain.HouseProperty;
import com.example.rems.entity.House;
import com.example.rems.service.HouseService;
import org.springframework.format.annotation.DateTimeFormat;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import javax.annotation.Resource;
import java.math.BigInteger;
import java.util.Date;
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

    @GetMapping("/filter/{location}/{startDate}/{endDate}")
    public ResponseEntity<List<HouseProperty>> filterByLocationAndDate(
            @PathVariable(name = "location") String location, @PathVariable(name="startDate") @DateTimeFormat(pattern = "yyyy-MM-dd") Date startDate, @PathVariable(name="endDate") @DateTimeFormat(pattern = "yyyy-MM-dd") Date endDate){
        return new ResponseEntity<>(houseService.filterByLocationAndDate(location,startDate,endDate),HttpStatus.OK);
    }

}
