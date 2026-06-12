package org.example.algo.study.stacks;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

class StackXTest {

    @Test
    void testStackX() {
        StackX theStack = new StackX(10); // Создание нового стека
        theStack.push(20); // Занесение элементов в стек
        theStack.push(40);
        theStack.push(60);
        theStack.push(80);

        assertThat(theStack.isEmpty()).isFalse();

        // Пока стек не станет пустым
        while (!theStack.isEmpty()) {
            // Удалить элемент из стека
            long value = theStack.pop();
            // Вывод содержимого
            System.out.print(value);
            System.out.print(" ");
        }
        System.out.println("");

        assertThat(theStack.isEmpty()).isTrue();
    }
}