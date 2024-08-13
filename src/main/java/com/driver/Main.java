package com.driver;

public class Main {
    public static void main(String[] args) {
        // Test Vehicle
        Vehicle vehicle = new Vehicle("Truck", 80);
        System.out.println(vehicle.getVehicleName()); // Expected: Truck
        System.out.println(vehicle.getMaxSpeed());    // Expected: 80

        // Test Car
        Car car = new Car("Sedan", 150, 4);
        System.out.println(car.getVehicleName());     // Expected: Sedan
        System.out.println(car.getMaxSpeed());        // Expected: 150
        System.out.println(car.getNumberOfDoors());   // Expected: 4

        // Test F1
        F1 f1 = new F1("Ferrari", 300, "Ferrari Team");
        System.out.println(f1.getVehicleName());      // Expected: Ferrari
        System.out.println(f1.getMaxSpeed());         // Expected: 300
        System.out.println(f1.getTeam());             // Expected: Ferrari Team

        // Test Boat
        Boat boat = new Boat("Yacht", 20);
        System.out.println(boat.getVehicleName());    // Expected: Yacht
        System.out.println(boat.getVehicleCapacity());// Expected: 20
    }
}
