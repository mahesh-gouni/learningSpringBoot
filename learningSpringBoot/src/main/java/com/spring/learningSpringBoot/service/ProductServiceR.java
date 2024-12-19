package com.spring.learningSpringBoot.service;

import com.spring.learningSpringBoot.enitites.ProductEntityR;
import com.spring.learningSpringBoot.mapper.MapperUtilities;
import com.spring.learningSpringBoot.model.ProductsR;
import com.spring.learningSpringBoot.repository.Productrepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.logging.Logger;
import java.util.stream.Collectors;

@Service
public class ProductServiceR {
    private static final Logger logger = Logger.getLogger(ProductServiceR.class.getName());

@Autowired
 private MapperUtilities modelToEntityMapper;

@Autowired
    Productrepo productrepo;

    public List<ProductsR> gettingallprod() {
        List<ProductEntityR> productEntities = productrepo.findAll();

        // Map entities to response DTOs using the mapper
        return productEntities.stream()
                .map(modelToEntityMapper::entityToModel )
                .collect(Collectors.toList());
    }


    public void addingProd(ProductsR productsR) {


        ProductEntityR productEntityR = this.modelToEntityMapper.modelToEntity(productsR);
        logger.info("adding products at service");


        productrepo.save(productEntityR);
    }


    public void updatingProdcuct(ProductsR productsR) {
        ProductEntityR productEntityR = this.modelToEntityMapper.modelToEntity(productsR);
        logger.info("updating  products at service");


        productrepo.save(productEntityR);

    }

//    public ProductsR gettingprodByID(int proId) {
//        ProductEntityR productEntityR = modelToEntityMapper.modelToEntity().getProId();
//      return   productrepo.findById(proId).orElse(new productEntityR());
//    }
    public ProductsR gettingprodByID(int proId) {
        // Retrieve the ProductEntityR from the repository
        ProductEntityR productEntityR = productrepo.findById(proId).orElseThrow();

        // Return null or map the entity to the DTO if it exists
        return modelToEntityMapper.entityToModel(productEntityR);
    }


}
