package com.example.rems.controller;

import com.example.rems.domain.AgentDetails;
import com.example.rems.domain.PropertyDetails;
import com.example.rems.entity.Additional_info;
import com.example.rems.entity.Booking;
import com.example.rems.service.AdditionalInfoService;
import com.example.rems.service.AgentService;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import javax.annotation.Resource;
import java.math.BigInteger;
import java.util.List;

@RestController
@RequestMapping("/info")
public class AdditionalInfoController {

    @Resource
    private AdditionalInfoService additionalInfoService;

    @GetMapping("/{pid}")
    public ResponseEntity<Additional_info> getAllBookings(@PathVariable(name = "pid") BigInteger pid){
        return new ResponseEntity<>(additionalInfoService.getInfoByPid(pid),HttpStatus.OK);
    }


}
