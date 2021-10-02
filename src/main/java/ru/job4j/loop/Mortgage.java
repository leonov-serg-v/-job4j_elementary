package ru.job4j.loop;

public class Mortgage {
    public static int year(double amount, double salary, double percent) {

        int year = 1;
        double p = percent / 100;
        amount = amount + amount * p;
        while (amount > salary) {
            year++;
            amount = (amount - salary) + (amount - salary) * p;
        }

        return year;
    }
}
