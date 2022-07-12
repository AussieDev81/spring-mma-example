package com.example.service;

import org.springframework.stereotype.Service;

@Service
public class PackageController {

    public String getPackageName(){
        return this.getClass().getPackageName();
    }
}
