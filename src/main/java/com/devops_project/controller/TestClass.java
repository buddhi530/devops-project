package com.devops_project.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

    @RestController
    @RequestMapping("/api/v1")
    public class TestClass {

        @GetMapping("/test")
        public String Test(){
            return "test";
        }
    }

