package ru.job4j.array;

public class ArrayInSquareArray {

    public static int[][] convertArray(int[] array) {
        int n = (int) Math.sqrt(array.length);
        if (array.length > n * n)  {
            n++;
        }
        int[][] result = new int[n][n];
        for (int i = 0; i < array.length; i++) {
            result[i / n][i % n] = array[i];
        }
        return result;
    }
}
