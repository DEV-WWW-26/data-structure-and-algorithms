package org.example.search.binary;

import java.util.Optional;

public class BinarySearch {

    public Optional<Integer> findInSortedArray(int[] arr, long searchKey) {
        System.out.println("Searching for: " + searchKey);
        System.out.println("Array length: " + arr.length);

        int lower = 0;
        int upper = arr.length - 1;
        int idx;

        System.out.println("lower: " + lower);
        System.out.println("upper: " + upper);

        while (true) {
            idx = (lower + upper) / 2;

            System.out.println("idx: " + idx);

            if (arr[idx] == searchKey) {

                return Optional.of(idx);

            } else if (lower > upper) {

                return Optional.empty();

            } else {
                if (arr[idx] < searchKey) {
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
