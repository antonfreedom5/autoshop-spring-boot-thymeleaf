package com.yakimovich.ivan.RPnJava.service;

import com.yakimovich.ivan.RPnJava.entity.AutoOrder;

import java.util.List;
import java.util.Optional;

public interface OrderService {
    public void create(AutoOrder autoOrder);

    public List<AutoOrder> getAll();

    public Optional<AutoOrder> getById(Long id);

    public void deleteById(Long id);
}
