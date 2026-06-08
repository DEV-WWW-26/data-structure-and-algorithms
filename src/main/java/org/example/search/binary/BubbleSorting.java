package org.example.search.binary;

public class BubbleSorting {

    public void bubbleSort(int[] a) {
        int out, in;
        int nElems = a.length;
        for (out = nElems - 1; out > 1; out--) // Внешний цикл (обратный)
            for (in = 0; in < out; in++) // Внутренний цикл (прямой)
                if (a[in] > a[in + 1]) // Порядок нарушен?
                    swap(a, in, in + 1); // Поменять местами
    }

    private void swap(int[] a, int one, int two) {
        int temp = a[one];
        a[one] = a[two];
        a[two] = temp;
    }
}
