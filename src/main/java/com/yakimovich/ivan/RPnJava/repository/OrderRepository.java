package com.yakimovich.ivan.RPnJava.repository;

import com.yakimovich.ivan.RPnJava.entity.AutoOrder;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface OrderRepository extends JpaRepository<AutoOrder, Long> {
}
