package com.spring.learningSpringBoot.enitites;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;
import org.springframework.stereotype.Component;

import java.util.HashSet;
import java.util.Set;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Entity
@ToString
public class StudentEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "studentId")
    private int studentId;

    @Column(name = "studentName")
    private String studentName;

    @Column(name = "classes")
    private int classes;

    @ToString.Exclude
    @ManyToMany(fetch = FetchType.LAZY,cascade = {CascadeType.PERSIST,CascadeType.MERGE,CascadeType.DETACH,CascadeType.REFRESH})
    @JoinTable(name = "STUDENT_TEACHER_MAPPING",joinColumns = @JoinColumn(name = "studentId"),
    inverseJoinColumns = @JoinColumn(name = "teacherId"))
    private Set<TeacherEntity> teacherEntitySet = new HashSet<>();


}
