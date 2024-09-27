package com.challenge.demo.model;

import com.fasterxml.jackson.annotation.JsonManagedReference;
import jakarta.persistence.*;
import lombok.Data;

import java.util.List;

@Data
@Entity
@Table(name ="customer")
public class Customer extends Base {

    private String firstName;


    @OneToOne(mappedBy = "customer",cascade = CascadeType.ALL)
    private Cart cart;

    @OneToMany(mappedBy = "customer",cascade = CascadeType.ALL)
    private List<Order> order;



}
