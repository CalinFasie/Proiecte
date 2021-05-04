package com.example.springBoot2.api;

import com.example.springBoot2.model.Person;
import com.example.springBoot2.service.PersonService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;

//@RequestMapping("api/v1/person")
@RestController
public class PersonController {
    private List<Person> newList = new ArrayList<>();
    //reference to the actual service
    private final PersonService personService;

    @Autowired// astfel Spring injecteaza PersonService in acest constructor
    public PersonController(PersonService personService) {
        this.personService = personService;
    }

    @PostMapping("/Person")// spune ca acest cod va servi ca Post, Get...
    public void addPerson(@RequestBody Person person) { //Json>person
        //       personService.addPerson(person);
        if (newList.size() == 0)
            newList.add(person);
        else {
            for (Person index : newList) {
                if (!index.getId().equals(person.getId())) {
                    newList.add(person);
                }
            }
        }
    }

    @GetMapping("/Persons")
    public List<Person> getAllPersons() {
        return newList;
    }

    @GetMapping("/Person/{id}")
    public Person getById(@PathVariable String id) {
        for (Person person : newList) {
            if (person.getId().equals(id)) {
                return person;
            }
        }
        return null;
    }
}
