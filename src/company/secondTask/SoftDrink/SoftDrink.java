package com.company.secondTask.SoftDrink;

import com.company.secondTask.Drink;

public abstract class SoftDrink extends Drink {
    final double softDrinkTax = 1;

    public SoftDrink(double vol) {
        super(vol);
    }

    @Override
    public String getDrinkType() {
        return "Безалкогольный напиток";
    }
}
