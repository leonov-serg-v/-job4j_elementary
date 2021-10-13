package ru.job4j.array;

public class FindLoop {

    public static int indexOf(int[] data, int el, int start, int finish) {
        for (int i = start; i <= finish; i++) {
            if (data[i] == el) {
                return i;
            }
        }
        return -1;
    }

    public static int indexOf(int[] data, int key) {
        return indexOf(data, key, 0, data.length - 1);
    }

}
