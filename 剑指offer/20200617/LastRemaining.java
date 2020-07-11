import java.util.ArrayList;

public class LastRemaining {
    
    /**
     * 使用链表模拟删除过程时间复杂度是O(mn),超时。
     * @param n
     * @param m
     * @return
     */
    public int lastRemaining(int n, int m) {
        ListNode head = new ListNode(0);
        ListNode node = head;
        ListNode pre;
        int count=1;
        for(int i=1;i<n;i++){
            node.next = new ListNode(i);
            node=node.next;
        }
        node.next = head;
        pre = node;
        while(head.next != head){
            if(count == m){
                pre.next = head.next;
                head = head.next;
                count = 1;
            }else{
                pre = pre.next;
                head = head.next;
                count++;
            }
        }
        return head.val;
    }

    /**
     * 约瑟夫环的解决方法。
     */
    public int lastRemaining1(int n, int m) {
        ArrayList<Integer> nums = new ArrayList<>();
        for(int i=0;i<n;i++){
            nums.add(i);
        }

        int idx = 0;
        while(n>1){
            idx = (idx+m-1)%n;
            nums.remove(idx);
            n--;
        }
        return nums.get(0);

    }

    public static void main(String[] args) {
        LastRemaining lastRemaining = new LastRemaining();
        int tmp = lastRemaining.lastRemaining(5, 3);
        System.out.println(tmp);
    }
}