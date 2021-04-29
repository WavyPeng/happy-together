package com.wavy.solution;

import java.util.HashSet;

/**
 * @Author pengweiwei
 * @Date 2021/4/29 23:49
 */
public class Solution {
    public class ListNode {
        int val;
        ListNode next;

        ListNode(int x) {
            val = x;
        }
    }

    /**
     * 思路一：使用HashSet剔除重复元素
     * 时间复杂度：O(n)
     * 空间复杂度：O(n)
     *
     * @param head
     * @return
     */
    public ListNode removeDuplicateNodes(ListNode head) {
        if (null == head) {
            return head;
        }
        HashSet<Integer> set = new HashSet<>();
        set.add(head.val);
        ListNode p = head;
        while (null != p.next) {
            if (set.add(p.next.val)) {
                p = p.next;
            } else {
                p.next = p.next.next;
            }
        }
        return head;
    }

    /**
     * 思路二：双重循环
     * 时间复杂度：O(n2)
     * 空间复杂度：O(1)
     *
     * @param head
     * @return
     */
    public ListNode removeDuplicateNodes1(ListNode head) {
        ListNode p = head;
        ListNode q = p;
        while (null != p) {
            q = p;
            while (null != q.next) {
                if (p.val == q.next.val) {
                    q.next = q.next.next;
                } else {
                    q = q.next;
                }
            }
            p = p.next;
        }
        return head;
    }
}
