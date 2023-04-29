package com.example.rems.entity;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.math.BigInteger;

@Data
@Entity
@NoArgsConstructor
@Builder
@AllArgsConstructor
@Table(name = "house")
public class House {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO,generator = "native")
    @Column(name = "id")
    private BigInteger id;

    @Column(name = "propertyid",insertable = false,updatable = false,unique = true)
    private BigInteger propertyid;

    @Column(name = "location")
    private String location;

    @Column(name = "number_of_rooms")
    private BigInteger number_of_rooms;

    @Column(name = "sq_foot")
    private BigInteger sq_foot;

    @OneToOne(fetch = FetchType.LAZY,cascade = CascadeType.ALL)
    @JoinColumn(name = "propertyid", referencedColumnName = "pid")
    private Property property;


}
