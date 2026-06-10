package org.example.algo.study.search;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.util.Optional;

/**
 * Complexity O(log n)
 */
public class BinarySearch {

    private static final Logger log = LoggerFactory.getLogger(BinarySearch.class);

    /**
     *
     * @param arr
     * @param target
     * @return index of element
     */
    public Optional<Integer> findInSortedArray(int[] arr, long target) {
        if (arr == null || arr.length == 0) {

            return Optional.empty();
        }

        log.info("Searching for: {}", target);
        log.info("Array length: {}", arr.length);

        int lower = 0;
        int upper = arr.length - 1;
        int idx;

        log.info("lower: {}", lower);
        log.info("upper: {}", upper);

        while (true) {
            idx = (lower + upper) / 2;

            log.info("idx: {}", idx);

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

                log.info("lower: {}", lower);
                log.info("upper: {}", upper);
            }
        }
    }
}
