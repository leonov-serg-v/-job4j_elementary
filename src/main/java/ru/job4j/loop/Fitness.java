package ru.job4j.loop;

public class Fitness {
    public static int calc(int ivan, int nik) {
        int mes = 0;
        int powerIvan = ivan;
        int powerNik = nik;
        while (powerIvan <= powerNik) {
            mes++;
            powerIvan = powerIvan * 3 * mes;
            powerNik = powerNik * 2 * mes;
        }
        return mes;
    }
}
