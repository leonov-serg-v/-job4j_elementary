package ru.job4j.array;

public class RandomDream {
    public static String random(String[] prizes, int num) {
        num = num % prizes.length;
        if (num == 0) {
            num = prizes.length;
        }

       return prizes[num - 1];
    }
}
