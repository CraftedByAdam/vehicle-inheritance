package com.pluralsight;

public class Moped extends Vehicle {
    private int maxWeight;

    public Moped(String model, String color, int topSpeed, int numberOfPassengers, int cargoCapacity, int fuelCapacity, int maxWeight) {
        super(model, color, topSpeed, numberOfPassengers, cargoCapacity, fuelCapacity);
        this.maxWeight = maxWeight;
    }

    public int getMaxWeight() {
        return maxWeight;
    }
    public void setMaxWeight(int maxWeight) {
        this.maxWeight = maxWeight;
    }

    public void ride () {
        System.out.println("Riding the Moped!");
    }

    @Override
    public String toString() {
        return "Moped{" +
                "maxWeight=" + maxWeight +
                "model=" + getModel() +
                "color=" + getColor() +
                "topSpeed=" + getTopSpeed() +
                "fuelCapacity=" + getFuelCapacity() +
                "numberOfPassengers=" + getNumberOfPassengers() +
                "cargoCapacity=" + getCargoCapacity() +
                '}';
    }
}
