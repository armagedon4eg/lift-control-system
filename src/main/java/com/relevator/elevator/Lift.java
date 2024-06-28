package com.relevator.elevator;

import com.relevator.config.LiftConfiguration;

/**
 * The Lift class represents the elevator itself.
 */
public class Lift {

    private int currentFloor;
    private int targetFloor;
    private boolean moving;
    private LiftConfiguration configuration;

    public Lift(LiftConfiguration configuration) {
        this.configuration = configuration;
        this.currentFloor = 0; // Assuming ground floor as the initial floor
        this.moving = false;
    }

    /**
     * Calls the lift to the specified floor.
     *
     * @param floor The target floor.
     */
    public void callLift(int floor) {
        this.targetFloor = floor;
        move();
    }

    /**
     * Selects the floor to go to when inside the lift.
     *
     * @param floor The target floor.
     */
    public void selectFloor(int floor) {
        this.targetFloor = floor;
        move();
    }

    /**
     * Moves the lift to the next target floor.
     */
    public void move() {
        if (currentFloor != targetFloor) {
            moving = true;
            System.out.println("Lift moving from floor " + currentFloor + " to floor " + targetFloor);
            currentFloor = targetFloor; // Simulating instant move for simplicity
            moving = false;
            System.out.println("Lift arrived at floor " + currentFloor);
        }
    }

    /**
     * Checks if the lift is overloaded.
     *
     * @return True if the lift is overloaded, false otherwise.
     */
    public boolean isOverloaded() {
        // Placeholder for actual weight check logic
        return false;
    }

    public int getCurrentFloor() {
        return currentFloor;
    }

    public int getWeightLimit() {
        return configuration.getWeightLimit();
    }
}
