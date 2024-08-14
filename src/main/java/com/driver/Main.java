package com.driver;

public class Main {
    public static void main(String[] args) {
        // Test Vehicle
        Vehicle vehicle = new Vehicle("Generic Vehicle", 4);
        System.out.println(vehicle);

        // Test Car
        Car car = new Car("Sedan", 5, 4);
        System.out.println(car);

        // Test F1
        F1 f1 = new F1("Ferrari F1", 2, 2, "Scuderia Ferrari");
        System.out.println(f1);

        // Test Boat
        Boat boat = new Boat("Yacht", 10);
        System.out.println(boat);
    }
}
