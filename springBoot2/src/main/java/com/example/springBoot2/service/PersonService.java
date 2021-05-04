package com.example.springBoot2.service;

import com.example.springBoot2.dao.PersonDao;
import com.example.springBoot2.model.Person;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class PersonService {
    private final PersonDao personDao; //un obiect, o referinta
@Autowired// injectam interfata PersonDao
    public PersonService(@Qualifier("fakeDao") PersonDao personDao) {//constructorul, ne-a fost cerut
//pt ca putem avea multiple implementari ale PersonDao adaugam @Qualifier
    this.personDao = personDao;
    }
    public int addPerson(Person person){
        return personDao.insertPerson(person);
        // genereaza id, returneaza?
    }
    public List<Person> getAllPeople(){
        return personDao.selectAllPeople();
    }
}
