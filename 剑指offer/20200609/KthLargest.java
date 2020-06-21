import java.util.Stack;

public class KthLargest {
    public int kthLargest(TreeNode root, int k) {
        Stack<TreeNode> stack = new Stack<>();
        stack.push(root);
        TreeNode node =root ;
        int count=0;
        while(node != null||!stack.isEmpty()){
            while(node !=null){
                stack.push(node);
                node = node.right;
            }

            if(!stack.isEmpty()){
                TreeNode pop = stack.pop();
                count++;
                if(count == k){
                    return pop.val;
                }

                if(pop.left!= null){
                    node  = pop.left;
                }
            }
            
        }
        return 0;
    }
}

class TreeNode {
    int val;
    TreeNode left;
    TreeNode right;
    TreeNode(int x){
        val =x;
    }
}