package com.bro;

public class Garage {
    void park(Car1 car1){
        System.out.println("The car " + car1.name + " is parked");
    }
    void park(Bicycle bicycle){
        System.out.println("The bike " + bicycle.name + " lies next to door");
    }
}
