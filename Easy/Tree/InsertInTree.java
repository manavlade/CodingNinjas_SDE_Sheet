package Easy.Tree;

class TreeNode {
    int val;
    TreeNode left;
    TreeNode right;

    TreeNode() {
        this.val = 0;
        this.left = null;
        this.right = null;
    }

    TreeNode(int val) {
        this.val = val;
        this.left = null;
        this.right = null;
    }

    TreeNode(int val, TreeNode left, TreeNode right) {
        this.val = val;
        this.left = left;
        this.right = right;
    }
};

public class InsertInTree {
    /*
     * Question
     * You have been given a root node of the binary search tree and a positive
     * integer value. You need to perform an insertion operation i.e. inserting a
     * new node with the given value in the given binary search tree such that the
     * resultant tree is also a binary search tree.
     * If there can be more than one possible tree, then you can return any.
     * Note : 
     * A binary search tree is a binary tree data structure, with the following
     * properties :
     * a. The left subtree of any node contains nodes with a value less than the
     * node’s value.
     * b. The right subtree of any node contains nodes with a value equal to or
     * greater than the node’s value.
     * c. Right, and left subtrees are also binary search trees.
     * It is guaranteed that,
     * d. All nodes in the given tree are distinct positive integers.
     * e. The given BST does not contain any node with a given integer value.
     */
    public static TreeNode insertionInBST(TreeNode root, int val) {
        if(root == null){
            return new TreeNode(val);
        }
        if(root.val > val) root.left = insertionInBST(root.left, val);

        else root.right = insertionInBST(root.right, val);

        return root;
    }
}
