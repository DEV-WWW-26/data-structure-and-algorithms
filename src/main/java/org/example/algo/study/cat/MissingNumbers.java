package org.example.algo.study.cat;

import java.util.Arrays;

public class MissingNumbers {

    public int getMissingNumber(int[] a) {
        if (a.length == 0) {
            return 0;
        }
        Arrays.sort(a);
        int res = 1;
        for (int j : a) {
            if (j == res) {
                res++;
            } else if (j > res) {
                break;
            }
        }
        return res;
    }
}
