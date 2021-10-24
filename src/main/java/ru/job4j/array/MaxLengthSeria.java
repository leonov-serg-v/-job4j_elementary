package ru.job4j.array;

public class MaxLengthSeria {
    public static int find(int[] array) {
        int cnt = 1;
        int maxCnt = 1;
        for (int i = 1; i < array.length; i++) {
            if (array[i - 1] <= array[i]) {
                cnt++;
            } else {
                maxCnt = cnt > maxCnt ? cnt : maxCnt;
                cnt = 1;
            }

        }
        maxCnt = cnt > maxCnt ? cnt : maxCnt;
        int n = (int) Math.sqrt(10);
        return maxCnt;

    }
}
