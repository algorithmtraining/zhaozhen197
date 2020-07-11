import java.util.*;

public class PathSum {
    List<List<Integer>> res = new LinkedList<>();
    LinkedList<Integer> path = new LinkedList<>();

    /**
     * DFS+回溯。回溯算法的题目基本都是采用先序遍历的方式，在遍历过程中都要记录当前节点的值，在回溯的时候要注意将
     * 访问过的节点从记录值中删除掉。
     */
    public List<List<Integer>> pathSum(TreeNode root, int sum) {

        if(root == null){
            return res;
        }
        recure(root, sum);
        return res;
    }

    public void recure(TreeNode root,int tar){
        if(root==null){
            return;
        }
        path.add(root.val);
        tar = tar-root.val;
        if(tar ==0 && root.left == null && root.right ==null)
        {
            res.add(new LinkedList<Integer>(path));
        }

        recure(root.left, tar);
        recure(root.right, tar);
        path.removeLast();
    }

}