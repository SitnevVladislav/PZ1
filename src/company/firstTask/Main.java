package com.company.firstTask;

import java.util.ArrayList;
import java.util.Collections;

public class Main {
    public static void main(String[] args) {
        QuadraticEquation func1 = new QuadraticEquation(3,7,4);
        QuadraticEquation func2 = new QuadraticEquation(1, 4, 29);
        QuadraticEquation func3 = new QuadraticEquation(4, 7, -2);

        printFunc(func1);
        printFunc(func2);
        printFunc(func3);

        ArrayList<Double> roots = new ArrayList<>();
        roots.addAll(func1.getRoots());
        roots.addAll(func2.getRoots());
        roots.addAll(func3.getRoots());

        System.out.printf("Максимальный корень: %s \n", Collections.max(roots));
        System.out.printf("Минимальный корень: %s \n", Collections.min(roots));
    }

    public static void printFunc(QuadraticEquation func) {

        if (!func.isException()) {
            for (double x: func.getRoots()) {
                System.out.printf("Корень X = %s \n", x);
            }
            System.out.printf("Экстремум функции E = %s \n", func.getExtremum());
            System.out.printf("Ветви параболы направлены %s \n", func.getBranch()? "вверх": "вниз");
            System.out.printf("На интервале (-inf, %s) %s \n", func.getExtremum(), func.getBranch()? "убывает": "возрастает");
            System.out.printf("На интервале (%s, +inf) %s \n", func.getExtremum(), func.getBranch()? "возрастает": "убывает");
        } else {
            System.out.println("Нет действительных корней");
        }
        System.out.println();
    }


}
