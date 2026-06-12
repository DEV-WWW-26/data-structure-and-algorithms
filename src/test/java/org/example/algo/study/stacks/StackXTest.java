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
            System.out.println(theStack.peek());
            // Удалить элемент из стека
            theStack.pop();
        }

        assertThat(theStack.isEmpty()).isTrue();
    }
}