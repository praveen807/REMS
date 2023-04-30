package com.example.rems.controller;

import com.example.rems.entity.NeighbourhoodInfo;
import com.example.rems.service.NeighbourhoodInfoService;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;
import java.math.BigInteger;

@RestController
@RequestMapping("/neighbour")
public class NeighbourHoodInfoController {

    @Resource
    private NeighbourhoodInfoService neighbourhoodInfoService;

    @GetMapping("/{pid}")
    public ResponseEntity<NeighbourhoodInfo> getAllBookings(@PathVariable(name = "pid") BigInteger pid){
        return new ResponseEntity<>(neighbourhoodInfoService.getInfoByPid(pid),HttpStatus.OK);
    }


}
