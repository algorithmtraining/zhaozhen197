package LinkedList;

import java.util.List;

/**
 * @program: zhaozhen197->RemoveNthFromEnd_zane_NO19
 * @description: 找到倒数第N个节点
 * @author: zhaozhen
 * @create: 2019-09-14 14:26
 **/
public class RemoveNthFromEnd_zane_NO19 {

    /**
     *
     * 快慢指针，怎加一个虚拟头节点，为了解决{1}挣种情况
     *
     * 先让快指针节点走n+1,然后快慢指针同时移动，条件是fast不为空时结束移动
     *
     * 让快指针多移动1部是为了获得第n个节点的前一个节点
     * @param head
     * @param n
     * @return
     */
    public ListNode removeNthFromEnd(ListNode head, int n) {
        ListNode node = new ListNode(0);
        node.next = head;
        ListNode fast = node;
        ListNode slow = node;
        for (int i = 0; i < n + 1; i++) {
            fast = fast.next;
        }
        while (fast != null) {
            fast = fast.next;
            slow = slow.next;
        }
        slow.next = slow.next.next;
        return node.next;
    }

    public ListNode removeNthFromEnd1(ListNode head, int n) {
        ListNode fast = head;
        ListNode slow = head;
        for (int i = 0; i < n; i++) {
            fast = fast.next;
        }
        while (fast.next != null) {
            fast = fast.next;
            slow = slow.next;
        }
        slow.next = slow.next.next;
        return head;
    }
}
