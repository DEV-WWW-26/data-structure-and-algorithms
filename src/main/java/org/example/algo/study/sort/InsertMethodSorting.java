package org.example.algo.study.sort;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.util.Arrays;

/**
 * Complexity O(N^2)
 */
public class InsertMethodSorting {

    private static final Logger log = LoggerFactory.getLogger(InsertMethodSorting.class);

    public void sort(int[] a) {
        if (a == null || a.length == 0) {

            return;
        }

        int in;
        int out;
        // out - разделительный маркер
        log.info("{}", Arrays.toString(a));
        for (out = 1; out < a.length; out++) {
            log.info("out index: {}", out);
            // Скопировать помеченный элемент
            int temp = a[out];
            // Начать перемещения с out
            in = out;
            // Пока не найден меньший элемент
            while (in > 0 && a[in - 1] >= temp) {
                log.info("in index: {}", out);
                log.info("a[{}] = {}", in, a[in]);
                // Сдвинуть элемент вправо
                a[in] = a[in - 1];
                // Перейти на одну позицию влево
                --in;
                log.info("{}", Arrays.toString(a));
            }
            // Вставить помеченный элемент
            a[in] = temp;
            log.info("{}", Arrays.toString(a));
        }
    }
}
