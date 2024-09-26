package com.challenge.demo.repository;

import com.challenge.demo.model.PurchasedItems;
import org.springframework.data.jpa.repository.JpaRepository;
//for git commit
public interface PurchasedItemsRepository extends JpaRepository<PurchasedItems, Integer> {
}
