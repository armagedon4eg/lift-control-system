package com.relevator.elevator.controller;

/**
 * The DoorController class is responsible for controlling the lift's doors.
 */
public class DoorController {

    /**
     * Opens the lift doors.
     */
    public void openDoors() {
        System.out.println("Opening doors");
        // Simulate door operation
        try {
            Thread.sleep(1000); // Simulate time taken to open doors
        } catch (InterruptedException e) {
            Thread.currentThread().interrupt();
            e.printStackTrace();
        }
        System.out.println("Doors are open");
    }

    /**
     * Closes the lift doors.
     */
    public void closeDoors() {
        System.out.println("Closing doors");
        // Simulate door operation
        try {
            Thread.sleep(1000); // Simulate time taken to close doors
        } catch (InterruptedException e) {
            Thread.currentThread().interrupt();
            e.printStackTrace();
        }
        System.out.println("Doors are closed");
    }
}
