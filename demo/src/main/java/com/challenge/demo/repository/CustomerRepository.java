package com.challenge.demo.repository;

import com.challenge.demo.model.Customer;
import org.springframework.data.jpa.repository.JpaRepository;
//for git commit
public interface CustomerRepository extends JpaRepository<Customer, Integer> {
}
