package com.company.secondTask.AlcoholDrink;

public class Vodka extends AlcoholicBeverage {
    final double cost = 120.3;

    public Vodka(double vol) {
        super(vol);
    }

    @Override
    public double calculateCost() {
        return this.cost * super.getVol() + this.alcoholTax;
    }
}
