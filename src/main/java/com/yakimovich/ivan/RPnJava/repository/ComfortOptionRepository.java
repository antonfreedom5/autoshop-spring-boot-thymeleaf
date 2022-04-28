package com.yakimovich.ivan.RPnJava.repository;

import com.yakimovich.ivan.RPnJava.entity.ComfortOption;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ComfortOptionRepository extends JpaRepository<ComfortOption, Long> {
}
