package com.relevator.config;

/**
 * The LiftConfiguration class holds the configuration settings for the lift.
 */
public class LiftConfiguration {

    private int weightLimit;

    public LiftConfiguration() {
        this.weightLimit = 1000; // Default weight limit in kg
    }

    public int getWeightLimit() {
        return weightLimit;
    }

    public void setWeightLimit(int weightLimit) {
        this.weightLimit = weightLimit;
    }
}
