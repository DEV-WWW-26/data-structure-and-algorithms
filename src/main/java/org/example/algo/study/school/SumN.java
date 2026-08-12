package org.example.algo.study.school;

import static java.lang.Math.abs;

public class SumN {
    public int sum(int n) {
        if (n > 0) {
            return (n * (n + 1)) / 2;
        }

        return 1 - ((abs(n) * (abs(n) + 1)) / 2);
    }
}
