package com.wavy.solution;

/**
 * @author pengweiwei
 * @date 2021/4/30 3:16 PM
 */
public class Solution {
    public class ListNode {
        int val;
        ListNode next;

        ListNode(int x) {
            this.val = x;
        }
    }

    /**
     * 思路：
     * 将原链表分别拆成小于元素X和大于元素X的两个链表，然后再合并
     *
     * @param head
     * @param x
     * @return
     */
    public ListNode partition(ListNode head, int x) {
        ListNode smallDummy = new ListNode(-1);
        ListNode largeDummy = new ListNode(-1);
        ListNode sp = smallDummy;
        ListNode lp = largeDummy;
        while (null != head) {
            if (head.val < x) {
                sp.next = head;
                sp = sp.next;
            } else {
                lp.next = head;
                lp = lp.next;
            }
            head = head.next;
        }
        lp.next = null;
        sp.next = largeDummy.next;
        return smallDummy.next;
    }
}
