package com.example.rems.domain;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.Column;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
import java.math.BigInteger;
import java.util.Date;


@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class RenterDetails {
    private String rid;
    private Date move_in_date;
    private String preferred_location;
    private BigInteger budget;
    private String name;
}
