package ru.job4j.array;

public class Merge {
    public static int[] merge(int[] left, int[] right) {
        int[] rsl = new int[left.length + right.length];
        int iL = 0;
        int iR = 0;
        if (left.length != 0 && right.length != 0) {
           for (int i = 0; i < rsl.length; i++) {
                if (left[iL] > right[iR]) {
                    rsl[i] = right[iR];
                    iR++;
                    if (iR == right.length) {
                        break;
                    }
                } else {
                    rsl[i] = left[iL];
                    iL++;
                    if (iL == left.length) {
                        break;
                    }
                }
            }
        }
        if (iL == left.length) {
            for (int i = iR; i < right.length; i++) {
                rsl[iL + i] = right[i];
            }
        } else {
            for (int i = iL; i < left.length; i++) {
                rsl[iR + i] = left[i];
            }
        }

        return rsl;
    }
}
