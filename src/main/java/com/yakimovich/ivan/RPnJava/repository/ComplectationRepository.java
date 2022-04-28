package com.yakimovich.ivan.RPnJava.repository;

import com.yakimovich.ivan.RPnJava.entity.Complectation;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ComplectationRepository extends JpaRepository<Complectation, Long> {
}
