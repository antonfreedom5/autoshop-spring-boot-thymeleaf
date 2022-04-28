package com.yakimovich.ivan.RPnJava.service.impl;

import com.yakimovich.ivan.RPnJava.entity.AutoOrder;
import com.yakimovich.ivan.RPnJava.repository.OrderRepository;
import com.yakimovich.ivan.RPnJava.service.OrderService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class OrderServiceImpl implements OrderService {
    private final OrderRepository orderRepository;

    @Autowired
    public OrderServiceImpl(OrderRepository orderRepository) {
        this.orderRepository = orderRepository;
    }

    @Override
    public void create(AutoOrder autoOrder) {
        this.orderRepository.save(autoOrder);
    }

    @Override
    public List<AutoOrder> getAll() {
        return this.orderRepository.findAll();
    }

    @Override
    public Optional<AutoOrder> getById(Long id) {
        return this.orderRepository.findById(id);
    }

    @Override
    public void deleteById(Long id) {
        this.orderRepository.deleteById(id);
    }
}
