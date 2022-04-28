package com.yakimovich.ivan.RPnJava.service;

import com.yakimovich.ivan.RPnJava.entity.ComfortOption;

import java.util.List;
import java.util.Optional;

public interface ComfortOptionService {
    public void create(ComfortOption comfortOption);

    public List<ComfortOption> getAll();

    public Optional<ComfortOption> getById(Long id);

    public void deleteById(Long id);
}
