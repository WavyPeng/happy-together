package com.ds.solution;

/**
 * @Description 约瑟夫环问题
 * @Author pengweiwei
 * @Date 2021/8/4 23:16
 */
public class JosephCircle {
    private ListNode tail;

    /**
     * 添加元素
     *
     * @param val
     */
    public void add(int val) {
        if (null == tail) {
            tail = new ListNode(val);
            tail.next = tail;
        } else {
            ListNode node = new ListNode(val);
            node.next = tail.next;
            tail.next = node;
            tail = node;
        }
    }

    /**
     * 打印
     */
    public void print() {
        ListNode cur = tail;
        if (null != cur) {
            do {
                cur = cur.next;
                System.out.printf("%d->", cur.val);
            } while (cur != tail);
        }
        System.out.println();
    }

    /**
     * 报数问题，元素出圈顺序
     *
     * @param n 表示元素个数
     * @param m 表示每次报几个数
     */
    public void out(int n, int m) {
        if (n <= 0 || m <= 0) {
            return;
        }
        ListNode first = tail;
        ListNode cur = tail.next;
        do {
            for (int i = 0; i < m - 1; i++) {
                cur = cur.next;
                first = first.next;
            }
            System.out.printf("%d->", cur.val);
            first.next = cur.next;
            cur = cur.next;
        } while (cur != first);
        System.out.printf("%d->", cur.val);
        System.out.println();
    }

    public static void main(String[] args) {
        JosephCircle circle = new JosephCircle();
        circle.add(1);
        circle.add(2);
        circle.add(3);
        circle.add(4);
        circle.add(5);
        circle.print();

        circle.out(5, 2);
    }
}
