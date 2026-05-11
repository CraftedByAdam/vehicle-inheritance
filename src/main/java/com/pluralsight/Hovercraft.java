package com.pluralsight;

public class Hovercraft extends Vehicle {
    private int airCushionPressure;

    public Hovercraft(String model, String color, int topSpeed, int numberOfPassengers, int cargoCapacity, int fuelCapacity, int airCushionPressure) {
        super(model, color, topSpeed, numberOfPassengers, cargoCapacity, fuelCapacity);
        this.airCushionPressure = airCushionPressure;
    }

    public int getAirCushionPressure() {
        return airCushionPressure;
    }
    public void setAirCushionPressure(int airCushionPressure) {
        this.airCushionPressure = airCushionPressure;
    }

    public void hover() {
        System.out.println("Hovercraft is flying");
    }
}
