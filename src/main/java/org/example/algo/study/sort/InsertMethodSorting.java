package org.example.algo.study.sort;

/**
 * Complexity O(log n)
 */
public class InsertMethodSorting {

    public void sort(int[] a) {
        int in, out;
        // out - разделительный маркер
        for (out = 1; out < a.length; out++) {
            System.out.println("a[" + out + "] = " + a[out]);
            // Скопировать помеченный элемент
            int temp = a[out];
            // Начать перемещения с out
            in = out;
            // Пока не найден меньший элемент
            while (in > 0 && a[in - 1] >= temp) {
                System.out.println("a[" + in + "] = " + a[in]);
                // Сдвинуть элемент вправо
                a[in] = a[in - 1];
                // Перейти на одну позицию влево
                --in;
            }
            // Вставить помеченный элемент
            a[in] = temp;
        }
    }
}
