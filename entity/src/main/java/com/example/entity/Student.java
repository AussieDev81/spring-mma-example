package com.example.entity;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;

@Getter
@Setter
@ToString
@NoArgsConstructor
@Entity
@Table(name = "student")
public class Student extends Stakeholder {

    @Column(name = "student_identifier")
    private String studentIdentifier;

    public Student(Long id, String name, String email, String studentIdentifier) {
        super(id, name, email);
        this.studentIdentifier = studentIdentifier;
    }
}