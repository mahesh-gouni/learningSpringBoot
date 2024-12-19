package com.spring.learningSpringBoot.repository;

import com.spring.learningSpringBoot.enitites.StudentEntity;
import org.springframework.data.jpa.repository.JpaRepository;

public interface StudentRepo extends JpaRepository<StudentEntity,Integer> {


}
