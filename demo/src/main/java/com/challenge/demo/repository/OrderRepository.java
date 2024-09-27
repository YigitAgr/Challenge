package com.challenge.demo.repository;

import com.challenge.demo.model.Order;
import org.springframework.data.jpa.repository.JpaRepository;
//for git commit
public interface OrderRepository extends JpaRepository<Order, Integer> {
}
