package Easy.Linkedlist;

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

public class Question1 {
    /*
     * Question
     * Given a singly linked list of 'N' nodes. The objective is to determine the
     * middle node of a singly linked list. However, if the list has an even number
     * of nodes, we return the second middle node.
     */
       public static Node findMiddle(Node head)
    {
        Node temp = head;
        int length = 0;

        Node mid =  head;

        while (temp != null) {
            length++;
            temp = temp.next;
        }
        if(length % 2 == 0){

            for (int i = 0; i < length/2; i++) {
                mid = mid.next;
            }
            return mid;
        }
        else {
             for (int i = 0; i < length / 2; i++) {
                mid = mid.next;
             }
             return mid;
        }
    }
}
