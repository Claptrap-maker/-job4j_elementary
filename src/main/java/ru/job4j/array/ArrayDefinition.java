package ru.job4j.array;

public class ArrayDefinition {

    public static void main(String[] args) {
        String[] names = new String[4];
        names[0] = "Petr Arsentev";
        names[1] = "Julia Ivanova";
        names[2] = "Nikita Yurlov";
        names[3] = "Anna Alekberova";
        for (int i = 0; i < names.length; i++) {
            System.out.println(names[i]);
        }
    }
}
