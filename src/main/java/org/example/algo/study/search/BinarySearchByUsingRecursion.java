package org.example.algo.study.search;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.util.Optional;

/**
 * Complexity O(log n)
 */
public class BinarySearchByUsingRecursion {

    private static final Logger log = LoggerFactory.getLogger(BinarySearchByUsingRecursion.class);

    /**
     *
     * @param arr
     * @param target
     * @return index of element
     */
    public Optional<Integer> findInSortedArray(int[] arr, int target) {
        if (arr == null || arr.length == 0) {

            return Optional.empty();
        }

        log.info("Searching for: {}", target);
        log.info("Array length: {}", arr.length);

        return findRec(arr, target, 0, arr.length - 1);
    }

    private Optional<Integer> findRec(int[] arr, int target, int lower, int upper) {
        log.info("lower: {}", lower);
        log.info("upper: {}", upper);

        int idx = (lower + upper) / 2;
        log.info("idx: {}", idx);

        if (arr[idx] == target) {
            return Optional.of(idx);
        }

        if (lower > upper) {
            return Optional.empty();
        }

        if (arr[idx] < target) {
            return findRec(arr, target, idx + 1, upper);
        } else {
            return findRec(arr, target, lower, idx - 1);
        }
    }
}
