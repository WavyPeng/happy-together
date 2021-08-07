package com.ds.solution;

/**
 * @Author pengweiwei
 * @Date 2021/8/7 14:22
 */
public class ArrayStack {
    //栈能存储的最大元素
    private int maxSize;
    //定义一个数组用于存储栈的元素
    private int[] stack;
    //指向栈顶
    private int top = -1;

    public ArrayStack(int size) {
        maxSize = size;
        stack = new int[maxSize];
    }

    /**
     * 判断栈是否元素已满
     *
     * @return
     */
    public boolean isFull() {
        return top == maxSize - 1;
    }

    /**
     * 判断是否栈空
     *
     * @return
     */
    public boolean isEmpty() {
        return top == -1;
    }

    /**
     * 入栈
     *
     * @param val
     */
    public void push(int val) {
        if (!isFull()) {
            top++;
            stack[top] = val;
        }
    }

    /**
     * 出栈
     *
     * @return
     */
    public Integer pop() {
        if (!isEmpty()) {
            int val = stack[top];
            top--;
            return val;
        }
        return null;
    }

    /**
     * 打印栈内元素
     */
    public void print() {
        for (int i = top; i >= 0; i--) {
            System.out.printf("%d ", stack[i]);
        }
        System.out.println();
    }

    public static void main(String[] args) {
        ArrayStack stack = new ArrayStack(5);
        stack.push(1);
        stack.push(2);
        stack.push(3);
        stack.push(4);
        stack.push(5);
        stack.print();
        System.out.println(stack.pop());
        stack.push(6);
        stack.print();
    }
}
