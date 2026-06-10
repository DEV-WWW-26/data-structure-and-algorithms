package org.example.algo.study.sort;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.util.Arrays;

/**
 * Complexity O(N^2)
 */
public class BubbleSorting {

    private static final Logger log = LoggerFactory.getLogger(BubbleSorting.class);

    public void sort(int[] a) {
        if (a == null || a.length == 0) {

            return;
        }

        int out, in;
        int nElems = a.length;

        log.info("{}", Arrays.toString(a));
        log.info("Length of array: {}", nElems);

        // Внешний цикл (обратный)
        for (out = nElems - 1; out > 1; out--) {
            log.info("outer cycle value {}, index {}", a[out], out);
            // Внутренний цикл (прямой)
            for (in = 0; in < out; in++) {
                log.info("inner cycle value {}, index {}", a[in], in);
                // Порядок нарушен?
                if (a[in] > a[in + 1]) {
                    // Поменять местами
                    swap(a, in, in + 1);
                    log.info("{}", Arrays.toString(a));
                }
            }
        }
    }

    private void swap(int[] a, int one, int two) {
        log.info("Swapping {} and {}, index: {}, index: {}", a[one], a[two], one, two);
        int temp = a[one];
        a[one] = a[two];
        a[two] = temp;
    }
}
