package com.ds.solution;

/**
 * @Description 通过数组的方式实现循环队列
 * @Author pengweiwei
 * @Date 2021/8/1 14:22
 */
public class CircleQueue {
    // 最大空间，最大有效元素个数maxSize-1
    private int maxSize;
    // 指向队列的第一个元素，初始化为0
    private int front = 0;
    // 指向队列最后一个元素的下一个元素，初始化为0
    private int rear = 0;
    // 存储队列元素
    private int[] arr;

    public CircleQueue(int size) {
        maxSize = size;
        arr = new int[maxSize];
    }

    /**
     * 判断队列是否为空
     *
     * @return
     */
    public boolean isEmpty() {
        return front == rear;
    }

    /**
     * 判断队列是否已满
     *
     * @return
     */
    public boolean isFull() {
        return (rear + 1) % maxSize == front;
    }

    /**
     * 获取第一个元素（出队列）
     *
     * @return
     */
    public Integer poll() {
        if (!isEmpty()) {
            int item = arr[front];
            front = (front + 1) % maxSize;
            return item;
        }
        return null;
    }

    /**
     * 获取第一个元素（不出队列）
     *
     * @return
     */
    public Integer peek() {
        if (!isEmpty()) {
            return arr[front];
        }
        return null;
    }

    /**
     * 入队列
     *
     * @param item
     * @return
     */
    public boolean push(int item) {
        if (!isFull()) {
            arr[rear] = item;
            rear = (rear + 1) % maxSize;
            return true;
        }
        return false;
    }

    /**
     * 队列有效元素个数
     *
     * @return
     */
    public Integer size() {
        return (rear + maxSize - front) % maxSize;
    }

    /**
     * 打印
     */
    public void print() {
        for (int i = front; i < front + size(); i++) {
            System.out.printf("arr[%d]=%d \n", i, arr[i]);
        }
        System.out.println();
    }

    public static void main(String[] args) {
        CircleQueue queue = new CircleQueue(4);
        queue.push(1);
        queue.push(2);
        queue.push(3);
        queue.print();
        queue.poll();
        queue.print();
        queue.push(4);
        queue.print();
        queue.peek();
        queue.print();
        queue.poll();
        queue.poll();
        queue.poll();
        queue.print();
        queue.push(5);
        queue.print();
    }
}
