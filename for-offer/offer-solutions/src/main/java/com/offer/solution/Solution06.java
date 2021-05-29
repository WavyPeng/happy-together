package com.offer.solution;

import java.util.LinkedList;

/**
 * @Author pengweiwei
 * @Date 2021/4/5 23:12
 */
public class Solution06 {
    public class ListNode {
        int val;
        ListNode next;

        ListNode(int x) {
            val = x;
        }
    }

    /**
     * 思路：
     * 要求链表中的元素逆序输出，联想到栈的特性，先入后出
     * 遍历链表，将元素逐个入栈，然后再逐个出栈，存入数组中，达到逆序效果
     * 时间复杂度：O(n)
     * 空间复杂度：O(n)
     *
     * @param head
     * @return
     */
    public int[] reversePrint(ListNode head) {
        LinkedList<Integer> stack = new LinkedList<Integer>();
        while (head != null) {
            stack.addLast(head.val);
            head = head.next;
        }
        int[] res = new int[stack.size()];
        for (int i = 0; i < res.length; i++) {
            res[i] = stack.removeLast();
        }
        return res;
    }
}
