package com.ds.solution;

/**
 * @Author pengweiwei
 * @Date 2021/8/1 17:01
 */
public class LinkedList {
    private ListNode head;

    LinkedList() {
        this.head = new ListNode(0, null);
    }

    public void add(int val) {
        ListNode node = new ListNode(val, null);
        ListNode temp = head;
        while (null != temp.next) {
            temp = temp.next;
        }
        temp.next = node;
    }

    public void insert(int val) {
        ListNode node = new ListNode(val);
        ListNode temp = head;
        while (null != temp.next && temp.next.val <= val) {
            temp = temp.next;
        }
        node.next = temp.next;
        temp.next = node;
    }

    public void remove(int val) {
        ListNode temp = head;
        while (temp.next.val != val) {
            temp = temp.next;
        }
        ListNode removeNode = temp.next;
        temp.next = removeNode.next;
        removeNode.next = null;
    }

    public void print() {
        ListNode temp = head.next;
        while (null != temp) {
            System.out.printf("%d->", temp.val);
            temp = temp.next;
        }
        System.out.printf("null \n");
    }

    public static void main(String[] args) {
        LinkedList linkedList = new LinkedList();
        linkedList.add(1);
        linkedList.print();
        linkedList.add(3);
        linkedList.print();
        linkedList.insert(2);
        linkedList.print();
        linkedList.insert(4);
        linkedList.print();
        linkedList.add(5);
        linkedList.print();
        linkedList.remove(3);
        linkedList.print();
        linkedList.insert(6);
        linkedList.print();
        linkedList.remove(6);
        linkedList.print();
    }
}
