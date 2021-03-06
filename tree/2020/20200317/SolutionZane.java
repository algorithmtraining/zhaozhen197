
import java.util.LinkedList;
import java.util.Queue;

class Solution {
    int sumTilt = 0;

    public int findTilt(TreeNode root) {
        depthOrderSum(root);
        return sumTilt;
    }

    private int depthOrderSum(TreeNode root) {
        if (root == null) {
            return 0;
        }

        int left = depthOrderSum(root.left);
        int right = depthOrderSum(root.right);
        sumTilt += Math.abs(left - right);
        return left + right + root.val;
    }

    public TreeNode createBinaryTreeByLevel(Integer[] array) {
        if (array.length == 0) {
            return null;
        }
        TreeNode root = new TreeNode(array[0]);
        Queue<TreeNode> queue = new LinkedList<TreeNode>();
        queue.offer(root);

        int i = 1;
        Integer temp = null;
        while (i < array.length) {
            TreeNode node = queue.poll();
            temp = array[i++];
            if (temp != null) {
                TreeNode left = new TreeNode(temp);
                node.left = left;
                queue.offer(left);
            }

            temp = array[i++];
            if (temp != null) {
                TreeNode right = new TreeNode(temp);
                node.right = right;
                queue.offer(right);
            }
        }
        return root;
    }

    public static void main(String[] args) {
        Integer[] array = { 1, null, 3, 2, null };
        Solution solution = new Solution();
        TreeNode root = solution.createBinaryTreeByLevel(array);
        int temp = solution.findTilt(root);
        System.out.println(temp);

    }

}
