package com.example.rems.entity;

import com.fasterxml.jackson.annotation.JsonFormat;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.math.BigInteger;
import java.util.Date;

@Data
@Entity
@NoArgsConstructor
@AllArgsConstructor
@Table(name = "property")
public class Property {
    @Id
    @Column(name = "pid")
    @GeneratedValue(strategy = GenerationType.AUTO,generator = "native")
    private BigInteger pid;

    @Column(name="property_type")
    private String pType;

    @Column(name = "sale_type")
    private String saleType;

    @Column(name = "city")
    private String city;

    @Column(name = "state")
    private String state;

    @Column(name = "zipcode")
    private String zipCode;

    @Column(name = "description")
    private String description;

    @Column(name = "price")
    private String price;

    @Temporal(TemporalType.DATE)
    @Column(name = "availability")
    private Date availability;

    @OneToOne(mappedBy = "property")
    private House house;

}
