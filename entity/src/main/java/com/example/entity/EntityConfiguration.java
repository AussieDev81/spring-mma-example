package com.example.entity;

import lombok.Getter;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Configuration;

@Getter
@Configuration
public class EntityConfiguration {

    @Value("${module.name}")
    private String moduleName;
}
