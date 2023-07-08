package ru.job4j.converter;

public class Converter {
    public static float rubleToEuro(float value) {
        float rsl = value / 70;
        return rsl;
    }

    public static float rubleToDollar(float value) {
        float rsl = value / 60;
        return rsl;
    }

    public static void main(String[] args) {
        float in = 140;
        float expectedEuro = 2;
        float outEuro = Converter.rubleToEuro(in);
        boolean passedEuro = expectedEuro == outEuro;
        System.out.println("140 rubles are 2. Test result : " + passedEuro);
        in = 120;
        float expectedDollar = 2;
        float outDollar = Converter.rubleToDollar(in);
        boolean passedDollar = expectedDollar == outDollar;
        System.out.println("120 rubles are 2. Test result : " + passedDollar);
    }
}
