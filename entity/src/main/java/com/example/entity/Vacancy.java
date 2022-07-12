package com.example.entity;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.*;
import java.util.Set;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Entity
@Table(name = "vacancy")
@Inheritance(strategy = InheritanceType.TABLE_PER_CLASS)
public class Vacancy implements Publishable {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "id", nullable = false)
    private Long id;

    @Column(name = "published")
    private boolean published;

    @ManyToMany
    @JoinTable(
            name = "vacancy_disciplines",
            joinColumns = @JoinColumn(name = "vacancy_id"),
            inverseJoinColumns = @JoinColumn(name = "discipline_id"))
    private Set<Discipline> linkedDisciplines;

}