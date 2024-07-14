package Easy.Tree;

class BinaryTreeNode<T> {
    T data;
    BinaryTreeNode<T> left;
    BinaryTreeNode<T> right;

    BinaryTreeNode() {
        this.data = null;
        this.left = null;
        this.right = null;
    }

    BinaryTreeNode(T data) {
        this.data = data;
        this.left = null;
        this.right = null;
    }

    BinaryTreeNode(T data, BinaryTreeNode<T> left, BinaryTreeNode<T> right) {
        this.data = data;
        this.left = left;
        this.right = right;
    }
};

public class DeleteNode {
    /*
     * Question
     * You have been given a Binary Search Tree of integers with ‘N’ nodes. You are
     * also given data of a node of this tree. Your task is to delete the given node
     * from the BST.
     * A binary search tree (BST) is a binary tree data structure that has the
     * following properties:
     * • The left subtree of a node contains only nodes with data less than the
     * node’s data.
     * • The right subtree of a node contains only nodes with data greater than the
     * node’s data.
     * • Both the left and right subtrees must also be binary search trees.
     */
    public static BinaryTreeNode<Integer> deleteNode(BinaryTreeNode<Integer> root, int key) {
        if(root == null){
            return root;
        }

      if(key < root.data){
        root.left = deleteNode(root.left, key);
      }
      else if(key > root.data){
        root.right = deleteNode(root.right, key);
      }
      else {
        if(root.left == null){
            return root.right;
        }
        else if(root.right == null){
            return root.left;
        }

        root.data = minValue(root.right);
        root.right = deleteNode(root.right, root.data);
      }
      return root;
    }

    private static int minValue(BinaryTreeNode<Integer> root){
        int minv = root.data;
        while (root.left != null) {
            root = root.left;
            minv = root.data;
        }
        return minv;
    }
}
