package com.driver;

public class Vehicle {
    private String name;
    private int maxSpeed;

    public Vehicle(String name, int maxSpeed) {
        this.name = name;
        this.maxSpeed = maxSpeed;
    }

    public String getVehicleName() {
        return name;
    }

    public int getMaxSpeed() {
        return maxSpeed;
    }
}

public class Car extends Vehicle {
    private int numberOfDoors;

    public Car(String name, int maxSpeed, int numberOfDoors) {
        super(name, maxSpeed);
        this.numberOfDoors = numberOfDoors;
    }

    public int getNumberOfDoors() {
        return numberOfDoors;
    }
}

public class F1 extends Car {
    private String team;

    public F1(String name, int maxSpeed, String team) {
        super(name, maxSpeed, 2);  // Assuming F1 cars have 2 doors by default
        this.team = team;
    }

    public String getTeam() {
        return team;
    }
}
