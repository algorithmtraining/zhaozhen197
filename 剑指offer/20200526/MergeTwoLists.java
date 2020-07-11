public class MergeTwoLists {
    /**
     * 解题的关键就是搞个假的头结点
     * 
     */
    public ListNode MergeTwoLists(ListNode l1, ListNode l2) {

        ListNode p = new ListNode(0);
        ListNode head = p;
        while (l1 != null && l2 != null) {
            while (l1 != null && l2 != null && l1.val < l2.val) {
                p.next = l1;
                l1 = l1.next;
                p = p.next;
                p.next = null;

            }
            while (l2 != null && l1 != null && l1.val >= l2.val) {
                p.next = l2;
                p = p.next;
                l2 = l2.next;
                p.next = null;
            }

        }
        while (l1 != null) {
            p.next = l1;
            p = p.next;
            l1 = l1.next;
        }
        while (l2 != null) {
            p.next = l2;
            p = p.next;
            l2 = l2.next;
        }

        return head.next;
    }
}