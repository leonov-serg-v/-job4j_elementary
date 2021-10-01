package ru.job4j.loop;

public class Mortgage {
    public static int year(double amount, double salary, double percent) {
        int year = 1;
        double p = percent / 100;
        double debt = amount + amount * p;

        while (debt > salary) {
            year++;
            debt = (debt - salary) + (debt - salary) * p;
        }

        return year;
    }
}
