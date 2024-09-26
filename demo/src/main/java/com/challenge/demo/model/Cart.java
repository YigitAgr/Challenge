package com.challenge.demo.model;

import jakarta.persistence.*;
import lombok.Data;

@Data
@Entity
@Table(name = "cart")
public class Cart extends Base{


    private int totalPrice;

}
