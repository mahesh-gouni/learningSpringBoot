package com.spring.learningSpringBoot.mapper;

import com.spring.learningSpringBoot.enitites.ProductEntityR;
import com.spring.learningSpringBoot.enitites.StudentEntity;
import com.spring.learningSpringBoot.enitites.TeacherEntity;
import com.spring.learningSpringBoot.model.ProductsR;
import com.spring.learningSpringBoot.model.Student;
import com.spring.learningSpringBoot.model.Teacher;
import lombok.NoArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.modelmapper.ModelMapper;

@Component
@NoArgsConstructor
public class MapperUtilities {
    @Autowired
    public ModelMapper modelMapper;

    public ProductEntityR modelToEntity(ProductsR productsR){
        return  modelMapper.map(productsR,ProductEntityR.class);
    }

    public ProductsR entityToModel(ProductEntityR entityR) {
        return modelMapper.map(entityR, ProductsR.class);
    }


    public StudentEntity modelToEnityStd(Student student){
        return modelMapper.map(student, StudentEntity.class);
    }
    public Student entityToModel(StudentEntity studentEntity){
        return modelMapper.map(studentEntity, Student.class);
    }

    public TeacherEntity modelToEntityTcr(Teacher teacher){
        return modelMapper.map(teacher, TeacherEntity.class);

    }
    public Teacher entityToModelTcr(TeacherEntity teacherEntity){
        return modelMapper.map(teacherEntity, Teacher.class);
    }
}
