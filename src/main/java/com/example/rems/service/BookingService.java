package com.example.rems.service;

import com.example.rems.domain.BookingDetails;
import com.example.rems.entity.Booking;
import com.example.rems.repository.BookingRepo;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.ArrayList;
import java.util.List;

@Service
public class BookingService {
    @Resource
    private BookingRepo bookingRepo;

    public String bookAProperty(List<BookingDetails> bookingDetails) {

        List<Booking> bookingList = new ArrayList<>();
        bookingDetails.forEach(booking -> {
            bookingRepo.save( Booking.builder().pid(booking.getPid())
                    .booking_amount(booking.getBooking_amount())
                    .creditcard_number(booking.getCreditcard_number())
                    .email(booking.getEmail())
                    .name(booking.getName())
                    .start_date(booking.getStart_date())
                    .end_date(booking.getEnd_date()).build());
        });
        return "Success";
    }
}
