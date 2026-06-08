package org;

import org.example.search.binary.BinarySearch;
import org.example.search.binary.BubbleSorting;
import org.junit.jupiter.api.Test;

import java.util.Arrays;
import java.util.Optional;

import static org.assertj.core.api.Assertions.assertThat;

class TestSorting {

    @Test
    void testBinarySearch() {
        int[] arr = {1, 5, 7, 11, 45, 12, 5, 8, 9};
        Arrays.sort(arr);
        System.out.println("Sorted array: " + Arrays.toString(arr));

        BinarySearch binarySearch = new BinarySearch();
        Optional<Integer> result = binarySearch.findInSortedArray(arr, 12);

        result.ifPresent(System.out::println);

        assertThat(result).isPresent().hasValue(7);
    }

    @Test
    void testBubbleSorting() {
        int[] arr = {1, 5, 7, 11, 45, 12, 5, 8, 9};
        BubbleSorting bubbleSorting = new BubbleSorting();
        bubbleSorting.bubbleSort(arr);
        System.out.println("Sorted array: " + Arrays.toString(arr));
    }
}
