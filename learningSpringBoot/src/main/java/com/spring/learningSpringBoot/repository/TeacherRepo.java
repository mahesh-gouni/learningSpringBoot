package com.spring.learningSpringBoot.repository;

import com.spring.learningSpringBoot.enitites.TeacherEntity;
import org.springframework.data.jpa.repository.JpaRepository;

public interface TeacherRepo extends JpaRepository<TeacherEntity,Integer> {


}
