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
        double mileageMultiplier = 1;
        if (speed >120){
            mileageMultiplier*= speed / 100;
        }


        double usedFuel = distance * mileage / 100;
        fuelLevel -= usedFuel;



        System.out.println("Remaining fuel: " + fuelLevel);

        return distance;
    }
    public void makeSound(){
        System.out.println("Make way!!!");

        double number = 0;
        System.out.println(number);
    }
}

