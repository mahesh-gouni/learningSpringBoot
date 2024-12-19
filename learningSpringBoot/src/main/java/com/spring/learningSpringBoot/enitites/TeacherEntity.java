package com.spring.learningSpringBoot.enitites;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

import java.util.HashSet;
import java.util.Set;

@Entity
@Data
@NoArgsConstructor
@AllArgsConstructor
@ToString
public class TeacherEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "teacherId")
    private int teacherId;
    @Column(name = "teacherName")
    private String teacherName;
    @Column(name = "noOfPeriods")
    private int noOfPeriods;


    @ToString.Exclude
    @ManyToMany(fetch = FetchType.LAZY,cascade = {CascadeType.PERSIST,CascadeType.MERGE,CascadeType.DETACH,CascadeType.REFRESH})
    @JoinTable(name = "STUDENT_TEACHER_MAPPING",joinColumns = @JoinColumn(name = "teacherId"),
    inverseJoinColumns = @JoinColumn(name = "studentId"))
    private Set<StudentEntity> studentEntitySet = new HashSet<>();

}
