package org.example.algo.study.search;

import org.example.algo.study.ArrayTools;
import org.junit.jupiter.api.Test;

import java.util.Arrays;
import java.util.Optional;
import java.util.Random;

import static org.assertj.core.api.Assertions.assertThat;

class BinarySearchByUsingRecursionTest {

    @Test
    void testFindInSortedArray() {
        int[] arr = ArrayTools.generateRandomIntArray(15, 1, 50);
        Arrays.sort(arr);
        System.out.println("Sorted array: " + Arrays.toString(arr));

        Random rand = new Random();
        int randomIndex = rand.nextInt(arr.length);

        // Get the value at that index
        int randomElement = arr[randomIndex];

        BinarySearchByUsingRecursion binarySearch = new BinarySearchByUsingRecursion();
        Optional<Integer> result = binarySearch.findInSortedArray(arr, randomElement);

        result.ifPresent(System.out::println);

        assertThat(result).isPresent().hasValue(randomIndex);
    }
}