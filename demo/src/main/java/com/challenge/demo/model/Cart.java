package com.challenge.demo.model;

import com.fasterxml.jackson.annotation.JsonBackReference;
import com.fasterxml.jackson.annotation.JsonManagedReference;
import jakarta.persistence.*;
import lombok.Data;

import java.util.List;

@Data
@Entity
@Table(name = "cart")
public class Cart extends Base{


    private int totalPrice;

    @JsonBackReference
    @OneToOne
    @JoinColumn(name = "customer_id")
    private Customer customer;


    @OneToMany(mappedBy = "cart", cascade = CascadeType.ALL, orphanRemoval = true)
    private List<Order> order;

}
