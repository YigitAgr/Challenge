package com.challenge.demo.model;

import jakarta.persistence.*;
import lombok.Data;

@Data
@Entity
@Table(name = "orders")
public class Order extends Base {


    private int quantity;
    private int price;

}
