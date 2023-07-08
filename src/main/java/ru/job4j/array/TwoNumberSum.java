package ru.job4j.array;

public class TwoNumberSum {
    public static int[] getIndexes(int[] array, int target) {
        int[] result = {};
        int i = 0;
        int j = array.length - 1;
        while (i != j) {
            if (array[i] + array[j] == target) {
                result = i < j ? new int[]{i, j} : new int[]{j, i};
                break;
            }
            if (i + 1 == j) {
                j--;
                i = -1;
            }
            i++;
        }
        return result;
    }
}
