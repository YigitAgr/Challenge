package com.challenge.demo.repository;

import com.challenge.demo.model.Cart;
import org.springframework.data.jpa.repository.JpaRepository;
//for git commit
public interface CartRepository  extends JpaRepository<Cart, Integer> {
}
