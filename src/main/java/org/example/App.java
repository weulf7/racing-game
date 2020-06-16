package org.example;

/**
 * Hello world!
 *
 */

//one line comment
public class App 
{

    public static void main(String[] args )
    {
        System.out.println( "Welcome to the Racing Game" );

        //Instantiation

        Car carReference = new Car();
        carReference.make = "Skoda";
        carReference.model = "Fabia";
        carReference.mileage = 7.5;
        carReference.color = "green";
        carReference.fuelLevel = 60;
        carReference.maxSpeed = 300;

        System.out.println("\uD83D\uDE97");

//        System.out.println(carReference.make);
//        System.out.println(carReference.model);
//        System.out.println(carReference.mileage);
//        System.out.println(carReference.color);
//        System.out.println(carReference.fuelLevel);
//        System.out.println(carReference.maxSpeed);


//        carReference.engine = new Engine();
//        carReference.engine.manufacturer="VW";
//        carReference.engine.capacity= 1900;
//        System.out.println(carReference.engine.capacity);

        Engine engine1 = new Engine();
        engine1.manufacturer = "VW";
        engine1.capacity = 1900;

        carReference.engine = engine1;

//        engine1.capacity= 2000;

//        System.out.println(carReference.engine.capacity);
//
//        System.out.println(carReference.engine.capacity + " " + engine1.capacity);


        double currentDistance = carReference.accelerate(100, 1);

        System.out.println("Total distance before repair: " +carReference.totalTraveledDistance);
        Mechanic mechanic = new Mechanic();
        mechanic.repair(carReference);

        System.out.println("Total distance after repair : " +carReference.totalTraveledDistance);


//        System.out.println(carReference.totalTraveledDistance);
//        System.out.println(carReference.doorCount);
//        System.out.println(carReference.damaged);
//
//        System.out.println(carReference);

        Car car2 = new Car();
        car2.make = "Mercedes";
        car2.model ="CLS";
        car2.color ="black";

        double car2Distance = car2.accelerate(120, 3);

        car2.make = carReference.make;








        //concatenation ;alaturarea mai multor stringuri

//        System.out.println(car2.make + " " + carReference.make);
//
//        System.out.println("Car 2 make: " + car2.make);
//        System.out.println("CarReference make: " + carReference.make);
//
//        car2 = carReference;
//
//        System.out.println("Initial name");
//
//        System.out.println(car2.make);
//        System.out.println(carReference.make);
//
//        car2.make ="Audi";
//
//        System.out.println("Updated name");
//
//
//        System.out.println(car2.make);
//        System.out.println(carReference.make);

//        car2 = null;
//        System.out.println(car2.make);

//        System.out.println("Modulo (modulus) examples : ");
//        System.out.println(4 % 2);
//        System.out.println(4 % 3);
//
//        System.out.println("Is 5 even?");
//
//        System.out.println(5 % 2 == 0);



    }
}
