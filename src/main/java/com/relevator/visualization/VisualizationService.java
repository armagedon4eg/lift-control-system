package com.relevator.visualization;

/**
 * The VisualizationService class provides methods to visualize the state of the lift.
 */
public class VisualizationService {

    public void visualizeLiftState(int currentFloor, boolean doorsOpen) {
        System.out.println("Lift is at floor " + currentFloor + ". Doors are " + (doorsOpen ? "open" : "closed") + ".");
    }
}
