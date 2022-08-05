package com.calc;

public class App {

    public static void main(String[] args) {
        App calculator = new App();
        System.out.println(calculator.add(4, 2));
        System.out.println(calculator.add(4, 2));
    }

    public int add(int a, int b) {
        return a + b;
    }

    public void subtraction(int a, int b) {
        return a - b;
    }
}

