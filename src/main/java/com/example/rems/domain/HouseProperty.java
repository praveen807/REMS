package com.example.rems.domain;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.math.BigInteger;
import java.util.Date;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class HouseProperty {
    private BigInteger pid;
    private String location;
    private BigInteger noOfRooms;
    private BigInteger sqFoot;
    private String pType;
    private String saleType;
    private String city;
    private String price;
    private Date availablity;
}
