package com.linkedlist.solution;

/**
 * @Author pengweiwei
 * @Date 2021/7/11 14:40
 */
public class ConvertBinaryNumberInALinkedListToInteger {
    /**
     * 思路一：先将链表反转，然后遍历链表根据二进制转十进制规则求解即可
     *
     * @param head
     * @return
     */
    public static int getDecimalValue1(ListNode head) {
        int basic = 1;
        ListNode reverseHead = reverseList(head);
        ListNode p = reverseHead;
        int result = 0;
        while (null != p) {
            result += basic * p.val;
            p = p.next;
            basic *= 2;
        }
        reverseList(reverseHead);
        return result;
    }

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

    /**
     * 思路二：直接遍历
     * 1.每读取链表的一个节点值，可以认为读到的节点值是当前二进制数的最低位；
     * 2.当读到下一个节点值的时候，将已经读到的结果乘2，再将新读到的节点值当作当前二进制数的最低位；
     * 3.遍历链表直到结束
     * <p>
     * 时间复杂度：O(n)
     * 空间复杂度：O(1)
     *
     * @param head
     * @return
     */
    public static int getDecimalValue2(ListNode head) {
        ListNode p = head;
        int result = 0;
        while (null != p) {
            result = result * 2 + p.val;
            p = p.next;
        }
        return result;
    }

    /**
     * 思路三：直接遍历+位运算
     *
     * @param head
     * @return
     */
    public static int getDecimalValue3(ListNode head) {
        ListNode p = head;
        int result = 0;
        while (null != p) {
            result <<= 1;
            result |= p.val;
            p = p.next;
        }
        return result;
    }

    public static void main(String[] args) {
        ListNode list1 = new ListNode(1);
        list1.add(0);
        list1.add(1);
        list1.print();
        System.out.println(getDecimalValue1(list1));
        System.out.println(getDecimalValue2(list1));
        System.out.println(getDecimalValue3(list1));

        ListNode list2 = new ListNode(0);
        list2.print();
        System.out.println(getDecimalValue1(list2));
        System.out.println(getDecimalValue2(list2));
        System.out.println(getDecimalValue3(list2));

        ListNode list3 = new ListNode(1);
        list3.add(0);
        list3.add(0);
        list3.add(1);
        list3.add(0);
        list3.add(0);
        list3.add(1);
        list3.add(1);
        list3.add(1);
        list3.add(0);
        list3.add(0);
        list3.add(0);
        list3.add(0);
        list3.add(0);
        list3.add(0);
        list3.print();
        System.out.println(getDecimalValue1(list3));
        System.out.println(getDecimalValue2(list3));
        System.out.println(getDecimalValue3(list3));
    }
}
