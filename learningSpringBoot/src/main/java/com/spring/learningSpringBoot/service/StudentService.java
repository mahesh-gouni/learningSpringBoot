package com.spring.learningSpringBoot.service;

import com.spring.learningSpringBoot.enitites.StudentEntity;
import com.spring.learningSpringBoot.mapper.MapperUtilities;
import com.spring.learningSpringBoot.model.Student;
import com.spring.learningSpringBoot.repository.StudentRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


@Service
public class StudentService {

    @Autowired
    private StudentRepo studentRepo;
//    public StudentService(StudentRepo studentRepo){
//        this.studentRepo=studentRepo;
//    }
    @Autowired
    private MapperUtilities mapper;
//    public  void SetStudentService(StudentRepo studentRepo){
//        this.studentRepo=studentRepo;
//
//    }

    public void addingStudent(Student student) {
     StudentEntity studentEntity= mapper.modelToEnityStd(student);
        studentRepo.save(studentEntity);

    }

}
