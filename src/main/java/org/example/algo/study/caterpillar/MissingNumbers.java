package org.example.algo.study.caterpillar;

import java.util.Arrays;

public class MissingNumbers {

    public int getMissingNumber(int[] a) {
        if (a.length == 0) {
            return 0;
        }
        Arrays.sort(a);
        int res = 1;
        for (int i = 0; i < a.length; i++) {
            if (a[i] == res) {
                res++;
            } else if (a[i] > res) {
                break;
            }
        }
        return res;
    }
}
