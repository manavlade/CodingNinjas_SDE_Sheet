class Node {
    int data;
    Node next;

    Node(int data) {
        this.data = data;
        this.next = null;
    }
};

public class RemoveDuplcicate {
    public static Node uniqueSortedList(Node head) {

        if (head == null || head.next == null)
            return head;

        Node p = head, n = head.next;

        while (n != null) {

            if (p.data != n.data) {

                p.next = n;

                p = p.next;

            }

            n = n.next;

        }

        if (p.next != null)
            p.next = null;

        return head;

    }
}
