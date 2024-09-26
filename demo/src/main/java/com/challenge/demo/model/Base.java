package com.challenge.demo.model;


import jakarta.persistence.*;
import lombok.Data;

import java.time.LocalDateTime;

@Data
@MappedSuperclass
public class Base {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    @Column(updatable = false)
    private LocalDateTime createdAt=LocalDateTime.now();

    @Column(updatable = true)
    private LocalDateTime updatedAt;
}
