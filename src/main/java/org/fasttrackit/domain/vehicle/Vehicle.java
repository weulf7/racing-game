package org.fasttrackit.domain.vehicle;

import org.fasttrackit.domain.Mobile;

public abstract class Vehicle implements Mobile {

    // class variable / static variable
    private static int totalVehicleCount;

    // instance variables
    private String make;
    private String model;
    private String color;
    private double mileage;
    private double fuelLevel;
    private double maxSpeed;
    protected double totalTraveledDistance;
    private boolean damaged;

    private String password;

    public Vehicle() {
        totalVehicleCount++;
    }

    // method overloading
    public double accelerate(double speed) {
        return accelerate(speed, 1);
    }

    public double accelerate(double speed, double durationInHours) {
        if (speed > maxSpeed) {
            System.out.println("Max speed exceeded.");
            return 0;
        } else if (speed == maxSpeed) {
            System.out.println("Careful! Max speed reached!");
        } else {
            System.out.println("Valid speed entered.");
        }

        if (!canMove()) {
            System.out.println("You cannot accelerate.");
            return 0;
        }

        System.out.println(make + " is accelerating with " + speed + " km/h for " + durationInHours + "h");

        // local variable
        double distance = speed * durationInHours;
        totalTraveledDistance = totalTraveledDistance + distance;

        // same result as the statement above
//        totalTraveledDistance += distance;

        System.out.println("Total traveled distance: " + totalTraveledDistance);

        // use more fuel if speed > 120 km/h
        double mileageMultiplier = 1;
        if (speed > 120) {
            mileageMultiplier = speed / 100;
        }

        double usedFuel = distance * mileage / 100;
        usedFuel *= mileageMultiplier;

        fuelLevel = fuelLevel - usedFuel;

        System.out.println("Remaining fuel: " + fuelLevel);

        return distance;
    }

    @Override
    public String getName() {
        return make;
    }

    @Override
    public boolean canMove() {
        return fuelLevel > 0 && !damaged;
    }

    protected Vehicle reset() {
        totalTraveledDistance = 0;
        fuelLevel = 0;
        damaged = false;

        return this;
    }

    public void makeSound() {
        System.out.println("Make way!!!");
    }

    public String getMake() {
        return make;
    }

    public void setMake(String make) {
        this.make = make.trim();
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public double getMileage() {
        return mileage;
    }

    public void setMileage(double mileage) {
        this.mileage = mileage;
    }

    public double getFuelLevel() {
        return fuelLevel;
    }

    public void setFuelLevel(double fuelLevel) {
        this.fuelLevel = fuelLevel;
    }

    public double getMaxSpeed() {
        return maxSpeed;
    }

    public void setMaxSpeed(double maxSpeed) {
        this.maxSpeed = maxSpeed;
    }

    public double getTotalTraveledDistance() {
        return totalTraveledDistance;
    }

    public void setTotalTraveledDistance(double totalTraveledDistance) {
        this.totalTraveledDistance = totalTraveledDistance;
    }

    public boolean isDamaged() {
        return damaged;
    }

    public void setDamaged(boolean damaged) {
        this.damaged = damaged;
    }

    // read-only variable
    public static int getTotalVehicleCount() {
        return totalVehicleCount;
    }

    @Override
    public String toString() {
        return "Vehicle{" +
                "make='" + make + '\'' +
                ", model='" + model + '\'' +
                ", color='" + color + '\'' +
                ", mileage=" + mileage +
                ", fuelLevel=" + fuelLevel +
                ", maxSpeed=" + maxSpeed +
                ", totalTraveledDistance=" + totalTraveledDistance +
                ", damaged=" + damaged +
                '}';
    }
}
