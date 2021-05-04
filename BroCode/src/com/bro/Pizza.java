package com.bro;

public class Pizza {
    String bread;
    String sauce;
    String cheese;
    String topping;
    Pizza(String bread, String sauce, String cheese){ //constructor, acelasi nume cu clasa + () si {}
        this.bread = bread;
        this.sauce = sauce;
        this.cheese = cheese;
      }

    Pizza(String bread, String sauce, String cheese, String topping){ //constructor, acelasi nume cu clasa + () si {}
        this.bread = bread;
        this.sauce = sauce;
        this.cheese = cheese;
        this.topping = topping;
    }
}
