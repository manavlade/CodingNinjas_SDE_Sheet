package Easy.Tree;

import java.util.ArrayList;
import java.util.List;

public class inOrder {
    
    public class TreeNode {
        int data;
        TreeNode left;
        TreeNode right;

        TreeNode() {
            this.data = 0;
            this.left = null;
            this.right = null;
        }

        TreeNode(int val) {
            this.data = val;
            this.left = null;
            this.right = null;
        }

        TreeNode(int val, TreeNode left, TreeNode right) {
            this.data = val;
            this.left = left;
            this.right = right;
        }
    };
    
    /*
     * Question
     * You have been given a Binary Tree of 'n' nodes, where the nodes have integer
     * values. Your task is to return the In-Order traversal of the given binary
     * tree.
     * 
     * 
     */
    public static List<Integer> getInOrderTraversal(TreeNode root) {
        List<Integer> list = new ArrayList<>();
       inorderHelper(root, list);
       return list;
    }

    private static void inorderHelper(TreeNode root, List<Integer> list){
        if(root ==  null){
            return;
        }

        inorderHelper(root.left, list);
        list.add(root.data);
        inorderHelper(root.right, list);
    }
}
