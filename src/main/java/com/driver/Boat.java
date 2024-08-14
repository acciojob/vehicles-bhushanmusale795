package com.driver;

public class Boat implements waterVehicle {
    private String name;
    private int capacity;

    public Boat(String name, int capacity) {
        this.name = name;
        this.capacity = capacity;
    }

    @Override
    public String getVehicleName() {
        return name;
    }

    @Override
    public int getVehicleCapacity() {
        return capacity;
    }

    @Override
    public String toString() {
        return "Boat{name='" + name + "', capacity=" + capacity + "}";
    }
}

