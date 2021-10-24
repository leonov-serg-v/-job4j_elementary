package ru.job4j.array;

public class Converter {

    public static int[][] convertInSquareArray(int[][] array) {
        int count = 0;
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[i].length; j++) {
                count++;
            }
        }
        int n = (int) Math.sqrt(count);
        if (count > n * n) {
            n++;
        }
        int[][] result = new int[n][n];
        count = 0;
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[i].length; j++) {
                result[count / n][count % n] = array[i][j];
                count++;
            }
        }
        return result;
    }
}
