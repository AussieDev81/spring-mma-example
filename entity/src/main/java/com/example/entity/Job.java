package com.example.entity;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.Entity;
import javax.persistence.Table;
import java.util.Set;

@Getter
@Setter
@NoArgsConstructor
@Entity
@Table(name = "job")
public class Job extends Vacancy {

    public Job(Long id, boolean published, Set<Discipline> disciplines) {
        super(id, published, disciplines);
    }
}