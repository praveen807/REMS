package com.example.rems.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.math.BigInteger;

@Data
@Entity
@NoArgsConstructor
@AllArgsConstructor
@Table(name = "house")
public class House {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO,generator = "native")
    @Column(name = "id")
    private BigInteger id;

    @Column(name = "pid")
    private BigInteger pid;

    @Column(name = "location")
    private String location;

    @Column(name = "number_of_rooms")
    private BigInteger number_of_rooms;

    @Column(name = "sq_foot")
    private BigInteger sq_foot;


}
