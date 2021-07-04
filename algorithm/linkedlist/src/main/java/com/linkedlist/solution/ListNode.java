package com.linkedlist.solution;

/**
 * @Author pengweiwei
 * @Date 2021/7/4 22:51
 */
public class ListNode {
    int val;
    ListNode next;

    ListNode() {
    }

    ListNode(int val) {
        this.val = val;
    }

    ListNode(int val, ListNode next) {
        this.val = val;
        this.next = next;
    }

    public void add(int val) {
        ListNode node = new ListNode(val);
        if (null == this.next) {
            this.next = node;
        } else {
            this.next.add(val);
        }
    }

    public void print() {
        System.out.print(this.val);
        if (null != this.next) {
            System.out.print("->");
            this.next.print();
        } else {
            System.out.println();
        }
    }
}
