package com.example.people;

import org.springframework.web.bind.annotation.PostMapping;

import java.util.ArrayList;
import java.util.List;

public class PersonController {
    private List<Person> personList = new ArrayList<>();
    @PostMapping("/Person")
    public void addPerson (Person person){
        personList.add(person);
    }
}
