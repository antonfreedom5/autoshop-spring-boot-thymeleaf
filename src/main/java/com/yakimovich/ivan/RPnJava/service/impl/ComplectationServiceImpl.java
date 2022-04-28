package com.yakimovich.ivan.RPnJava.service.impl;

import com.yakimovich.ivan.RPnJava.entity.Complectation;
import com.yakimovich.ivan.RPnJava.repository.ComplectationRepository;
import com.yakimovich.ivan.RPnJava.service.ComplectationService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class ComplectationServiceImpl implements ComplectationService {
    private final ComplectationRepository complectationRepository;

    @Autowired
    public ComplectationServiceImpl(ComplectationRepository complectationRepository) {
        this.complectationRepository = complectationRepository;
    }

    @Override
    public void create(Complectation complectation) {
        this.complectationRepository.save(complectation);
    }

    @Override
    public List<Complectation> getAll() {
        return this.complectationRepository.findAll();
    }

    @Override
    public Optional<Complectation> getById(Long id) {
        return this.complectationRepository.findById(id);
    }

    @Override
    public void deleteById(Long id) {
        this.complectationRepository.deleteById(id);
    }
}
