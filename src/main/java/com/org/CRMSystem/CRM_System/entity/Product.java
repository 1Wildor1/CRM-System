package com.org.CRMSystem.CRM_System.entity;

import jakarta.persistence.*;
import lombok.Data;

@Entity
@Data
public class Product {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String name;
    private double price;
    private int quantity;
    @ManyToOne
    @JoinColumn(name = "category_id")
    private Category category;
}
