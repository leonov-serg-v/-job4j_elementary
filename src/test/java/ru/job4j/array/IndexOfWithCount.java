package ru.job4j.array;

public class IndexOfWithCount {
    public static int indexOf(char[] string, char c, int number) {
        int result = -1;
        int cnt = 0;
        for (int i = 0; i < string.length; i++) {
            if (string[i] == c) {
                cnt += 1;
                if (cnt == number) {
                    result = i;
                    break;
                }
            }
        }
        return result;
    }
}
