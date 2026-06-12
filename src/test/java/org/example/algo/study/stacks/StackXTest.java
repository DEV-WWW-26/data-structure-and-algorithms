package org.example.algo.study.stacks;

import org.example.algo.study.exceptions.StackEmptyException;
import org.example.algo.study.exceptions.StackFullException;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;
import static org.assertj.core.api.Assertions.assertThatThrownBy;

class StackXTest {

    @Test
    void testStackX() throws StackFullException {
        StackX theStack = new StackX(10); // Создание нового стека
        theStack.push(20); // Занесение элементов в стек
        theStack.push(40);
        theStack.push(60);
        theStack.push(80);

        assertThat(theStack.isEmpty()).isFalse();

        // Пока стек не станет пустым
        while (!theStack.isEmpty()) {
            System.out.println(theStack.peek());
            try {
                // Удалить элемент из стека
                theStack.pop();
            } catch (StackEmptyException e) {
                System.out.println(e.getMessage());
                break;
            }
        }

        assertThat(theStack.isEmpty()).isTrue();
    }

    @Test
    void testIsFullMethod() throws StackFullException {
        StackX theStack = new StackX(3);
        theStack.push(20);
        theStack.push(40);
        theStack.push(60);

        assertThatThrownBy(() -> theStack.push(80)).isInstanceOf(StackFullException.class);
        assertThat(theStack.isFull()).isTrue();
    }
}
