package com.company.secondTask.AlcoholDrink;

import com.company.secondTask.Drink;

public abstract class AlcoholicBeverage extends Drink {
    final double alcoholTax = 10;

    public AlcoholicBeverage(double vol) {
        super(vol);
    }

    @Override
    public String getDrinkType() {
        return "Алкогольный напиток";
    }
}
