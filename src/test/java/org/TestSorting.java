package org;

import org.example.algo.study.ArrayTools;
import org.example.algo.study.sort.BubbleSorting;
import org.example.algo.study.sort.InsertMethodSorting;
import org.junit.jupiter.api.Test;

class TestSorting {

    @Test
    void testBubbleSorting() {
        BubbleSorting bubbleSorting = new BubbleSorting();
        bubbleSorting.sort(ArrayTools.generateRandomIntArray(15, 1, 50));
    }

    @Test
    void testInsertMethodSorting() {
        InsertMethodSorting insertMethodSorting = new InsertMethodSorting();
        insertMethodSorting.sort(ArrayTools.generateRandomIntArray(10, 1, 20));
    }
}
