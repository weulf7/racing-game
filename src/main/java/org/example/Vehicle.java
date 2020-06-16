package org.example;

public class Vehicle  {

    //Instance variables

    String make;
    String model;
    String color;
    double mileage;
    double fuelLevel;
    double maxSpeed;
    double totalTraveledDistance;
    boolean damaged;

    public double accelerate(double speed , double durationInHours){
        System.out.println(make + " is accelerating with " + " " + speed + " km/h " + " for " + durationInHours + " h");

        double distance = speed * durationInHours;

//        totalTraveledDistance += distance;

        totalTraveledDistance = totalTraveledDistance +distance;



        System.out.println("Total traveled distance: " +totalTraveledDistance);

        double usedFuel = distance * mileage / 100;

        fuelLevel -= usedFuel;



        System.out.println("Remaining fuel: " + fuelLevel);

        return distance;
    }
}

