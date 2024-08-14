package com.driver;

public class Main {
    public static void main(String[] args) {
        // Test Vehicle
        Vehicle vehicle = new Vehicle("Generic Vehicle", 4);
        assert vehicle.getVehicleName().equals("Generic Vehicle");
        assert vehicle.getVehicleCapacity() == 4;

        // Test Car
        Car car = new Car("Sedan", 5, 4);
        assert car.getVehicleName().equals("Sedan");
        assert car.getVehicleCapacity() == 5;
        assert car.getNumDoors() == 4;

        // Test F1
        F1 f1 = new F1("Ferrari F1", 2, 2, "Scuderia Ferrari");
        assert f1.getVehicleName().equals("Ferrari F1");
        assert f1.getVehicleCapacity() == 2;
        assert f1.getNumDoors() == 2;
        assert f1.getTeam().equals("Scuderia Ferrari");

        // Test Boat
        Boat boat = new Boat("Yacht", 10);
        assert boat.getVehicleName().equals("Yacht");
        assert boat.getVehicleCapacity() == 10;

        System.out.println("All test cases passed!");
    }
}
