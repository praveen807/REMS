package com.example.rems.controller;

import com.example.rems.domain.BookingDetails;
import com.example.rems.domain.PropertyDetails;
import com.example.rems.service.BookingService;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;
import java.util.List;

@RestController
@RequestMapping("/Booking")
public class BookingController {

    @Resource
    private BookingService bookingService;
    @PostMapping("/bookProperty")
    public ResponseEntity<String> bookProperty(@RequestBody List<BookingDetails> bookingDetails ){
        return  new ResponseEntity<>(bookingService.bookAProperty(bookingDetails), HttpStatus.OK);
    }
}
