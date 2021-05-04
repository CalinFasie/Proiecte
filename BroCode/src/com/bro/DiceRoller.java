package com.bro;

import java.util.Random;

public class DiceRoller {
        Random random;
        int number = 0;
    DiceRoller(){ // constructorul clasei, are acelasi nume cu clasa
        random = new Random();
        roll();
    }
    void roll() { //o methoda care nu returneaza nimic
        number = random.nextInt(6)+1;
        System.out.println(number);
       }
}
