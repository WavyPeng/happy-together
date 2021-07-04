package com.linkedlist.solution;

/**
 * @Author pengweiwei
 * @Date 2021/7/4 22:51
 */
public class MergeTwoSortedLists {
    /**
     * 思路一：迭代
     *
     * @param l1
     * @param l2
     * @return
     */
    public static ListNode mergeTwoLists1(ListNode l1, ListNode l2) {
        ListNode dummyHead = new ListNode(0);
        ListNode cur = dummyHead;
        while (null != l1 && null != l2) {
            if (l1.val < l2.val) {
                cur.next = l1;
                cur = cur.next;
                l1 = l1.next;
            } else {
                cur.next = l2;
                cur = cur.next;
                l2 = l2.next;
            }
        }
        cur.next = (null == l1 ? l2 : l1);
        return dummyHead.next;
    }

    /**
     * 思路二：递归
     *
     * @param l1
     * @param l2
     * @return
     */
    public static ListNode mergeTwoLists2(ListNode l1, ListNode l2) {
        if (null == l1) {
            return l2;
        } else if (null == l2) {
            return l1;
        } else if (l1.val < l2.val) {
            l1.next = mergeTwoLists2(l1.next, l2);
            return l1;
        } else {
            l2.next = mergeTwoLists2(l1, l2.next);
            return l2;
        }
    }

    public static void main(String[] args) {
        ListNode l1 = new ListNode(1);
        l1.add(2);
        l1.add(4);
        l1.print();
        ListNode l2 = new ListNode(1);
        l2.add(3);
        l2.add(4);
        l2.print();
//        ListNode mergedList1 = mergeTwoLists1(l1, l2);
//        mergedList1.print();
        ListNode mergedList2 = mergeTwoLists2(l1, l2);
        mergedList2.print();
    }
}
