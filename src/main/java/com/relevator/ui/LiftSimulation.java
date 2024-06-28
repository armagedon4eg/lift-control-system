package com.relevator.ui;

import com.relevator.elevator.ElevatorService;

/**
 * The LiftSimulation class provides a simple command-line interface to simulate lift operations.
 */
public class LiftSimulation {

    public static void main(String[] args) {
        ElevatorService elevatorService = new ElevatorService();

        // Simulate calling the lift to the 5th floor
        elevatorService.callLift(5);

        // Simulate selecting the 10th floor from inside the lift
        elevatorService.selectFloor(10);

        // Simulate opening and closing doors
        elevatorService.openDoors();
        elevatorService.closeDoors();

        // Check if the lift is overloaded
        if (elevatorService.isOverloaded()) {
            System.out.println("The lift is overloaded.");
        } else {
            System.out.println("The lift is not overloaded.");
        }
    }
}
