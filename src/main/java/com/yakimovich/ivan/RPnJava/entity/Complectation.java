package com.yakimovich.ivan.RPnJava.entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Complectation {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    private String engine;
    private String transmission;
    private String fuel;
    private String body;
}
