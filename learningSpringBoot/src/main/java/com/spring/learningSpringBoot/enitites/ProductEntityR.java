package com.spring.learningSpringBoot.enitites;

import jakarta.persistence.*;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Table(name = "handsvar")
@Data
@NoArgsConstructor

public class ProductEntityR {
    @Id
    @Column(name = "proId",nullable = false)
    private int proId;


    @Column(name = "name",nullable = false )
    private String name;


    @Column(name = "type",nullable = false)
    private String type;


    @Column(name = "price",nullable = false)
    private String  price;


}
