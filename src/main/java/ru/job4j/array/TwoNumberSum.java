package ru.job4j.array;

public class TwoNumberSum {
    public static int[] getIndexes(int[] array, int target) {
        int[] result = {};
        int i = 0;
        int j = i + 1;
        while (j < array.length) {
            if (array[i] + array[j] == target) {
                result = i < j ? new int[]{i, j} : new int[]{j, i};
                break;
            }
            if (j == array.length - 1) {
                i++;
                j = i;
            }
            j++;
        }
        return result;
    }
}
