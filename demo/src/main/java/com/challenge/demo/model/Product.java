package com.challenge.demo.model;

import jakarta.persistence.*;
import lombok.Data;


@Data
@Entity
@Table(name = "product")
public class Product extends Base {


    private int price;

    private String name;

    private int stock;
}
