package ru.job4j.array;

public class SortSelected {
    public static int[] sort(int[] data) {
        for (int i = 0; i < data.length - 1; i++) {
            int min = MinDiapaso.min(data, i, data.length - 1);
            int indx = FindLoop.indexOf(data, min, i, data.length - 1);
            data[indx] = data[i];
            data[i] = min;
        }
        return data;
    }
}
