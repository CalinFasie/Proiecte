package com.example.demo1.api;

import com.example.demo1.model.Person;
import com.example.demo1.service.PersonService;
import com.sun.istack.internal.NotNull;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.lang.NonNull;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.UUID;

@RequestMapping("api/v1/person")
@RestController
public class PersonController {
    private final PersonService personService; //refference to the actual service
    @Autowired// so Spring injects the actual service into this constructor
    public PersonController(PersonService personService) {
        this.personService = personService;
    }
    @PostMapping
    public void addPerson(@Validated @NotNull @RequestBody Person person){   //method that adds person
        personService.addPerson(person);
    }
    @GetMapping //this method will be served as a get request
    public List<Person>  getAllPeople(){
        return personService.getAllPeople();
    }
    //@PathVariable("id") to search a person by id
    @GetMapping(path = "{id}")
    public Person getPersonById(@PathVariable("id") UUID id){
        return personService.getPersonById(id)
                .orElse(null);
    }
    @DeleteMapping(path = "{id}")
    public void deletePersonById(@PathVariable("id") UUID id){
        personService.deletePerson(id);
    }
    @PutMapping(path = "{id}")
    public void updatePerson(@PathVariable("id") UUID id, @Validated @NonNull @RequestBody Person personToUpdate){
        personService.updatePerson(id, personToUpdate);
    }
}
