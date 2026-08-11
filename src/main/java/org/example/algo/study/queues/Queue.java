package org.example.algo.study.queues;

public class Queue {

    private int maxSize;
    private int[] arr;
    private int front;
    private int rear;
    private int items;

    public Queue(int maxSize) {
        this.maxSize = maxSize;
        arr = new int[maxSize];
        front = 0;
        rear = -1;
        items = 0;
    }

    public boolean isEmpty() {
        return front == rear;
    }

    public boolean isFull() {
        return rear + 1 == maxSize;
    }


}
