
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
public class Question2 {
    /*
     * Question
     * You are given a Singly Linked List of integers. You need to reverse the
     * Linked List by changing the links between nodes.
     * 
     * 
     * 
     * Example:
     * 
     * Input:
     * 2 4 5 -1
     * 
     * Output:
     * 5 4 2 -1
     * 
     * Explanation: 2->4->5 is the initial linked list. If we reverse this, we get
     * 5->4->2.
     */
    public static Node reverseLinkedList(Node head) {
       Node prev = null;
       Node current = head;
       Node next = null;

       while (current != null) {
        next = current.next;
        current.next = prev;
        prev = current;
        current = next;
       }
       return prev;
    }
}
