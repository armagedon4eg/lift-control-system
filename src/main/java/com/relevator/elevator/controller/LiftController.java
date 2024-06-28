package com.relevator.elevator.controller;

import com.relevator.elevator.*;

/**
 * The LiftController class integrates all components to control the lift.
 */
public class LiftController {

    private Lift lift;
    private MotorController motorController;
    private DoorController doorController;

    public LiftController(Lift lift, MotorController motorController, DoorController doorController) {
        this.lift = lift;
        this.motorController = motorController;
        this.doorController = doorController;
    }

    /**
     * Calls the lift to the specified floor.
     *
     * @param floor The floor to call the lift to.
     */
    public void callLift(int floor) {
        lift.callLift(floor);
    }

    /**
     * Selects the floor to go to when inside the lift.
     *
     * @param floor The floor to go to.
     */
    public void selectFloor(int floor) {
        lift.selectFloor(floor);
    }

    /**
     * Moves the lift to the next target floor.
     */
    public void moveLift() {
        lift.move();
    }

    /**
     * Opens the lift doors.
     */
    public void openDoors() {
        doorController.openDoors();
    }

    /**
     * Closes the lift doors.
     */
    public void closeDoors() {
        doorController.closeDoors();
    }

    /**
     * Checks if the lift is overloaded.
     *
     * @return True if the lift is overloaded, false otherwise.
     */
    public boolean isOverloaded() {
        return lift.isOverloaded();
    }
}
