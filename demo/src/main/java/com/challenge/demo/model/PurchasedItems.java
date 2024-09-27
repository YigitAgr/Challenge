package com.challenge.demo.model;


import jakarta.persistence.*;
import lombok.Data;

@Data
@Entity
@Table(name = "purchaseditems")
public class PurchasedItems extends Base {

    private int pieceprice;

    private int totalprice;

}
