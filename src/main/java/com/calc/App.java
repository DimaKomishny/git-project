package com.calc;

public class App {

    public static void main(String[] args) {
        App calculator = new App();
        System.out.println(calculator.add(4, 2));
        System.out.println(calculator.subtraction(4, 2));
        System.out.println(calculator.division(5D, 3D));
        System.out.println(calculator.sqrt(3));
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

    public double sqrt(int radical) {
        if (radical == 0 || radical == 1) {
            return radical;
        }
        double temp = 0;
        double root = radical / 2;
        while (root != temp) {
            temp = root;
            root = (radical / temp + temp) / 2;
        }
        return root;
    }
}
