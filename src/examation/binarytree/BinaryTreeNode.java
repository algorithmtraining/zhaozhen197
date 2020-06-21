package examation.binarytree;

/**
 * 二叉树节点类
 * @author zane
 */
public class BinaryTreeNode {

    private int value; //节点值

    //左孩子
    private BinaryTreeNode leftChild;

    //右孩子
    private BinaryTreeNode rightChild;


    public int getValue() {
        return value;
    }

    public void setValue(int value) {
        this.value = value;
    }

    public BinaryTreeNode getLeftChild() {
        return leftChild;
    }

    public void setLeftChild(BinaryTreeNode leftChild) {
        this.leftChild = leftChild;
    }

    public BinaryTreeNode getRightChild() {
        return rightChild;
    }

    public void setRightChild(BinaryTreeNode rightChild) {
        this.rightChild = rightChild;
    }
}
