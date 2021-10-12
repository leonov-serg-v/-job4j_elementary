package ru.job4j.array;

public class Min {
    public static int findMin(int[] data) {
        int min = data[0];
        for (int i = 1; i < data.length; i++) {
            if (data[i] < min) {
                min = data[i];
            }
        }
        return min;
    }

    public static void main(String[] args) {
        int[] data = {1, 0, 1};
        int result = Min.findMin(data);
        System.out.println(result);
    }
}
