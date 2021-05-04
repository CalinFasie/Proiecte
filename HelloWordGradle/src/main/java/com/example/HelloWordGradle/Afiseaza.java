package com.example.HelloWordGradle;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Afiseaza {
    @RequestMapping("/")
    public String deAfisat() {

        return "Hello to World!";
    }
}