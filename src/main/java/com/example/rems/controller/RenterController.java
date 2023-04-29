package com.example.rems.controller;

import com.example.rems.domain.AgentDetails;
import com.example.rems.domain.RenterDetails;
import com.example.rems.service.AgentService;
import com.example.rems.service.RenterService;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;

@RestController
@RequestMapping("/Renter")
public class RenterController {

    @Resource
    private RenterService renterService;

    @PostMapping("/add")
    public ResponseEntity<String> addRenter( @RequestBody RenterDetails renterDetails){

        return new ResponseEntity<>(renterService.addRenter(renterDetails), HttpStatus.OK);

    }
}
