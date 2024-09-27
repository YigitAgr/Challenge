package com.challenge.demo.model;

import jakarta.persistence.*;
import lombok.Data;

import java.util.List;


@Data
@Entity
@Table(name = "product")
public class Product extends Base {


    private int price;

    private String name;

    private int stock;

    @ManyToOne
    @JoinColumn(name = "order_id")
    private Order order;

    @ManyToOne
    @JoinColumn(name = "cart_id")
    private Cart cart;
}
