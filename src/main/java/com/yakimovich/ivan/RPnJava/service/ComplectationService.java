package com.yakimovich.ivan.RPnJava.service;

import com.yakimovich.ivan.RPnJava.entity.Complectation;

import java.util.List;
import java.util.Optional;

public interface ComplectationService {
    public void create(Complectation complectation);

    public List<Complectation> getAll();

    public Optional<Complectation> getById(Long id);

    public void deleteById(Long id);
}
