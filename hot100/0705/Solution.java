public class Solution{

    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        ListNode head = new ListNode(0);
        ListNode tmp = head;
        int numAdd = 0;
        int aMod = 0;
        while(l1!=null && l2!=null){
            aMod = (l1.val + l2.val + numAdd)%10;
            numAdd = (l1.val + l2.val + numAdd)/10;
            ListNode node = new ListNode(aMod);
            tmp.next = node;
            tmp = tmp.next;
            l1 = l1.next;
            l2 = l2.next;
        }
        while(l1!=null){
            aMod = (l1.val  + numAdd)%10;
            numAdd = (l1.val  + numAdd)/10;
            ListNode node = new ListNode(aMod);
            tmp.next = node;
            tmp = tmp.next;
            l1 = l1.next;
        }

        while(l2!=null){
            aMod = (l2.val  + numAdd)%10;
            numAdd = (l2.val  + numAdd)/10;
            ListNode node = new ListNode(aMod);
            tmp.next = node;
            tmp = tmp.next;
            l2 = l2.next;
        }
        return head.next;
    }
}