package com.example.configuration;

import lombok.Getter;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Configuration;

@Getter
@Configuration
public class AppConfiguration {

    @Value("${module.name}")
    private String moduleName;
}
