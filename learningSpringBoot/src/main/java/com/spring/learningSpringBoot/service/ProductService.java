package com.spring.learningSpringBoot.service;

import com.spring.learningSpringBoot.model.Products;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;


@Service
public class ProductService {

    List<Products> products= new ArrayList<>( Arrays.asList(
            new Products(1,"fan","electronics","2000","3.5"),
            new Products(2,"laptop","electonics","67000","2.4") ,
            new Products(3,"chair","non-living","8000","4.1"),
            new Products(4,"cooler","electonics","5000","3.0") ,
            new Products(5,"cot","non -l","6000","4.5"),
            new Products(6,"bag","education","600","3.4") ,
            new Products(7,"book","education","720","4.0")));

    public List<Products> getproducts(){

        return products;
    }

    public Products getproductbyIds( int proId) {

        for (Products product : products) {
            if (product.getProId() == proId) {
                return product;
            }
        }
        return null;
    }
    public void addProducts(Products productsadd){
        products.add(productsadd);
    }

    public void updateproductsInService(Products produc) {

        int indexval =0;
        for (int i =0; i<products.size();i++){
            if (produc.getProId()==products.get(i).getProId()){
                indexval=i;

            }
            products.set(indexval,produc);

        }

    }

    public void deletingfromServ(int proID) {


        int indexval = 0;
        for (int i = 0; i < products.size(); i++) {
            if (proID == products.get(i).getProId()) {
                indexval = i;



            }
            products.remove(indexval);
        }

    }

    public void updatingproduct(Products pro) {
        int index=0;
        for (int i=0;i<products.size();i++){

            if (products.get(i).getProId()==pro.getProId()){
                index=i;
            }

        }

        products.set(index,pro);
    }
}