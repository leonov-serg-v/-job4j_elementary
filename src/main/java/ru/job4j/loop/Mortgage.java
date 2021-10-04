package ru.job4j.loop;

public class Mortgage {
    public static int year(double amount, double salary, double percent) {
        int year = 0;
        double p = percent / 100;
        while (amount > 0) {
            year++;
            amount += amount * p - salary;
        }
        return year;
    }
}
