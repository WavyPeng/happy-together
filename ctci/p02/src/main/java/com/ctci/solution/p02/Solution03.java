package com.ctci.solution.p02;

/**
 * @author pengweiwei
 * @date 2021/4/30 11:22 AM
 */
public class Solution03 {
    public class ListNode {
        int val;
        ListNode next;

        ListNode(int x) {
            this.val = x;
        }
    }

    /**
     * 思路：
     * 将待删除节点的下一个节点的值赋值给待删除节点，然后将待删除节点的下个节点删除即可
     *
     * @param node
     */
    public void deleteNode(ListNode node) {
        node.val = node.next.val;
        node.next = node.next.next;
    }
}
