package com.ctci.solution.p02;

/**
 * @Author pengweiwei
 * @Date 2021/5/7 23:47
 */
public class Solution07 {
    public class ListNode {
        int val;
        ListNode next;

        ListNode(int x) {
            this.val = x;
            next = null;
        }
    }

    /**
     * 思路：双指针遍历
     * 假设相交的链表部分长度为x，链表1除公共部分的长度为a，链表2除公共部分的长度为b
     * 则a+x+b=b+x+a
     * <p>
     * 时间复杂度：O(n)
     * 空间复杂度：O(1)
     *
     * @param headA
     * @param headB
     * @return
     */
    public ListNode getIntersectionNode(ListNode headA, ListNode headB) {
        ListNode p = headA;
        ListNode q = headB;
        while (p != q) {
            p = (null != p) ? p.next : headB;
            q = (null != q) ? q.next : headA;
        }
        return p;
    }
}
