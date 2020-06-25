package org.fasttrackit;

import org.fasttrackit.service.Game;

import java.util.*;

// one-line comment
public class App {

    public static void main(String[] args) {
        Game game = new Game();
        game.start();
//        Map<String,String>descriptionTranslation = new HashMap<>();
//        descriptionTranslation.put("en","Some description");
//        descriptionTranslation.put("ro","O descriere");
//        descriptionTranslation.put("ro","O alta descriere");
//
//        System.out.println(descriptionTranslation.size());
//
//        for (Map.Entry<String,String> entry :descriptionTranslation.entrySet()){
//            System.out.println(entry.getKey()+ ": "+entry.getValue());
//        }

//
//        Set<String> cities = new HashSet<>();
//        cities.add("Cluj-Napoca");
//        cities.add("Oradea");
//        cities.add("London");
//        cities.add("London");
//
//        System.out.println("Number of unique cities: " + cities.size());
//
//        Iterator<String> citiesIterator = cities.iterator();
//
//        while (citiesIterator.hasNext()) {
//            System.out.println(citiesIterator.next());
//        }
//
//        do {
//            System.out.println(citiesIterator.next());
//        } while (citiesIterator.hasNext());


//        List<String> authors = new ArrayList<>();
//        authors.add("Tolkien");
//        authors.add("C.S. Lewis");
//        authors.add("J.K.Rowling");
//        authors.add("Eminescu");
//
//
//        boolean eminescuFavoriteAuthor = authors.contains("Eminescu");
//
//        String[] authorsArray = new String[4];
//        authorsArray[0] = "Eminescu";
//
//        for (String author : authorsArray) {
//            if (author.equals("Eminescu")) {
//                eminescuFavoriteAuthor = true;
//            }
//        }
//
//        String email = "flaviu@fasttrackit.org";
//        String[] emailParts = email.split("@");
//
//        System.out.println(emailParts[0]);
//        System.out.println(emailParts[1]);
//
//
//        List<String> authors2 = Arrays.asList("test", "test2");

//        // polymorphism
//        Vehicle vehicle = new CheatingVehicle();
//        vehicle.setMake("Cheating vehicle");
//
//        // object type determines method implementation
//        vehicle.accelerate(60, 1);
//        System.out.println("Accelerate with 1 param");
//        vehicle.accelerate(60);
//
//        // variable type determines what methods can be invoked
//        // type casting
//        if (vehicle instanceof CheatingVehicle) {
//            ((CheatingVehicle) vehicle).cheat();
//        }

//        Vehicle vehicle1 = new Vehicle();
//        vehicle1.setMake("     VW    ");
//        vehicle1.setModel("Golf");
//        vehicle1.setColor("red");
//
//        System.out.println(vehicle1.getMake());
//
//        System.out.println(vehicle1.totalTraveledDistance);
//
//        vehicle1.accelerate(60, 1);
//
//        System.out.println("Total vehicle count: " + Vehicle.getTotalVehicleCount());

////        vehicle1.totalVehicleCount = 1;
//
//        Vehicle vehicle2 = new Vehicle();
////        vehicle2.totalVehicleCount = 4;
//
////        Vehicle.totalVehicleCount = 10;
//
//        new Vehicle();
//
//        System.out.println("Total count from vehicle1: " + vehicle1.totalVehicleCount);
//        System.out.println("Total count from vehicle2: " + vehicle2.totalVehicleCount);
//        System.out.println("Total count from Vehicle class: " + Vehicle.totalVehicleCount);

//        // String pool
//        String a = "test";
//        // String literals
//        String b = "test";
//        String c = new String("test");
//
//        System.out.println("a == b: " + (a == b));
//        System.out.println("a == c: " + (a == c));
//        System.out.println("a equals c: " + (a.equals(c)));

//        Engine engine = new Engine();
//        engine.manufacturer = "Renault";
//
////        AutoVehicle autoVehicle = new AutoVehicle(engine);
//
//        Car car = new Car(engine);
//        car.make = "Dacia";
//
//        System.out.println(car.make);

//
//        autoVehicle.engine = engine;

//        Car carReference = new Car();
//        carReference.make = "Skoda";
//        carReference.model = "Fabia";
//        carReference.mileage = 7.5;
//        carReference.fuelLevel = 60;
//        carReference.color = "red";
//        carReference.maxSpeed = 300;
//
//        carReference.engine = new Engine();
//        carReference.engine.manufacturer = "VW";
//        carReference.engine.capacity = 1900;
//
//        Engine engine1 = new Engine();
//        engine1.manufacturer = "VW";
//        engine1.capacity = 1900;
//
//        carReference.engine = engine1;
//
//        double currentDistance = carReference.accelerate(100, 0.5);
//
//        System.out.println("Total distance before repair: " + carReference.totalTraveledDistance);
//        Mechanic mechanic = new Mechanic();
//        mechanic.repair(carReference);
//        System.out.println("Total distance after repair: " + carReference.totalTraveledDistance);
//
//
//        System.out.println(carReference.make);
//        System.out.println(carReference.model);
//        System.out.println(carReference.mileage);
//        System.out.println(carReference.fuelLevel);
//        System.out.println(carReference.color);
//        System.out.println(carReference.maxSpeed);
//
//        System.out.println(carReference.totalTraveledDistance);
//        System.out.println(carReference.damaged);
//        System.out.println(carReference.doorCount);
//
//        System.out.println(carReference);
//
//
//        Car car2 = new Car();
//        car2.make = "Mercedes";
//        car2.model = "CLS";
//        car2.color = "black";
//
//        double car2Distance = car2.accelerate(120, 3);
//
//        car2.make = carReference.make;
//
//
//        // concatenation
//        System.out.println(car2.make + " " + carReference.make);
//
//        System.out.println("Car2 make: " + car2.make);
//        System.out.println("CarReference make: " + carReference.make);
//
//        Car car2Backup = car2;
//
//        car2 = carReference;
//
//        System.out.println("Initial name");
//        System.out.println(car2.make);
//        System.out.println(carReference.make);
//
//        car2.make = "Audi";
//
//        System.out.println("Updated name");
//
//        System.out.println(car2.make);
//        System.out.println(carReference.make);


        // NPE (NullPointerException) example
//        car2 = null;
//        System.out.println(car2.make);

//        System.out.println("Modulo (modulus) examples:");
//        System.out.println(4 % 2);
//        System.out.println(4 % 3);
//
//        System.out.println("Is 5 even?");
//        System.out.println(5 % 2 == 0);
    }
}
