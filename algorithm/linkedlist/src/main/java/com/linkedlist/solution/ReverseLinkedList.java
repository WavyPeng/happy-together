package com.linkedlist.solution;

/**
 * @Author pengweiwei
 * @Date 2021/7/9 22:52
 */
public class ReverseLinkedList {
    public static ListNode reverseList(ListNode head) {
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
        list1.add(3);
        list1.add(4);
        list1.add(5);
        list1.print();
        ListNode reversedList1 = reverseList(list1);
        reversedList1.print();

        ListNode list2 = new ListNode(1);
        list2.add(2);
        list2.print();
        ListNode reversedList2 = reverseList(list2);
        reversedList2.print();
    }
}
