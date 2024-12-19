package com.spring.learningSpringBoot.model;


import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class Products {
    private int proId;
    private String name;
    private String type;
    private String  price;
    private String rating;
}
