package com.yakimovich.ivan.RPnJava.repository;

import com.yakimovich.ivan.RPnJava.entity.SecurityOption;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface SecurityOptionRepository extends JpaRepository<SecurityOption, Long> {
}
