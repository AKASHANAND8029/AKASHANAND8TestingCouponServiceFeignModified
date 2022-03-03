package com.example.productservice.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.math.BigDecimal;

@NoArgsConstructor
@AllArgsConstructor
@Data
@Entity
@Table(name = "product_table")
public class Product {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "product_id")
    private Long id;
    @Column(name = "product_name")
    private String name;
    @Column(name = "product_desc")
    private String description;
    @Column(name = "product_price")
    private BigDecimal price;
    @Transient
    private String couponCode;
}
