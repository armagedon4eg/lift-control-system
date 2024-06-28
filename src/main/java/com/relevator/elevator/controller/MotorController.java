package com.relevator.elevator.controller;

/**
 * The MotorController class is responsible for controlling the motor that moves the lift between floors.
 */
public class MotorController {

    /**
     * Moves the lift to the specified floor.
     *
     * @param floor The target floor to move the lift to.
     */
    public void moveToFloor(int floor) {
        // Simulate motor operation
        System.out.println("Motor moving to floor " + floor);
        try {
            Thread.sleep(2000); // Simulate time taken to move to the floor
        } catch (InterruptedException e) {
            Thread.currentThread().interrupt();
            e.printStackTrace();
        }
        System.out.println("Motor arrived at floor " + floor);
    }
}
