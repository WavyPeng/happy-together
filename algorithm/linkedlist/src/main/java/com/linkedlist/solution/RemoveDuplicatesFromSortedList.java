package com.linkedlist.solution;

/**
 * @Author pengweiwei
 * @Date 2021/7/6 23:06
 */
public class RemoveDuplicatesFromSortedList {
    public static ListNode deleteDuplicates(ListNode head) {
        if (null == head) {
            return head;
        }
        ListNode p = head;
        ListNode q = head.next;
        while (null != q) {
            if (p.val == q.val) {
                p.next = q.next;
            } else {
                p = p.next;
            }
            q = q.next;
        }
        return head;
    }

    public static void main(String[] args) {
        ListNode list1 = new ListNode(1);
        list1.add(1);
        list1.add(2);
        list1.print();
        ListNode deltList1 = deleteDuplicates(list1);
        deltList1.print();

        ListNode list2 = new ListNode(1);
        list2.add(1);
        list2.add(2);
        list2.add(3);
        list2.add(3);
        list2.print();
        ListNode deltList2 = deleteDuplicates(list2);
        deltList2.print();
    }
}
