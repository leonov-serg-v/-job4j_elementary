package ru.job4j.loop;

public class Fitness {
    public static int calc(int ivan, int nik) {
        int mes = 0;
        while (ivan <= nik) {
            mes++;
            ivan = ivan * 3;
            nik = nik * 2;
        }
        return mes;
    }
}
