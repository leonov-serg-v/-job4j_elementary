package ru.job4j.array;

public class FindLoop {
    public static int indexOf(int[] data, int key) {
        int rsl = -1;
        for (int i = 0; i < data.length; i++) {
            if (data[i] == key) {
                rsl = i;
                break;
            }
        }
        return rsl;
    }
}
