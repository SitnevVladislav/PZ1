package com.company.secondTask.Cocktail;

import com.company.secondTask.AlcoholDrink.AlcoholicBeverage;
import com.company.secondTask.AlcoholDrink.Vodka;
import com.company.secondTask.SoftDrink.Juice;

public class Otvetka extends AlcoholicBeverage {
    Vodka vodka;
    Juice juice;

    public Otvetka(Vodka vodka, Juice juice) {
        super(vodka.getVol() + juice.getVol());
        this.vodka = vodka;
        this.juice = juice;
    }

    @Override
    public double calculateCost() {
        return this.vodka.calculateCost() + this.juice.calculateCost();
    }
}
