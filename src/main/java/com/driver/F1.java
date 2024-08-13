package com.driver;

public class F1 extends Car {
    private int topSpeed;

    public F1(String name, int numberOfDoors, int topSpeed) {
        super(name, numberOfDoors);
        this.topSpeed = topSpeed;
    }

    public int getTopSpeed() {
        return topSpeed;
    }
}
