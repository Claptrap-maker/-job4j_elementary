package ru.job4j.calculator;

import static ru.job4j.math.MathFunction.*;

public class MathCalculator {
    public static double sumAndMultiply(double first, double second) {
        return sum(first, second) + multiply(first, second);
    }

    public static double subtractAndDelete(double first, double second) {
        return subtract(first, second) + delete(first, second);
    }

    public static double sumAllOperations(double first, double second) {
        return sum(first, second)
                + subtract(first, second)
                + multiply(first, second)
                + delete(first, second);
    }

    public static void main(String[] args) {
        System.out.println("Результат расчета равен: " + sumAndMultiply(20, 10));
        System.out.println("Результат расчета равен: " + subtractAndDelete(20, 10));
        System.out.println("Результат расчета равен: " + sumAllOperations(20, 10));
    }
}
