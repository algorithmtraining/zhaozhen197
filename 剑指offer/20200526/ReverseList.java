
public class ReverseList {

    /**
     * 新增一个空节点
     */
    public ListNode ReverseList(ListNode head) {
        ListNode h = new ListNode(0);
        h.next = head;
        ListNode pointer1 = h.next;
        if (pointer1 == null) {
            return head;
        }
        ListNode tmp = pointer1.next;
        pointer1.next = null;
        ListNode pointer2;
        while (tmp != null) {
            pointer2 = tmp.next;
            tmp.next = h.next;
            h.next = tmp;
            tmp = pointer2;
        }
        return h.next;
    }
}