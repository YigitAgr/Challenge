package com.challenge.demo.model;

import jakarta.persistence.*;
import lombok.Data;

@Data
@Entity
@Table(name ="customer")
public class Customer extends Base {

    private String firstName;
}
