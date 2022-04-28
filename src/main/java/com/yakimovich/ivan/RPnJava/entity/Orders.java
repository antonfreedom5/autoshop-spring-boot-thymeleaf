package com.yakimovich.ivan.RPnJava.entity;

import javax.persistence.*;
import java.util.List;

@Entity
public class Orders {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    private String clientName;
    private String clientPhone;
    @OneToOne
    private Auto auto;
    @OneToMany
    private List<SecurityOption> securityOptions;
    @OneToMany
    private List<ComfortOption> comfortOptions;
}
