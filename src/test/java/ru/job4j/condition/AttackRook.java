package ru.job4j.condition;

public class AttackRook {
    public static boolean check(String left, String right) {
        char lineCharLeft = left.charAt(0);
        char lineCharRigth = right.charAt(0);
        if (lineCharLeft == lineCharRigth) {
            return true;
        }

        char lineDigitLeft = left.charAt(1);
        char lineDigitRigth = right.charAt(1);
        return lineDigitLeft == lineDigitRigth;
    }
}
