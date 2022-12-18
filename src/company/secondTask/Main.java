package com.company.secondTask;

import com.company.secondTask.AlcoholDrink.AlcoholicBeverage;
import com.company.secondTask.AlcoholDrink.Vodka;
import com.company.secondTask.Cocktail.Otvetka;
import com.company.secondTask.SoftDrink.Juice;

public class Main {
    public static void main(String[] args) {
        Vodka vodka = new Vodka(5);
        Juice juice = new Juice(10);

        AlcoholicBeverage otvertka = new Otvetka(vodka, juice);

        System.out.printf("Стоимость коктейля - %s \n",otvertka.calculateCost());
        System.out.printf("Объем коктейля - %s \n", otvertka.getVol());
        System.out.printf("Тип напитка - %s \n", otvertka.getDrinkType());
    }
}
