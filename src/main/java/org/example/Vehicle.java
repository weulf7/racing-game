package org.example;



public class Vehicle  {


    //class variable/static variable
    private static int totalVehicleCount;


    //Instance variables

    private String make;
    private String model;
    private String color;
    private double mileage;
    private double fuelLevel;
    private double maxSpeed;
    private double totalTraveledDistance;
    private boolean damaged;

    public Vehicle() {
        totalVehicleCount++;
    }

    //method overloading
    public double accelerate(double speed){
        return accelerate(speed,1);
    }

    public double accelerate(double speed , double durationInHours){
        System.out.println(make + " is accelerating with " + " " + speed + " km/h " + " for " + durationInHours + " h");

        if (speed > maxSpeed){
            System.out.println("Max speed exceeded");
            return 0;
            }
          else if (speed == maxSpeed){
            System.out.println("Careful!Max speed reached!");

        }
          else {
            System.out.println("Valid speed entered.");
        }

          if (damaged){
              System.out.println("Your car has been damaged");
              return 0;
          }

        //local variables
        double distance = speed * durationInHours;
        totalTraveledDistance = totalTraveledDistance +distance;



        System.out.println("Total traveled distance: " +totalTraveledDistance);


        //use more fuel if speed>120km
//        double mileageMultiplier = 1;
//        if (speed >120){
//            mileageMultiplier*= speed / 100;
//        }


        double usedFuel = distance * mileage / 100;
        fuelLevel -= usedFuel;



        System.out.println("Remaining fuel: " + fuelLevel);

        return distance;
    }
    public void makeSound(){
        System.out.println("Make way!!!");


    }

    public String getMake() {
        return make;
    }

    public void setMake(String make) {
        this.make = make;
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
    //read-only variable
    public static int getTotalVehicleCount() {
        return totalVehicleCount;
    }
}

