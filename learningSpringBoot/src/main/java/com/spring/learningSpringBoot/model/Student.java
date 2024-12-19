package com.spring.learningSpringBoot.model;


import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.stereotype.Component;

@Component
@Data
@NoArgsConstructor
@AllArgsConstructor
public class Student {


    private int studentId;

    private String studentName;

    private int classes;



}
