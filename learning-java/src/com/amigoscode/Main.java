package com.amigoscode;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.Arrays;
import java.util.Date;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
// Classes and objects
    Passport passport1 = new Passport("124",  LocalDate.of(2021, 5, 1));

    }
    static class Passport {
        String number;
        LocalDate expiryDate;
        Passport (String number, LocalDate expiryDate){
            this.number = number;
            this.expiryDate = expiryDate;
        }
    }
}
