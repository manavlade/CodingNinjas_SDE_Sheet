package Easy.Tree;

class TreeNode {
    int data;
    TreeNode left;
    TreeNode right;

    TreeNode(int data) {
        this.data = data;
        this.left = null;
        this.right = null;
    }
}

public class HeightTree {
    /*
     * Question
     * The height of a tree is equal to the number of nodes on the longest path from
     * the root to a leaf.
     * You are given an arbitrary binary tree consisting of 'n' nodes where each
     * node is associated with a certain value.
     *  Find out the height of the tree
     */
    public static int heightOfBinaryTree(TreeNode root) {
        if(root ==  null){
            return 0;
        }

        int leftheight = heightOfBinaryTree(root.left);
        int rightHeight = heightOfBinaryTree(root.right);
        return Math.max(leftheight, rightHeight) + 1;
    }
}
