package com.yakimovich.ivan.RPnJava.service;

import com.yakimovich.ivan.RPnJava.entity.SecurityOption;

import java.util.List;
import java.util.Optional;

public interface SecurityOptionService {
    public void create(SecurityOption securityOption);

    public List<SecurityOption> getAll();

    public Optional<SecurityOption> getById(Long id);

    public void deleteById(Long id);
}
