package com.spring.learningSpringBoot.controller;

import com.spring.learningSpringBoot.model.Student;
import com.spring.learningSpringBoot.service.StudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/student")
public class StudentController {
    @Autowired
    private StudentService studentService;

        @PostMapping("adding ")
    public ResponseEntity addingStudent(Student student){
        studentService.addingStudent(student);
        return new ResponseEntity(HttpStatus.OK);

    }

}
