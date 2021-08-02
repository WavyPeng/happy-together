package com.ds.solution;

/**
 * @Description 双向链表
 * @Author pengweiwei
 * @Date 2021/8/1 23:57
 */
public class DoubleLinkedList {
    private ListNode head;

    DoubleLinkedList() {
        head = new ListNode(0, null, null);
    }

    /**
     * 在尾部添加元素
     *
     * @param val
     */
    public void add(int val) {
        ListNode node = new ListNode(val, null, null);
        ListNode temp = head;
        while (null != temp.next) {
            temp = temp.next;
        }
        temp.next = node;
        node.pre = temp;
    }

    /**
     * 按元素大小在中间插入元素
     *
     * @param val
     */
    public void insert(int val) {
        ListNode node = new ListNode(val, null, null);
        ListNode temp = head;
        while (null != temp.next && temp.next.val <= val) {
            temp = temp.next;
        }
        node.next = temp.next;
        if (null != temp.next) {
            temp.next.pre = node;
        }
        temp.next = node;
        node.pre = temp;
    }

    /**
     * 删除某元素
     *
     * @param val
     */
    public void remove(int val) {
        ListNode temp = head;
        while (null != temp) {
            if (val == temp.val) {
                if (null == temp.next) {
                    temp.pre.next = temp.next;
                } else {
                    temp.pre.next = temp.next;
                    temp.next.pre = temp.pre;
                }
            }
            temp = temp.next;
        }
    }

    /**
     * 打印
     */
    public void print() {
        ListNode temp = head.next;
        while (null != temp) {
            System.out.printf("%d->", temp.val);
            temp = temp.next;
        }
        System.out.printf("null \n");
    }

    public static void main(String[] args) {
        DoubleLinkedList linkedList = new DoubleLinkedList();
        linkedList.add(2);
        linkedList.print();
        linkedList.insert(1);
        linkedList.print();
        linkedList.insert(3);
        linkedList.print();
        linkedList.add(4);
        linkedList.print();
        linkedList.insert(2);
        linkedList.print();
        linkedList.remove(4);
        linkedList.print();
        linkedList.remove(2);
        linkedList.print();
    }
}
