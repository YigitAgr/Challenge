package com.challenge.demo.model;

import jakarta.persistence.*;
import lombok.Data;

import java.util.List;

@Data
@Entity
@Table(name = "orders")
public class Order extends Base {


    private int quantity;
    private int price;

    @ManyToOne
    @JoinColumn(name = "customer_id")
    private Customer customer;

    @ManyToOne
    @JoinColumn(name = "cart_id")
    private Cart cart;

   @OneToMany(mappedBy = "order",cascade = CascadeType.ALL)
    private List<Product> product;


}
