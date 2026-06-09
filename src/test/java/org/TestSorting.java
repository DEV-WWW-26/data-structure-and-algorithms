package org;

import org.example.algo.study.sort.BubbleSorting;
import org.example.algo.study.sort.InsertMethodSorting;
import org.junit.jupiter.api.Test;

import java.util.Random;

class TestSorting {

    @Test
    void testBubbleSorting() {
        BubbleSorting bubbleSorting = new BubbleSorting();
        bubbleSorting.sort(generateRandomArray(15, 1, 50));
    }

    @Test
    void testInsertMethodSorting() {
        InsertMethodSorting insertMethodSorting = new InsertMethodSorting();
        insertMethodSorting.sort(generateRandomArray(15, 1, 50));
    }

    private int[] generateRandomArray(int n, int min, int max) {
        Random random = new Random();
        return random.ints(n, min, max).toArray();
    }
}
