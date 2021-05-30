package com.ctci.solution.p02;

/**
 * @author pengweiwei
 * @date 2021/4/30 9:57 AM
 */
public class Solution02 {
    public class ListNode {
        int val;
        ListNode next;

        ListNode(int x) {
            this.val = x;
        }
    }

    /**
     * 思路一：
     * 遍历计算链表长度，然后len-k计算倒数第k个节点是整数第几个节点
     * 时间复杂度：O(n)
     * 空间复杂度：O(1)
     *
     * @param head
     * @param k
     * @return
     */
    public int kthToLast(ListNode head, int k) {
        ListNode p = head;
        int len = 0;
        while (null != p) {
            len++;
            p = p.next;
        }
        int num = len - k;
        p = head;
        while (null != p && num-- > 0) {
            p = p.next;
        }
        return p.val;
    }

    /**
     * 思路二：
     * 双指针遍历
     * 时间复杂度：O(n)
     * 空间复杂度：O(1)
     *
     * @param head
     * @param k
     * @return
     */
    public int kthToLast1(ListNode head, int k) {
        ListNode p = head;
        ListNode q = head;
        while (k-- > 0) {
            p = p.next;
        }
        while (null != p) {
            q = q.next;
            p = p.next;
        }
        return q.val;
    }
}
