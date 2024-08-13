package com.driver;

public class Car extends Vehicle {
    private int numberOfDoors;

    public Car(String name, int numberOfDoors) {
        super(name);
        this.numberOfDoors = numberOfDoors;
    }

    public int getNumberOfDoors() {
        return numberOfDoors;
    }
}
