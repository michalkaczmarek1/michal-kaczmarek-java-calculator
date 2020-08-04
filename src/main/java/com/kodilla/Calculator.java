package com.kodilla;

public class Calculator {

    public int add(int a, int b) {
        return a + b;
    }

    public int sub(int a, int b) {
        return a - b;
    }

    public static void main(String args[]) {
        Calculator calculator = new Calculator();
        int resultAdd = calculator.add(2, 5);
        int resultSub = calculator.sub(56, 50);

        System.out.println("Dodawanie: " + resultAdd);
        System.out.println("Odejmowanie: " + resultSub);

    }
}
