package Medium.LinkedList;

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

public class cycleDetectionSinglyLinkedList {
    /*
     * Question
     * You are given a Singly Linked List of integers. Return true if it has a
     * cycle, else return false.
     * A cycle occurs when a node's next points back to a previous node in the list.
     * Sample Input 1 :
     * 1 2 3 4 -1
     * 1
     * Sample Output 1 :
     * true
     */

    public static boolean detectCycle(Node head) {
        if(head == null || head.next == null){
            return false;
        }

        Node slow = head;
        Node fast = head;

        while (fast != null && fast.next != null) {
            slow = slow.next;
            fast = fast.next.next;

            if(slow == fast){
                return true;
            }
        }
        return false;
    }
}
