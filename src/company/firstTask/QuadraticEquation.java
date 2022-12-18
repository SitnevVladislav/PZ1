package com.company.firstTask;

import java.util.ArrayList;

public class QuadraticEquation {
    private double a;
    private double b;
    private double c;
    private double extremum;
    private boolean exception;
    private boolean branch;
    private ArrayList<Double> roots = new ArrayList<>();

    public QuadraticEquation(double a, double b, double c) {
        this.a = a;
        this.b = b;
        this.c = c;
        this.extremum = (0 - b) / (2 * a);
        this.branch = a > 0;

        double d = this.b * this.b - 4 * this.a * this.c;
        this.exception = false;
        if (d > 0) {
            double x1 = (-this.b - Math.sqrt(d)) / (2 * this.a);
            double x2 = (-this.b + Math.sqrt(d)) / (2 * this.a);
            this.roots.add(x1);
            this.roots.add(x2);
        } else if (d == 0) {
            double x;
            x = -this.b / (2 * this.a);
            System.out.println(x);
            this.roots.add(x);
        } else {
            this.exception = true;
        }
    }

    public boolean isException() {
        return this.exception;
    }

    public ArrayList<Double> getRoots() {
        return this.roots;
    }

    public boolean getBranch() {
        return this.branch;
    }

    public double getExtremum() {
        return this.extremum;
    }

}
