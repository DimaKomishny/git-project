package com.calc;

public class App {

    public static void main(String[] args) {
        App calculator = new App();
        System.out.println(calculator.add(4, 2));
        System.out.println(calculator.subtraction(4, 2));
        System.out.println(calculator.division(5D, 3D));
    }

    public int add(int a, int b) {
        return a + b;
    }

    public int subtraction(int a, int b) {
        return a - b;
    }

    public double division(double a, double b) {
        return a / b;
    }

    public double mult(double a, double b) {
        return a * b;
    }
}

