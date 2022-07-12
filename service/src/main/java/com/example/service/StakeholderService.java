package com.example.service;

import com.example.entity.Stakeholder;
import com.example.repo.StakeholderRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

@Service
public class StakeholderService {

    @Autowired
    private StakeholderRepository stakeholderRepository;

    public <T extends Stakeholder> Stakeholder addStakeholder(T stakeholder){
        return stakeholderRepository.save(stakeholder);
    }

    @SafeVarargs
    public final <T extends Stakeholder> List<Stakeholder> addStakeholders(T... stakeholders){
        return Arrays.stream(stakeholders)
                .map(t -> stakeholderRepository.save(t))
                .collect(Collectors.toList());
    }
}
