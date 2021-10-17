package ru.job4j.array;


import java.util.Arrays;

public class Machine {
    public static int[] change(int money, int price) {
        int[] coins = {10, 5, 2, 1};
        int[] result = new int[100];
        int size = 0;
        int rest = money - price;
        int cnt;
        for (int c : coins) {
            cnt = rest / c;
            for (int i = 0; i < cnt; i++) {
                result[size] = c;
                size++;
            }
            rest = rest - c * cnt;
            if (rest == 0) {
                break;
            }
        }
        return Arrays.copyOf(result, size);
    }
}
