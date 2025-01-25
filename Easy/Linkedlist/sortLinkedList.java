import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

class Node {
    public int data;
    public Node next;

    Node() {
        this.data = 0;
        this.next = null;
    }

    Node(int data) {
        this.data = data;
        this.next = null;
    }

    Node(int data, Node next) {
        this.data = data;
        this.next = next;
    }
}

/*
 * Question
 * Given a linked list of 'N' nodes, where each node has an integer value that
 * can be 0, 1, or 2. You need to sort the linked list in non-decreasing order
 * and the return the head of the sorted list.
 * Example:
 * Given linked list is 1 -> 0 -> 2 -> 1 -> 2.
 * The sorted list for the given linked list will be 0 -> 1 -> 1 -> 2 -> 2.
 * 
 */
public class sortLinkedList {
    public static Node sortList(Node head) {
        if (head == null) {
            return head;
        }
        List<Integer> list = new ArrayList<>();

        Node temp = head;
        while (temp != null) {
            list.add(temp.data);
            temp = temp.next;
        }
        Collections.sort(list);

        Node dummy = new Node(0);
        Node current = dummy;

        for (int value : list) {
            current.next = new Node(value);
            current = current.next;
        }
        return dummy.next;
    }
}
