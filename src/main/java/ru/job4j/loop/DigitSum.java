package ru.job4j.loop;

public class DigitSum {
    public static int sum(int num) {
        int sum = 0;
        String s = Integer.toString(num);
        for (int i = 0; i < s.length(); i++) {
            sum += Integer.parseInt("" + s.charAt(i));
        }
        return sum;
    }
}
