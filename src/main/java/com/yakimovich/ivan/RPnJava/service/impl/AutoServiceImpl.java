package com.yakimovich.ivan.RPnJava.service.impl;

import com.yakimovich.ivan.RPnJava.entity.Auto;
import com.yakimovich.ivan.RPnJava.repository.AutoRepository;
import com.yakimovich.ivan.RPnJava.service.AutoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class AutoServiceImpl implements AutoService {
    private final AutoRepository autoRepository;

    @Autowired
    public AutoServiceImpl(AutoRepository autoRepository) {
        this.autoRepository = autoRepository;
    }

    @Override
    public void create(Auto auto) {
        this.autoRepository.save(auto);
    }

    @Override
    public List<Auto> getAll() {
        return this.autoRepository.findAll();
    }

    @Override
    public Optional<Auto> getById(Long id) {
        return this.autoRepository.findById(id);
    }

    @Override
    public void deleteById(Long id) {
        this.autoRepository.deleteById(id);
    }
}
