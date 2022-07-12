package com.example.entity;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

import javax.persistence.*;
import java.util.Set;

@Getter
@Setter
@ToString
@Entity
@Table(name = "educator")
@NoArgsConstructor
public class Educator extends Stakeholder {

    @OneToMany
    @JoinTable(name = "educator_disciplines",
            joinColumns = @JoinColumn(name = "educator_id"),
            inverseJoinColumns = @JoinColumn(name = "discipline_id"))
    @ToString.Exclude
    private Set<Discipline> disciplines;

    public Educator(Long id, String name, String email, Set<Discipline> disciplines) {
        super(id, name, email);
        this.disciplines = disciplines;
    }
}