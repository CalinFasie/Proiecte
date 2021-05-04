package com.example.springBoot2.model;

import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.UUID;

public class Person {
    private final String id;
    private final String name;

    public Person(@JsonProperty("id") String id, //pt a gestiona Postman
                  @JsonProperty("name") String name) {
        this.id = id;
        this.name = name;
    }

    public String getId() {
        return id;
    }
    public String getName() {
        return name;
    }
}
