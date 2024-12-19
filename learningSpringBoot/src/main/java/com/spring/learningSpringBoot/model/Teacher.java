package com.spring.learningSpringBoot.model;


import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.stereotype.Component;

@Component
@Data
@NoArgsConstructor
@AllArgsConstructor
public class Teacher {

    private int teacherId;

    private String teacherName;

    private int noOfPeriods;

}
