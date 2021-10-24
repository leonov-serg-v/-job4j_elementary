package ru.job4j.loop;

public class Cryptography {
    public static String code(String s) {
        if (s.length() == 0) {
            return "empty";
        }
        if (s.length() < 5) {
            return s;
        }

        StringBuilder sb = new StringBuilder(s);

        for (int i = sb.length() - 5; i >= 0; i--) {
            sb.replace(i, i + 1, "#");
        }
        return sb.toString();
    }

    public static void main(String[] args) {
        String numbers = "0123456789";
        StringBuffer sb = new StringBuffer(numbers);
        System.out.println(sb.replace(3, 4, "#"));
    }
}
