package com.entity;

import org.hibernate.annotations.Cascade;

import javax.persistence.*;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import java.util.HashSet;
import java.util.Set;

@Entity
public class Grade {
    @Id @GeneratedValue(strategy = GenerationType.AUTO)
    private int gradeId ;
    private String gradeName;


    @OneToMany(targetEntity=Student.class,cascade = CascadeType.ALL)	//一对多，让Employee维护外键
    @JoinColumn(name = "grade_id")
    private Set<Student> studentSet = new HashSet<Student>();

    public Set<Student> getStudentSet() {
        return studentSet;
    }

    public void setStudentSet(Set<Student> studentSet) {
        this.studentSet = studentSet;
    }
    public int getGradeId() {
        return gradeId;
    }

    public void setGradeId(int gradeId) {
        this.gradeId = gradeId;
    }

    public String getGradeName() {
        return gradeName;
    }

    public void setGradeName(String gradeName) {
        this.gradeName = gradeName;
    }
}
