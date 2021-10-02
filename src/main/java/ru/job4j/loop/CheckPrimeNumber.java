package ru.job4j.loop;

public class CheckPrimeNumber {
    public static boolean check(int n) {
        boolean result = n > 1;
        for (int i = 2; i < n; i++) {
            if (n % i == 0) {
                result = false;
                break;
            }
        }
        return result;
    }
}
