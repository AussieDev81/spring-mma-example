package com.example.controller;

import com.example.service.PackageController;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;


@RestController
public class HomeController {

    @Autowired
    private PackageController packageController;

    @GetMapping({"","/"})
    public String home(){
        return "Hello! 👋";
    }

    @GetMapping("package-name")
    public String packageName(){
        return String.format("The 'service' module package name is <b>%s</b>",
                packageController.getPackageName());
    }

}
