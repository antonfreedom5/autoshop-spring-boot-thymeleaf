package com.yakimovich.ivan.RPnJava.service.impl;

import com.yakimovich.ivan.RPnJava.entity.ComfortOption;
import com.yakimovich.ivan.RPnJava.repository.ComfortOptionRepository;
import com.yakimovich.ivan.RPnJava.service.ComfortOptionService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class ComfortOptionServiceImpl implements ComfortOptionService {
    private final ComfortOptionRepository comfortOptionRepository;

    @Autowired
    public ComfortOptionServiceImpl(ComfortOptionRepository comfortOptionRepository) {
        this.comfortOptionRepository = comfortOptionRepository;
    }

    @Override
    public void create(ComfortOption comfortOption) {
        this.comfortOptionRepository.save(comfortOption);
    }

    @Override
    public List<ComfortOption> getAll() {
        return this.comfortOptionRepository.findAll();
    }

    @Override
    public Optional<ComfortOption> getById(Long id) {
        return this.comfortOptionRepository.findById(id);
    }

    @Override
    public void deleteById(Long id) {
        this.comfortOptionRepository.deleteById(id);
    }
}
