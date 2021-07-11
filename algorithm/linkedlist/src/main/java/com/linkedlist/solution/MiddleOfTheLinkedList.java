package com.linkedlist.solution;

/**
 * @Author pengweiwei
 * @Date 2021/7/11 14:09
 */
public class MiddleOfTheLinkedList {
    /**
     * 思路一：单指针
     * 先遍历链表，获取链表长度n，然后再遍历n/2长度即可
     * 时间复杂度：O(n)
     * 空间复杂度：O(1)
     *
     * @param head
     * @return
     */
    public static ListNode middleNode1(ListNode head) {
        int n = 0;
        ListNode p = head;
        while (null != p) {
            n++;
            p = p.next;
        }
        p = head;
        int i = 0;
        while (i < n / 2) {
            p = p.next;
            i++;
        }
        return p;
    }

    /**
     * 思路二：双指针
     * 定义快慢指针，慢指针走一步，快指针走两步
     * 时间复杂度：O(n)
     * 空间复杂度：O(1)
     *
     * @param head
     * @return
     */
    public static ListNode middleNode2(ListNode head) {
        ListNode slow = head;
        ListNode fast = head;
        while (null != fast && null != fast.next) {
            slow = slow.next;
            fast = fast.next.next;
        }
        return slow;
    }

    public static void main(String[] args) {
        ListNode list1 = new ListNode(1);
        list1.add(2);
        list1.add(3);
        list1.print();
        System.out.println(middleNode1(list1).val);
        System.out.println(middleNode2(list1).val);

        ListNode list2 = new ListNode(1);
        list2.add(2);
        list2.add(3);
        list2.add(4);
        list2.print();
        System.out.println(middleNode1(list2).val);
        System.out.println(middleNode2(list2).val);
    }
}
