package com.driver;

public class Vehicle {
    private String name;
    private int capacity;

    public Vehicle(String name, int capacity) {
        this.name = name;
        this.capacity = capacity;
    }

    public String getVehicleName() {
        return name;
    }

    public int getVehicleCapacity() {
        return capacity;
    }

    @Override
    public String toString() {
        return "Vehicle{name='" + name + "', capacity=" + capacity + "}";
    }
}
