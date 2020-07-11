import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

public class LevelOrder {

    public int[] levelOrder(TreeNode root) {

        if(root==null){
            return new int[0];
        }
        List<Integer> nodes = new ArrayList<>();
        Queue<TreeNode> q = new LinkedList<>();
        q.add(root);
        TreeNode node;
        while(!q.isEmpty()){
            node = q.poll();
            nodes.add(node.val);
            if(node.left!=null){
                q.offer(node.left);
            }
            if(node.right !=null){
                q.offer(node.right);
            }
        }
        return nodes.stream().mapToInt(Integer::valueOf).toArray();
    }
}