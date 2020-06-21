class DeleteNode {
    public ListNode deleteNode(ListNode head, int val) {

        if(head.val == val) return head.next;

        ListNode h = head;
        ListNode pre, tmp;
        pre = h;
        tmp = pre.next;
        while (tmp != null && tmp.val != val) {
          
            pre = tmp;
            tmp = tmp.next;
        }
        if(tmp != null){
            pre.next = tmp.next;
        }
        return h;
    }
    public static void main(String[] args) {
        int[] nums= {-3,5,99};
        ListNode head = new ListNode(0);
        ListNode h = head;
        for(int i=0;i<nums.length;i++){
            h.next = new ListNode(nums[i]);
            h= h.next;
        }

        ListNode tmp = new DeleteNode().deleteNode(head, -3);
        tmp = tmp.next;
        while(tmp != null){
            System.out.println(tmp.val);
            tmp = tmp.next;
        }
    }
}