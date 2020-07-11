import java.util.LinkedList;
import java.util.List;
import java.util.Stack;

public class ReversePrint_zane {
    public int[] reversePrint(ListNode head) {
        StringBuilder stringBuilder = new StringBuilder();
        ListNode temp = head;
        while (temp != null) {
            stringBuilder.append(temp.val);
            temp = temp.next;
        }
        stringBuilder.reverse();
        int[] a = new int[stringBuilder.length()];
        for (int i = 0; i < stringBuilder.length(); i++) {
            a[i] = Integer.v(stringBuilder.charAt(i));
        }
        return a;
    }

    public int[] reversePrint2(ListNode head) {
        Stack<ListNode> stack = new Stack<>();
        ListNode temp = head;
        while (temp != null) {
            stack.push(temp);
            temp = temp.next;
        }
        int[] a = new int[stack.size()];
        int i=0;
        while(!stack.empty()){
            a[i++] = stack.peek().val;
            stack.pop();
        }

        return a;
    }
}