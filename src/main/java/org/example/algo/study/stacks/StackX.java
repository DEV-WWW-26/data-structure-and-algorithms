package org.example.algo.study.stacks;

import org.example.algo.study.exceptions.StackEmptyException;
import org.example.algo.study.exceptions.StackFullException;

public class StackX {
    // Размер массива
    private final int maxSize;

    private final long[] stackArray;

    // Вершина стека
    private int top;

    public StackX(int s) {
        maxSize = s;
        stackArray = new long[maxSize];
        // Пока нет ни одного элемента
        top = -1;
    }

    /**
     * Размещение элемента на вершине стека
     *
     * @param j число long
     */
    public void push(long j) throws StackFullException {
        if (!isFull()) {
            // Увеличение top, вставка элемента
            stackArray[++top] = j;
        } else {
            throw new StackFullException();
        }
    }

    /**
     * Извлечение элемента с вершины стека
     *
     * @return long value
     */
    public long pop() throws StackEmptyException {
        if (!isEmpty()) {
            // Извлечение элемента, уменьшение top
            return stackArray[top--];
        }

        throw new StackEmptyException();
    }

    /**
     * Чтение элемента с вершины стека
     *
     * @return long value
     */
    public long peek() {
        return stackArray[top];
    }

    /**
     *
     * @return True, если стек пуст
     */
    public boolean isEmpty() {
        return (top == -1);
    }

    /**
     *
     * @return True, если стек полон
     */
    public boolean isFull() {
        return (top == maxSize - 1);
    }
}
