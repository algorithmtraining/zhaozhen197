import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;



class Solution {
    public TreeNode buildTree(int[] preorder, int[] inorder) {
        if(preorder.length == 0 || inorder.length == 0){
            return null;
        }
        Map<Integer,Integer> inOrderMap = new HashMap<>();
        for(int i = 0;i<inorder.length;i++){
            inOrderMap.put(inorder[i], i);
        }

        TreeNode root = build(preorder, 0, preorder.length-1, inorder, 0, inorder.length-1, inOrderMap);
        return root;
    }

    public TreeNode build(int[] preOrder,int preStart,int preEnd,int[] inOrder,int inStart,int inEnd,Map<Integer,Integer> inOrderMap){
        if(preEnd<preStart){
            return null;
        }
        int rootVal = preOrder[preStart];
        TreeNode root= new TreeNode(rootVal);
        if(preEnd == preStart){
            return root;
        }else{
            int rootIndex = inOrderMap.get(rootVal);
            int leftNodeIndex = rootIndex-inStart;
            int rightNodeIndex = inEnd - rootIndex;
            TreeNode leftNode = build(preOrder, preStart+1, leftNodeIndex+preStart, inOrder, inStart, rootIndex-1, inOrderMap);
            TreeNode rigNode = build(preOrder, preEnd-rightNodeIndex+1, preEnd, inOrder, rootIndex+1, inEnd, inOrderMap);
            root.left = leftNode;
            root.right = rigNode;
            return root;
        }

    }
}