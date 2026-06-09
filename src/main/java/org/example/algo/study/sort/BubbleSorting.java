package org.example.algo.study.sort;

import java.util.Arrays;

/**
 * Complexity O(N^2)
 */
public class BubbleSorting {

    public void sort(int[] a) {
        int out, in;
        int nElems = a.length;

        System.out.println(Arrays.toString(a));
        System.out.println("Length of array: " + nElems);

        // Внешний цикл (обратный)
        for (out = nElems - 1; out > 1; out--) {
            System.out.println("outer cycle value " + a[out] + " index " + out);
            // Внутренний цикл (прямой)
            for (in = 0; in < out; in++) {
                System.out.println("inner cycle value " + a[in] + " index " + in);
                // Порядок нарушен?
                if (a[in] > a[in + 1]) {
                    // Поменять местами
                    swap(a, in, in + 1);
                    System.out.println(Arrays.toString(a));
                }
            }
        }
    }

    private void swap(int[] a, int one, int two) {
        System.out.println("Swapping " + a[one] + " and " + a[two] + ", index: " + one + ", index: " + two);
        int temp = a[one];
        a[one] = a[two];
        a[two] = temp;
    }
}
