package com.example.service;

import com.example.entity.Vacancy;
import com.example.repo.VacancyRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

@Service
public class VacancyService {

    @Autowired
    private VacancyRepository vacancyRepository;

    public <T extends Vacancy> Vacancy addVacancy(T vacancy){
        return vacancyRepository.save(vacancy);
    }

    @SafeVarargs
    public final <T extends Vacancy>List<Vacancy> addVacancies(T... vacancies){
        return Arrays.stream(vacancies)
                .map(t -> vacancyRepository.save(t))
                .collect(Collectors.toList());
    }

}
