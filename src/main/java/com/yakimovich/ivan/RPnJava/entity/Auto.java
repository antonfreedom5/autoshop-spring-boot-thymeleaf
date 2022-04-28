package com.yakimovich.ivan.RPnJava.entity;

import javax.persistence.*;

@Entity
public class Auto {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    private String name;
    private String model;
    private Long year;
    private Long price;
    @ManyToOne
    private Complectation complectation;
}
