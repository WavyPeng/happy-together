package com.linkedlist.solution;

/**
 * @Author pengweiwei
 * @Date 2021/7/10 0:00
 */
public class PalindromeLinkedList {
    /**
     * 思路：
     * 1.找到链表中点
     * 2.将其后半段反转
     * 3.遍历前半段和反转的后半段，判断是否回文
     * 4.将后半段再反转，恢复链表
     * <p>
     * 时间复杂度：o(n)
     * 空间复杂度：O(1)
     *
     * @param head
     * @return
     */
    public static boolean isPalindrome(ListNode head) {
        if (null == head) {
            return false;
        }
        ListNode preEnd = findPreEnd(head);
        ListNode secondHead = reverseList(preEnd.next);
        ListNode p1 = head;
        ListNode p2 = secondHead;
        boolean result = true;
        while (null != p2) {
            if (p1.val != p2.val) {
                result = false;
                break;
            }
            p1 = p1.next;
            p2 = p2.next;
        }
        preEnd.next = reverseList(secondHead);
        return result;
    }

    /**
     * 查找链表中点
     *
     * @param head
     * @return
     */
    private static ListNode findPreEnd(ListNode head) {
        ListNode slow = head;
        ListNode fast = head;
        while (null != fast.next && null != fast.next.next) {
            slow = slow.next;
            fast = fast.next.next;
        }
        return slow;
    }

    /**
     * 反转链表
     *
     * @param head
     * @return
     */
    private static ListNode reverseList(ListNode head) {
        ListNode pre = null;
        ListNode cur = head;
        ListNode next;
        while (null != cur) {
            next = cur.next;
            cur.next = pre;
            pre = cur;
            cur = next;
        }
        return pre;
    }

    public static void main(String[] args) {
        ListNode list1 = new ListNode(1);
        list1.add(2);
        list1.print();
        System.out.println(isPalindrome(list1));
        ListNode list2 = new ListNode(1);
        list2.add(2);
        list2.add(2);
        list2.add(1);
        list2.print();
        System.out.println(isPalindrome(list2));
    }
}
