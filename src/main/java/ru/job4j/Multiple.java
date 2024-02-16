package ru.job4j;

import java.io.FileOutputStream;

public class Multiple {
    public static void main(String[] args) {
        try (FileOutputStream out = new FileOutputStream("data/multiple.txt")) {
            out.write("1 * 9 = 9".getBytes());
            out.write(System.lineSeparator().getBytes());
            out.write("2 * 9 = 18".getBytes());
            out.write(System.lineSeparator().getBytes());
            out.write("3 * 9 = 27".getBytes());
            out.write(System.lineSeparator().getBytes());
            out.write("4 * 9 = 36".getBytes());
            out.write(System.lineSeparator().getBytes());
            out.write("5 * 9 = 45".getBytes());
            out.write(System.lineSeparator().getBytes());
            out.write("6 * 9 = 54".getBytes());
            out.write(System.lineSeparator().getBytes());
            out.write("7 * 9 = 63".getBytes());
            out.write(System.lineSeparator().getBytes());
            out.write("8 * 9 = 72".getBytes());
            out.write(System.lineSeparator().getBytes());
            out.write("9 * 9 = 81".getBytes());
            out.write(System.lineSeparator().getBytes());
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
