package com.example.controller;

import com.example.configuration.AppConfiguration;
import com.example.service.ExampleService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;


@RestController
public class HomeController {

    @Autowired
    AppConfiguration appConfiguration;
    @Autowired
    ExampleService exampleService;

    @RequestMapping("module")
    String module(){
        return appConfiguration.getModuleName();
    }

    @RequestMapping("service")
    String service(){
        return exampleService.getMessage();
    }
}
