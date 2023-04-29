package com.example.rems.repository;

import com.example.rems.entity.Booking;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.math.BigInteger;

@Repository
public interface BookingRepo extends JpaRepository<Booking , BigInteger> {
}
