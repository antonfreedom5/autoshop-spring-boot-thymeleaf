package com.yakimovich.ivan.RPnJava.entity;

import javax.persistence.*;
import java.util.List;

@Entity
public class AutoOrder {
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

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getClientName() {
        return clientName;
    }

    public void setClientName(String clientName) {
        this.clientName = clientName;
    }

    public String getClientPhone() {
        return clientPhone;
    }

    public void setClientPhone(String clientPhone) {
        this.clientPhone = clientPhone;
    }

    public Auto getAuto() {
        return auto;
    }

    public void setAuto(Auto auto) {
        this.auto = auto;
    }

    public List<SecurityOption> getSecurityOptions() {
        return securityOptions;
    }

    public void setSecurityOptions(List<SecurityOption> securityOptions) {
        this.securityOptions = securityOptions;
    }

    public List<ComfortOption> getComfortOptions() {
        return comfortOptions;
    }

    public void setComfortOptions(List<ComfortOption> comfortOptions) {
        this.comfortOptions = comfortOptions;
    }
}
