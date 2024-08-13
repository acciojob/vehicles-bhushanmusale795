package com.driver;

public class Main {
    public static void main(String[] args) {
        Vehicle vehicle = new Vehicle("Generic Vehicle");
        Car car = new Car("Sedan", 4);
        F1 f1 = new F1("Ferrari F1", 2, 220);
        Boat boat = new Boat("Luxury Yacht", 12);

        System.out.println("Boat Name: " + boat.getVehicleName());
        System.out.println("Boat Capacity: " + boat.getVehicleCapacity());

        System.out.println("Vehicle Name: " + vehicle.getVehicleName());
        System.out.println("Car Name: " + car.getVehicleName() + ", Number of Doors: " + car.getNumberOfDoors());
        System.out.println("F1 Name: " + f1.getVehicleName() + ", Number of Doors: " + f1.getNumberOfDoors() + ", Top Speed: " + f1.getTopSpeed());
    }
}
