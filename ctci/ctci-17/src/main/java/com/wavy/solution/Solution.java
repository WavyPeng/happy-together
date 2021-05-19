package com.wavy.solution;

/**
 * @Author pengweiwei
 * @Date 2021/5/19 23:14
 */
public class Solution {
    public class ListNode {
        int val;
        ListNode next;

        ListNode(int x) {
            this.val = x;
            next = null;
        }
    }

    /**
     * 思路：快慢指针
     * X-a->Y-b->Z
     * ⬆--c--⬇
     * <p>
     * 假设X是链表起点，Y是环的入口节点，slow和fast两个指针，fast的前进速度是slow的两倍，它们相遇于节点Z。
     * 其中，XY之间的距离为a，YZ之间距离为b，ZY之间距离为c；
     * 那么，根据上述条件，可得出2(a+b)=a+n(b+c)+b，即a=(n-1)(b+c)+c
     * 因此，X到Y的距离，即从Z开始在环内走过n-1圈加上Z到Y的距离
     * <p>
     * 因此，当slow和fast在Z点相遇之后，将slow返回起点，并和fast同时开始以相同的速度向前移动，两者再次相遇即为环的入口
     *
     * @param head
     * @return
     */
    public ListNode detectCycle(ListNode head) {
        ListNode slow = head;
        ListNode fast = head;
        while (null != fast && null != fast.next) {
            slow = slow.next;
            fast = fast.next.next;
            if (slow == fast) {
                slow = head;
                while (slow != fast) {
                    slow = slow.next;
                    fast = fast.next;
                }
                return slow;
            }
        }
        return null;
    }
}
