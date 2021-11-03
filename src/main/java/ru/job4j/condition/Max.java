package ru.job4j.condition;

public class Max {
    public static int max(int left, int right) {
        //return left > right ? left : right;
        return Math.max(left, right);
    }

    public static int max(int num1, int num2, int num3) {
        return max(max(num1, num2), num3);
    }

    public static int max(int num1, int num2, int num3, int num4) {
        return max(max(num1, num2, num3), num4);
    }

}

