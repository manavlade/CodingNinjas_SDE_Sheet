package Easy.Tree;

import java.util.ArrayList;
import java.util.List;

class TreeNode<T> {
    T data;
    TreeNode<T> left;
    TreeNode<T> right;

    public TreeNode() {
        this.data = null;
        this.left = null;
        this.right = null;
    }

    public TreeNode(T x) {
        this.data = x;
        this.left = null;
        this.right = null;
    }

    public TreeNode(T x, TreeNode<T> left, TreeNode<T> right) {
        this.data = x;
        this.left = left;
        this.right = right;
    }
};

public class PostOrder {
    /*
     * Question
     * You have been given a Binary Tree of 'n' nodes, where the nodes have integer
     * values. Your task is to return its postorder traversal.
     * For Example:
     * For the given tree below,
     * Postorder traversal for the given tree will be [4, 5, 2, 3, 1]. Hence, the
     * answer is [4, 5, 2, 3, 1].
     */
     public static List<Integer> postorderTraversal(TreeNode<Integer> root) {
        List<Integer> list = new ArrayList<>();
        postorderHelper(root, list);
        return list;
    }

    private static void postorderHelper(TreeNode<Integer> root,List<Integer> list ){
        if(root == null){
            return;
        }
        postorderHelper(root.left, list);
        postorderHelper(root.right, list);
        list.add((Integer) root.data);
    }
}
