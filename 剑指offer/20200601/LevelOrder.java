import java.util.*;
public class LevelOrder{

    /**
     * 只要注意到每次循环都要把进入循环时的队列中的全部元素就是每层的元素。
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
            res.add(list);
            list=new ArrayList<>();
        }
        return res;
    }
}