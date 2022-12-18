package com.company.secondTask.SoftDrink;

public class Juice extends SoftDrink {

    final double cost = 70.99;

    public Juice(double vol) {
        super(vol);
    }

    @Override
    public double calculateCost() {
        return this.cost * super.getVol() + this.softDrinkTax;
    }
}
