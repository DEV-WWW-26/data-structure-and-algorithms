package org.example.algo.study.cat;

import java.util.Arrays;

public class LongestConsecutiveSubsequence {

    public int getLongestConsecutiveSubsequenceElementsCount(int[] a) {
        if (a.length == 0) {
            return 0;
        }
        Arrays.sort(a);
        int count = 1;
        int res = 1;
        for (int i = 1; i < a.length; i++) {
            if (a[i] == a[i - 1]) {
                continue;
            }
            if (a[i] == a[i - 1] + 1) {
                count++;
            } else {
                count = 1;
            }
            res = Math.max(count, res);
        }
        return res;
    }
}
