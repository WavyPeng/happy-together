package com.wavy.solution;

import java.util.ArrayList;
import java.util.List;

/**
 * @author pengweiwei
 * @date 2021/5/6 10:51 PM
 */
public class Solution {
    public class ListNode {
        int val;
        ListNode next;

        ListNode(int x) {
            this.val = x;
        }
    }

    /**
     * 思路一：数组+双指针
     * 将链表中的元素拷贝到数组中，然后利用双指针遍历判断是否回文
     * 时间复杂度：O(n)
     * 空间复杂度：O(n)
     *
     * @param head
     * @return
     */
    public boolean isPalindrome(ListNode head) {
        List<Integer> array = new ArrayList<>();
        ListNode p = head;
        while (null != p) {
            array.add(p.val);
            p = p.next;
        }
        int sp = 0;
        int ep = array.size() - 1;
        while (sp < ep) {
            if (!array.get(sp).equals(array.get(ep))) {
                return false;
            }
            sp++;
            ep--;
        }
        return true;
    }

    /**
     * 思路二：快慢指针
     * 通过快慢指针定位链表终中点，然后将链表的后半段翻转，然后再做回文比较
     * 时间复杂度：O(n)
     * 空间复杂度：O(1)
     *
     * @param head
     * @return
     */
    public boolean isPalindrome1(ListNode head) {
        ListNode p = head;
        ListNode q = head;
        // 快慢指针找到中点
        while (null != q && null != q.next) {
            p = p.next;
            q = q.next.next;
        }
        // 翻转后半段链表
        ListNode dummy = null;
        while (null != p) {
            ListNode tmp = p.next;
            p.next = dummy;
            dummy = p;
            p = tmp;
        }
        // 回文比较
        ListNode p1 = head;
        ListNode p2 = dummy;
        while (null != p1 && null != p2) {
            if (p1.val != p2.val) {
                return false;
            }
            p1 = p1.next;
            p2 = p2.next;
        }
        return true;
    }
}
