package org.example.search.binary;

import java.util.Arrays;

public class BubbleSorting {

    public void bubbleSort(int[] a) {
        int out, in;
        int nElems = a.length;

        System.out.println(Arrays.toString(a));
        System.out.println("Length of array: " + nElems);

        // Внешний цикл (обратный)
        for (out = nElems - 1; out > 1; out--) {
            System.out.println("out = " + out);
            // Внутренний цикл (прямой)
            for (in = 0; in < out; in++) {
                System.out.println("in = " + out);
                // Порядок нарушен?
                if (a[in] > a[in + 1]) {
                    // Поменять местами
                    swap(a, in, in + 1);
                }
            }
        }
    }

    private void swap(int[] a, int one, int two) {
        System.out.println("Swapping " + a[one] + " and " + a[two]);
        int temp = a[one];
        a[one] = a[two];
        a[two] = temp;
    }
}
