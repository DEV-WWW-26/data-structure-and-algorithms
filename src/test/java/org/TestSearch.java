package org;

import org.example.algo.study.search.BinarySearch;
import org.junit.jupiter.api.Test;

import java.util.Arrays;
import java.util.Optional;
import java.util.Random;

import static org.assertj.core.api.Assertions.assertThat;

public class TestSearch {

    @Test
    void testBinarySearch() {
        int[] arr = generateRandomArray(15, 1, 50);
        Arrays.sort(arr);
        System.out.println("Sorted array: " + Arrays.toString(arr));

        Random rand = new Random();
        int randomIndex = rand.nextInt(arr.length);

        // 3. Get the value at that index
        int randomElement = arr[randomIndex];

        BinarySearch binarySearch = new BinarySearch();
        Optional<Integer> result = binarySearch.findInSortedArray(arr, randomElement);

        result.ifPresent(System.out::println);

        assertThat(result).isPresent().hasValue(randomIndex);
    }

    private int[] generateRandomArray(int n, int min, int max) {
        Random random = new Random();
        return random.ints(n, min, max).toArray();
    }
}
