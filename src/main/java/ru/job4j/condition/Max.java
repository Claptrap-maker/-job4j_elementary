package ru.job4j.condition;

public class Max {
    public static int max(int left, int right) {
        return left > right ? left : right;
    }

    public static int max(int first, int second, int third) {
        return first > max(second, third) ? first : max(second, third);
    }

    public static int max(int one, int two, int three, int four) {
        return one > max(two, three, four) ? one : max(two, three, four);
    }
}
