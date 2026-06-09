package org;

import org.example.algo.study.sort.BubbleSorting;
import org.example.algo.study.sort.InsertMethodSorting;
import org.junit.jupiter.api.Test;

import java.util.Arrays;

class TestSorting {

    @Test
    void testBubbleSorting() {
        int[] arr = {1, 5, 7, 11, 45, 12, 5, 8, 9};
        BubbleSorting bubbleSorting = new BubbleSorting();
        bubbleSorting.sort(arr);
        System.out.println("Sorted array: " + Arrays.toString(arr));
    }

    @Test
    void testInsertMethodSorting() {
        int[] arr = {1, 5, 7, 11, 45, 12, 5, 8, 9};
        InsertMethodSorting insertMethodSorting = new InsertMethodSorting();
        insertMethodSorting.sort(arr);
        System.out.println("Sorted array: " + Arrays.toString(arr));
    }
}
