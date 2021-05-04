package com.example.springBoot2.dao;

import com.example.springBoot2.model.Person;
import sun.misc.UUDecoder;

import java.util.List;
import java.util.UUID;

public interface PersonDao {
    int insertPerson(UUID id, Person person);// ce face asta?
    // aici nimic, e implementata in FakePDAS, acolo face
//method above allows as to insert a person with a given id

    default int insertPerson(Person person) {// nu e cea de sus overrided?
        UUID id = UUID.randomUUID();//generam id
        return insertPerson(id, person);//?returnam de la cealalta metoda
    }
    List<Person> selectAllPeople();//ce-i asta, metoda?
}
