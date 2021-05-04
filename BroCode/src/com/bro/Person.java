package com.bro;

public class Person {

    String name;
    int age;

    Person(String name, int age){// constructor, are acelasi nume
        this.name = name;
        this.age = age;
    }
        public String toString(){
            return this.name + "\n " + this.age;
        }
}
