package org.example;

/**
 * Hello world!
 *
 */
public class App 
{

    public static void main(String[] args )
    {
        System.out.println( "Welcome to the Racing Game" );
        Car carReference = new Car();
        carReference.make = "Skoda";
        carReference.model = "Fabia";
        carReference.mileage = 7.5;
        carReference.color = "green";
        carReference.fuelLevel = 60;
        carReference.maxSpeed = 300;

        System.out.println(carReference.make);
        System.out.println(carReference.model);
        System.out.println(carReference.mileage);
        System.out.println(carReference.color);
        System.out.println(carReference.fuelLevel);
        System.out.println(carReference.maxSpeed);
    }
}
