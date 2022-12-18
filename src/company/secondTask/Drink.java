package com.company.secondTask;

public abstract class Drink {
    double vol;

    public Drink(double vol) {
        this.vol = vol;
    }

    public double getVol() {
        return vol;
    }

    public abstract double calculateCost();

    public abstract String getDrinkType();
}
