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
public class Question3 {
    /*
     * Question
     * You are given a Singly Linked List of integers. You have to return true if
     * the linked list is palindrome, else return false.
     * A Linked List is a palindrome if it reads the same from left to right and
     * from right to left.
     * Example:
     * The lists (1 -> 2 -> 1), (3 -> 4 -> 4-> 3), and (1) are palindromes, while
     * the lists (1 -> 2 -> 3) and (3 -> 4) are not.
     */
    public static boolean isPalindrome(Node head) {

        if (head == null || head.next == null) {
            return true;
        }
        Node slow = head, fast = head;

        while (fast != null && fast.next != null) {
            slow = slow.next;
            fast = fast.next.next;
        }
        Node secondHalf = reverseList(slow);

        Node firstHalf = head;

        while (secondHalf != null) {
            if(firstHalf.data != secondHalf.data){
                return false;
            }
            firstHalf = firstHalf.next;
            secondHalf = secondHalf.next;
        }
        return true;
    }

    private static Node reverseList(Node head){
        Node prev = null;

        while (head != null) {
            Node next = head.next;
            head.next = prev;
            prev = head;
            head = next;
        }
        return prev;
    }
}
