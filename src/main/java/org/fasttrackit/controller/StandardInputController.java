package org.fasttrackit.controller;

import java.util.Scanner;

public class StandardInputController {

    public int getPlayerCountFromUser() {
        System.out.println("Please enter number of players:");
        Scanner scanner = new Scanner(System.in);
        return scanner.nextInt();
    }

    public int getTrackNumberFromUser() {
        System.out.println("Please select a track:");
        Scanner scanner = new Scanner(System.in);
        return scanner.nextInt();
    }

    public String getVehicleMakeFromUser() {
        System.out.println("Please enter vehicle make:");
        Scanner scanner = new Scanner(System.in);
        return scanner.nextLine();
    }

    public double getAccelerationSpeedFromUser() {
        System.out.println("Please enter acceleration speed:");
        Scanner scanner = new Scanner(System.in);
        return scanner.nextDouble();
    }
}
