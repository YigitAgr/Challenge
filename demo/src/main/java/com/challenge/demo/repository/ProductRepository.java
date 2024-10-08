package com.challenge.demo.repository;

import com.challenge.demo.model.Product;
import org.springframework.data.jpa.repository.JpaRepository;
//for git commit
public interface ProductRepository extends JpaRepository<Product, Integer> {

    Product findById(int id);

}
