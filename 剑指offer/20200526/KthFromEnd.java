
public class KthFromEnd {

    /**
     * 普通的想法是使用两次遍历，第一次查出链表的长度length，第二次遍历到length-k;
     * 使用滑动窗口即双指针的情况，先让快指针走k个位置，然后快慢指针同时开始走，当快指针走到头的时候，返回慢指针即可。
     * 
     * @param head
     * @param k
     * @return
     */
    public ListNode getKthFromEnd(ListNode head, int k) {
        ListNode start = head;
        ListNode end = head;
        for (int i = 0; i < k; i++) {
            end = end.next;
        }
        while (end != null) {
            start = start.next;
            end = end.next;
        }
        return start;
    }
}