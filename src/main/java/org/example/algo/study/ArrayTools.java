package org.example.algo.study;

import java.util.Random;

public class ArrayTools {

    private static Random random = new Random();

    public ArrayTools() {
        throw new AssertionError();
    }

    public static int[] generateRandomIntArray(int n, int min, int max) {
        return random.ints(n, min, max).toArray();
    }
}
