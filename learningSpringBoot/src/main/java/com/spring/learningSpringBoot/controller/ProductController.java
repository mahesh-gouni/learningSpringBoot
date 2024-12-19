package com.spring.learningSpringBoot.controller;


import com.spring.learningSpringBoot.model.Products;
import com.spring.learningSpringBoot.service.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class ProductController {
    @Autowired
    private ProductService productService;

    @GetMapping("/product")
    public List<Products> getproductDetails(){

        return productService.getproducts();
    }

        @GetMapping(  "/product/{proId}")
    public Products getproductbyId(@PathVariable int proId){

        return productService.getproductbyIds(proId);
    }
    @PostMapping("/productpost")
    public void addproductfromclient( @RequestBody Products prodc){
        System.out.println("at post mapping controller"+prodc);

        productService.addProducts(prodc);
    }



    @PutMapping("/update")
    public void updateproducts(  @RequestBody Products products){

        productService.updateproductsInService(products);
    }


    @DeleteMapping("/delete/{proID}")
    public void deletefromUi(  @PathVariable int proID){


         productService.deletingfromServ(proID);
    }

    @PutMapping("/updating")
    public void updatingproducts(@RequestBody Products products){
        productService.updatingproduct(products);
    }



}
