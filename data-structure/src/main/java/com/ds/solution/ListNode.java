package com.ds.solution;

/**
 * @Author pengweiwei
 * @Date 2021/8/1 16:56
 */
public class ListNode {
    int val;
    ListNode next;
    ListNode pre;

    ListNode(int val) {
        this.val = val;
    }

    ListNode(int val, ListNode next) {
        this.val = val;
        this.next = next;
    }

    public ListNode(int val, ListNode next, ListNode pre) {
        this.val = val;
        this.next = next;
        this.pre = pre;
    }
}
