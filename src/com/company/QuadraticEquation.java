package com.company;

public class QuadraticEquation {
    private double a, b, c;

    public QuadraticEquation() {

    }

    public QuadraticEquation(double a, double b, double c) {
        this.a = a;
        this.b = b;
        this.c = c;

    }

    public double getA() {
        return a;
    }

    public void setA(double a) {
        this.a = a;
    }

    public double getB() {
        return b;
    }

    public void setB(double b) {
        this.b = b;
    }

    public double getC() {
        return c;
    }

    public void setC(double c) {
        this.c = c;
    }

    public double delta() {
        return Math.pow(this.b, 2) - 4 * this.a * this.c;
    }

    public double geetRoot1() {
        return (-this.b + Math.pow(delta(), 0.5)) / (2 * this.a);
    }

    public double geetRoot2() {
        return (-this.b - Math.pow(delta(), 0.5)) / (2 * this.a);
    }

    public double doubleRoot() {
        return -this.b / (2 * this.a);
    }

    public void kiemTra() {
        if (delta() < 0) {
            System.out.println("Phương trình vô nghiệm");
        } else if (delta() > 0) {
            System.out.println("Phương trình có nghiệm là:x1= " + geetRoot1() + "và x2= " + geetRoot2());
        } else
            System.out.println("Phương trình có nghiệm là: " + doubleRoot());
    }
}

