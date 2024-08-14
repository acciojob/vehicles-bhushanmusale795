package com.driver;

public class Car extends Vehicle {
    private int numDoors;

    public Car(String name, int capacity, int numDoors) {
        super(name, capacity);
        this.numDoors = numDoors;
    }

    public int getNumDoors() {
        return numDoors;
    }

    @Override
    public String toString() {
        return "Car{name='" + getVehicleName() + "', capacity=" + getVehicleCapacity() + ", numDoors=" + numDoors + "}";
    }
}
