package com.driver;

public class F1 extends Car {
    private String team;

    public F1(String name, int capacity, int numDoors, String team) {
        super(name, capacity, numDoors);
        this.team = team;
    }

    public String getTeam() {
        return team;
    }

    @Override
    public String toString() {
        return "F1{name='" + getVehicleName() + "', capacity=" + getVehicleCapacity() + ", numDoors=" + getNumDoors() + ", team='" + team + "'}";
    }
}
