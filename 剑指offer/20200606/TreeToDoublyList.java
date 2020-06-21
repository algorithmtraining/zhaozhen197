import java.util.Stack;

/**
 * java.lang.NullPointerException at line 117, TreeNodeSerializer.isValid at
 * line 144, TreeNodeSerializer.serialize at line 186, __Driver__.main
 */
public class TreeToDoublyList {
    Node pre, head;

    public Node treeToDoublyList(Node root) {
        if (root == null) {
            return null;
        }
        Stack<Node> stack = new Stack<>();
        Node head = null;
        Node node = root;
        Node prev1 = null;
        Node tail = null;
        while (node != null || !stack.isEmpty()) {
            while (node != null) {
                stack.push(node);
                node = node.left;
            }
            node = stack.pop();
            tail = node;
            if (pre== null) {
                head = node;
            }
            if (prev1 != null) {
                prev1.right = node;
                node.left = prev1;
            }

            prev1 = node;
            node = node.right;
        }
        tail.right = head;
        head.left = tail;
        return head;
    }

    public Node treeToDoublyList1(Node root) {
        if (root == null)
            return null;

        midOrder(root);
        head.left = pre;
        pre.right = head;
        return head;

    }

    public void midOrder(Node root) {
        if (root == null) {
            return;
        }
        midOrder(root.left);
        if (pre != null) {
            pre.right = root;
        } else {
            head = root;
        }
        root.left = pre;
        pre = root;
        midOrder(root.right);
    }
}
