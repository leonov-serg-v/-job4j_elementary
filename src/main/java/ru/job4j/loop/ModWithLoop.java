package ru.job4j.loop;

public class ModWithLoop {
    public static int mod(int n, int d) {
        int i = 0;
        while (n - d * i >= d) {
            i++;
        }
        return n - d * i;
    }
}
