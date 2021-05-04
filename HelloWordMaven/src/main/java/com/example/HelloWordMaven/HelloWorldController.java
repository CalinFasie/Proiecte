package com.example.HelloWordMaven;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.swing.plaf.ListUI;
import javax.swing.text.html.ListView;
import java.util.List;

@RestController
public class HelloWorldController {
    @RequestMapping("/")
    public String deAfisat (){
        return "Hello World!";
    }
}
