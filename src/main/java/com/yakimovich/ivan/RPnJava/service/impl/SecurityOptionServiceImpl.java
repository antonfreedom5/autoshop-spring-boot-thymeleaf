package com.yakimovich.ivan.RPnJava.service.impl;

import com.yakimovich.ivan.RPnJava.entity.SecurityOption;
import com.yakimovich.ivan.RPnJava.repository.SecurityOptionRepository;
import com.yakimovich.ivan.RPnJava.service.SecurityOptionService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class SecurityOptionServiceImpl implements SecurityOptionService {
    private final SecurityOptionRepository securityOptionRepository;

    @Autowired
    public SecurityOptionServiceImpl(SecurityOptionRepository securityOptionRepository) {
        this.securityOptionRepository = securityOptionRepository;
    }

    @Override
    public void create(SecurityOption securityOption) {
        this.securityOptionRepository.save(securityOption);
    }

    @Override
    public List<SecurityOption> getAll() {
        return this.securityOptionRepository.findAll();
    }

    @Override
    public Optional<SecurityOption> getById(Long id) {
        return this.securityOptionRepository.findById(id);
    }

    @Override
    public void deleteById(Long id) {
        this.securityOptionRepository.deleteById(id);
    }
}
