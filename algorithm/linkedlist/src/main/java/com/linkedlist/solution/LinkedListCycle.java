package com.linkedlist.solution;

import java.util.HashSet;

/**
 * @Author pengweiwei
 * @Date 2021/7/8 22:44
 */
public class LinkedListCycle {
    /**
     * 思路一：遍历，HashSet存储每个节点，判断是否重复
     * 时间复杂度：O(n)
     * 空间复杂度：O(n)
     *
     * @param head
     * @return
     */
    public boolean hasCycle1(ListNode head) {
        HashSet<ListNode> set = new HashSet<>();
        ListNode p = head;
        while (null != p) {
            if (!set.add(p)) {
                return true;
            }
            p = p.next;
        }
        return false;
    }

    /**
     * 思路二：快慢指针
     * 时间复杂度：O(n)
     * 空间复杂度：O(1)
     *
     * @param head
     * @return
     */
    public boolean hasCycle2(ListNode head) {
        if (null == head || null == head.next) {
            return false;
        }
        ListNode slow = head;
        ListNode fast = head.next;
        while (slow != fast) {
            if (null == fast || null == fast.next) {
                return false;
            }
            slow = slow.next;
            fast = fast.next.next;
        }
        return true;
    }
}
