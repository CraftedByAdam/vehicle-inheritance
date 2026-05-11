package com.pluralsight;

public class Car extends Vehicle {
    private int numberOfDoors;

    public Car(String model, String color, int topSpeed, int numberOfPassengers, int cargoCapacity, int fuelCapacity, int numberOfDoors) {
        super(model, color, topSpeed, numberOfPassengers, cargoCapacity, fuelCapacity);
        this.numberOfDoors = numberOfDoors;
    }

    public int getNumberOfDoors() {
        return numberOfDoors;
    }
    public void setNumberOfDoors(int numberOfDoors) {
        this.numberOfDoors = numberOfDoors;
    }

    public void openTrunk () {
        System.out.println("Opened trunk.");
    }
    public void closeTrunk () {
        System.out.println("Closed trunk.");
    }

}
