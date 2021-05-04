package com.example.PeopleM;

import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;
@RestController
public class PeopleController {
    private List<People> peopleList = new ArrayList<>();

    @PostMapping("/Person")
    public void addPeople(@RequestBody People people) {
        if (peopleList.size()==0)
        peopleList.add(people);
        else {
//            for (int i =0; i < peopleList.size(); i++){
//                if (peopleList.getId(i) == people.getId())
            for (People x : peopleList)
                if (!x.getId().equals(people.getId())) {
                    peopleList.add(people);
                }
        }
    }

    @GetMapping("/Persons")
    public List<People> getPeopleList() {
        return peopleList;
    }

    @GetMapping("/Persons/{id}")
    public People getPeopleById(@PathVariable int id) {
        for (People x : peopleList) {
            if (x.getId().equals(id))
                return x;
            }
        return null;
    }
}
