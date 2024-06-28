package com.relevator.elevator;

import com.relevator.elevator.controller.*;
import com.relevator.elevator.sensor.*;
import com.relevator.config.LiftConfiguration;

/**
 * The ElevatorService class provides high-level operations for the elevator system.
 */
public class ElevatorService {

    private Lift lift;
    private MotorController motorController;
    private DoorController doorController;
    private LiftController liftController;
    private DoorSensor doorSensor;
    private LaserSensor laserSensor;
    private WeightSensor weightSensor;

    public ElevatorService() {
        // Initialize components
        this.lift = new Lift(new LiftConfiguration());
        this.motorController = new MotorController();
        this.doorController = new DoorController();
        this.liftController = new LiftController(lift, motorController, doorController);
        this.doorSensor = new DoorSensor();
        this.laserSensor = new LaserSensor();
        this.weightSensor = new WeightSensor();
    }

    /**
     * Calls the lift to the specified floor.
     *
     * @param floor The target floor.
     */
    public void callLift(int floor) {
        liftController.callLift(floor);
    }

    /**
     * Selects the floor to go to when inside the lift.
     *
     * @param floor The target floor.
     */
    public void selectFloor(int floor) {
        liftController.selectFloor(floor);
    }

    /**
     * Opens the lift doors if it is safe to do so.
     */
    public void openDoors() {
        if (doorSensor.areDoorsSafeToOpen() && laserSensor.isClear()) {
            liftController.openDoors();
        } else {
            System.out.println("Doors cannot be opened.");
        }
    }

    /**
     * Closes the lift doors if it is safe to do so.
     */
    public void closeDoors() {
        if (doorSensor.areDoorsSafeToClose() && laserSensor.isClear()) {
            liftController.closeDoors();
        } else {
            System.out.println("Doors cannot be closed.");
        }
    }

    /**
     * Checks if the lift is overloaded.
     *
     * @return True if the lift is overloaded, false otherwise.
     */
    public boolean isOverloaded() {
        return !weightSensor.isWeightWithinLimit(lift.getWeightLimit());
    }
}
