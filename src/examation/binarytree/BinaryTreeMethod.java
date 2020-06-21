package examation.binarytree;

import javax.crypto.interfaces.PBEKey;

/**
 *
 * 实现二叉树的相关方法。
 * @author zane
 */
public class BinaryTreeMethod {

    /**
     * 二叉树的清空操作：
     * 首先提供某棵树的根节点，然后从根节点递归的删除每个节点
     * @param binaryTreeNode
     */

    //清除某棵子树的所有节点。
    public static void clear(BinaryTreeNode binaryTreeNode) {
        if (binaryTreeNode != null) {
            clear(binaryTreeNode.getLeftChild());
            clear(binaryTreeNode.getRightChild());
            binaryTreeNode = null;
        }
    }


    /**
     * 获取某棵子树的高度。
     * 如果一个节点为空，那么这个节点肯定是一颗空树，高度为0；
     * 如果不为空，那么我们要遍历地比较它的左子树高度和右子树高度，
     * 高的一个为这个子树的最大高度，然后加上自己本身的高度就是了
     * @param node
     * @return
     */
    public static int height(BinaryTreeNode node) {

        if (node == null) {
            //递归结束
            return 0;
        }else {
            //递归遍历左子树
            int l = height(node.getLeftChild());
            //递归遍历右子树
            int r = height(node.getRightChild());
            //高度计算更高的一边（+1是因为要算上自身这一层）
            return l > r ? (l + 1) : (r + 1);
        }

    }

    /**
     *获取二叉树的节点数
     * @param node
     * @return
     */
    public static int size(BinaryTreeNode node) {
        if (node == null) {
            return 0;
        }else {
            return 1 + size(node.getLeftChild()) + size(node.getRightChild());
        }
    }

    /**
     * 先根遍历
     * @param node
     */
    public static void preOrder(BinaryTreeNode node) {
        if (node != null) {
            System.out.println(node.getValue()); //先访问根节点
            preOrder(node.getLeftChild()); //先根遍历左子树
            preOrder(node.getRightChild());

        }
    }

    /**
     * 中序遍历
     * @param node
     */
    public static void inOrder(BinaryTreeNode node) {
        if (node != null) {
            inOrder(node.getLeftChild());
            System.out.println(node.getValue());
            inOrder(node.getRightChild());

        }
    }

    /**
     * 后续遍历
     * @param node
     */
    public static void postOrder(BinaryTreeNode node) {
        if (node != null) {
            postOrder(node.getLeftChild());
            postOrder(node.getRightChild());
            System.out.println(node.getValue());
        }
    }



}
