package org.example.algo.study.search;

import java.util.Optional;

/**
 * Complexity O(log n)
 */
public class BinarySearch {

    /**
     *
     * @param arr
     * @param target
     * @return index of element
     */
    public Optional<Integer> findInSortedArray(int[] arr, long target) {
        System.out.println("Searching for: " + target);
        System.out.println("Array length: " + arr.length);

        int lower = 0;
        int upper = arr.length - 1;
        int idx;

        System.out.println("lower: " + lower);
        System.out.println("upper: " + upper);

        while (true) {
            idx = (lower + upper) / 2;

            System.out.println("idx: " + idx);

            if (arr[idx] == target) {

                return Optional.of(idx);

            } else if (lower > upper) {

                return Optional.empty();

            } else {
                if (arr[idx] < target) {
                    lower = idx + 1;
                } else {
                    upper = idx - 1;
                }

                System.out.println("lower: " + lower);
                System.out.println("upper: " + upper);
            }
        }
    }
}
