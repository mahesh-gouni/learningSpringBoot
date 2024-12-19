package com.spring.learningSpringBoot.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.stereotype.Component;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class ProductsR {

    private int proId;
    private String name;
    private String type;
    private String  price;
}
