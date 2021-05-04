package com.bro;

public class Rabbit implements Prey {
    @Override       // asks for method implementation
    public void flee() {
        System.out.println("*The rabbit is fleeing*");
    }
}
