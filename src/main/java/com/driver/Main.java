package com.driver;

public class Main {
    public static void main(String[] args) {
        // Test Vehicle
        Vehicle vehicle = new Vehicle("Generic Vehicle", 4);
        System.out.println(vehicle);  // Expected: Vehicle{name='Generic Vehicle', capacity=4}

        // Test Car
        Car car = new Car("Sedan", 5, 4);
        System.out.println(car);  // Expected: Car{name='Sedan', capacity=5, numDoors=4}

        // Test F1
        F1 f1 = new F1("Ferrari F1", 2, 2, "Scuderia Ferrari");
        System.out.println(f1);  // Expected: F1{name='Ferrari F1', capacity=2, numDoors=2, team='Scuderia Ferrari'}

        // Test Boat
        Boat boat = new Boat("Yacht", 10);
        System.out.println(boat);  // Expected: Boat{name='Yacht', capacity=10}
    }
}
