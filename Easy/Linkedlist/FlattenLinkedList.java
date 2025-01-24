import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

class Node {
    public int data;
    public Node next;
    public Node child;

    Node() {
        this.data = 0;
        this.next = null;
        this.child = null;
    }

    Node(int data) {
        this.data = data;
        this.next = null;
        this.child = null;
    }

    Node(int data, Node next, Node child) {
        this.data = data;
        this.next = next;
        this.child = child;
    }
}

/*
 * Question
 * You are given a linked list containing 'n' 'head' nodes, where every node in
 * the linked list contains two pointers:
 * (1) ‘next’ which points to the next node in the list
 * (2) ‘child’ pointer to a linked list where the current node is the head.
 * Each of these child linked lists is in sorted order and connected by 'child'
 * pointer.
 * Your task is to flatten this linked such that all nodes appear in a single
 * layer or level in a 'sorted order'.
 */
public class FlattenLinkedList {
    public static Node flattenLinkedList(Node head) {
        List<Integer> list = new ArrayList<>();

        Node temp = head;

        while (temp != null) {
            Node chilNode = temp;

            while (chilNode != null) {
                list.add(chilNode.data);
                chilNode = chilNode.child;
            }
            temp = temp.next;
        }

        Collections.sort(list);

        Node dummmy = new Node(0);
        Node current = dummmy;

        for (int value : list) {
            current.child = new Node(value);
            current = current.child;
        }

        return dummmy.child;
    }

}
