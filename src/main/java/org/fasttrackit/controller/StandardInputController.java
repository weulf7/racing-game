package org.fasttrackit.controller;

import org.fasttrackit.controller.utils.ScannerUtils;

public class StandardInputController {

    public int getPlayerCountFromUser() {
        System.out.println("Please enter number of players:");
        return ScannerUtils.readNExtSingleInt();
    }

    public int getTrackNumberFromUser() {
        System.out.println("Please select a track:");
        return ScannerUtils.readNExtSingleInt();
    }

    public String getVehicleMakeFromUser() {
        System.out.println("Please enter vehicle make:");
        return ScannerUtils.SCANNER.nextLine();
    }

    public double getAccelerationSpeedFromUser() {
        System.out.println("Please enter acceleration speed:");
        return ScannerUtils.readNExtSingleDouble();
    }
}
