package org;

import org.junit.jupiter.api.Test;

import java.util.ArrayDeque;
import java.util.Deque;

import static org.assertj.core.api.Assertions.assertThat;

class DequeTest {
    @Test
    void testLifo() {
        Deque<Integer> deque = new ArrayDeque<>();
        deque.push(1);
        deque.push(2);

        assertThat(deque.pop()).isEqualTo(2);
    }

    @Test
    void testFifo() {
        Deque<Integer> deque = new ArrayDeque<>();
        deque.offer(1);
        deque.offer(2);

        assertThat(deque.poll()).isEqualTo(1);
    }
}
