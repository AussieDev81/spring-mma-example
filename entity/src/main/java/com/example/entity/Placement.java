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
@Table(name = "placement")
public class Placement extends Vacancy {

    public Placement(Long id, boolean published, Set<Discipline> disciplines) {
        super(id, published, disciplines);
    }
}