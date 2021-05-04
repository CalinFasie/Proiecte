package com.bro;

public class Scar {
    private String make;
    private String model;
    private int year;
    static int numberOfCars = 0;

    Scar(String make, String model, int year){
        this.setMake(make);
        this.model = model;
        this.year = year;
        numberOfCars++;
    }
    Scar(Scar scar){
        copy(scar);
    }
    public String getMake(){
        return make;
    }
    public void setMake(String make){
        this.make = make;
    }
    public void copy(Scar scar){
        this.make = scar.make;
    }
}
