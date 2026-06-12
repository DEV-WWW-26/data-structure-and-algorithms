package org.example.algo.study.stacks;

public class StackX {
    // Размер массива
    private int maxSize;

    private long[] stackArray;

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
     * @param j
     */
    public void push(long j) {
        // Увеличение top, вставка элемента
        stackArray[++top] = j;
    }

    /**
     * Извлечение элемента с вершины стека
     * @return
     */
    public long pop() {
        // Извлечение элемента, уменьшение top
        return stackArray[top--];
    }

    /**
     * Чтение элемента с вершины стека
     * @return
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
