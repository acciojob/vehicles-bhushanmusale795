package com.driver;

public class Main {
    public static void main(String[] args) {
        // Testing Vehicle
        Vehicle vehicle = new Vehicle("Generic Vehicle", 4);
        System.out.println(vehicle);

        // Testing Car
        Car car = new Car("Sedan", 5, 4);
        System.out.println(car);

        // Testing F1
        F1 f1 = new F1("Ferrari F1", 2, 2, "Scuderia Ferrari");
        System.out.println(f1);

        // Testing Boat
        Boat boat = new Boat("Yacht", 10);
        System.out.println(boat);
    }
}

