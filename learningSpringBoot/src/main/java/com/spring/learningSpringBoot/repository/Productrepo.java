package com.spring.learningSpringBoot.repository;

import com.spring.learningSpringBoot.enitites.ProductEntityR;
import com.spring.learningSpringBoot.model.ProductsR;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface Productrepo extends JpaRepository<ProductEntityR,Integer> {





}
