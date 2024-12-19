package com.spring.learningSpringBoot.controller;

import com.spring.learningSpringBoot.model.ProductsR;
import com.spring.learningSpringBoot.service.ProductServiceR;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class ProductControllerR {
    @Autowired
    ProductServiceR productServiceR;

    @GetMapping("/products")
    public List<ProductsR> gettingallProd(){

        return productServiceR.gettingallprod();

    }
    @PostMapping("/add")
    public void  adding(@RequestBody ProductsR productsR){
        productServiceR.addingProd(productsR);
    }

        @PutMapping("/updatingR")
    public void updatingProduct(@RequestBody ProductsR productsR){

        productServiceR.updatingProdcuct(productsR);

    }
    @GetMapping("/product{ProId}")
    public ProductsR gettingbyId(int ProId){
      return   productServiceR.gettingprodByID(ProId);

    }


}
