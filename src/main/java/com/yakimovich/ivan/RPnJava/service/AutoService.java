package com.yakimovich.ivan.RPnJava.service;

import com.yakimovich.ivan.RPnJava.entity.Auto;

import java.util.List;
import java.util.Optional;

public interface AutoService {
    void create(Auto auto);

    List<Auto> getAll();

    Optional<Auto> getById(Long id);

    void deleteById(Long id);
}
