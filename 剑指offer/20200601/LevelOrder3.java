import java.util.*;
public class LevelOrder3{

    /**
     * 对偶数层的list进行反转序列即可。
     * @param root
     * @return
     */
    public List<List<Integer>> levelOrder(TreeNode root) {
        List<List<Integer>> res = new ArrayList<>();
        List<Integer> list = new ArrayList<>();
        if(root == null){
            return res;
        }
        Queue<TreeNode> queue = new LinkedList<>();
        queue.offer(root); 
        int count = 1;
        TreeNode node;
        while(!queue.isEmpty()){
            int tmp = queue.size();
            for(int i = 0;i<tmp;i++){
                node = queue.poll();
                list.add(node.val);
                if(node.left != null){
                    queue.offer(node.left);                    
                }
                if(node.right != null){
                    queue.offer(node.right);
                }
            }
            if(count++ %2==0){
                Collections.reverse(list);
            }
            res.add(list);
            list=new ArrayList<>();
        }
        return res;
    }
}