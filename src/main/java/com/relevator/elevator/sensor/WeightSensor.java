package com.relevator.elevator.sensor;

/**
 * The WeightSensor class is responsible for sensing the weight inside the lift.
 */
public class WeightSensor {

    private int currentWeight;

    /**
     * Sets the current weight inside the lift.
     *
     * @param weight The current weight inside the lift.
     */
    public void setCurrentWeight(int weight) {
        this.currentWeight = weight;
    }

    /**
     * Checks if the weight is within the specified limit.
     *
     * @param limit The weight limit.
     * @return True if the weight is within the limit, false otherwise.
     */
    public boolean isWeightWithinLimit(int limit) {
        return currentWeight <= limit;
    }
}
