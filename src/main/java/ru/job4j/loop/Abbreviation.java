package ru.job4j.loop;

public class Abbreviation {
    public static String collect(String s) {
     StringBuilder sb = new StringBuilder();
        boolean word = false;
        for (int i = 0; i < s.length(); i++) {
            if (word) {
                word = s.charAt(i) != ' ';
            } else {
                if (s.charAt(i) == ' ') {
                    continue;
                }
                sb.append(s.charAt(i));
                word = true;
            }
        }
        return sb.toString();
    }
}
