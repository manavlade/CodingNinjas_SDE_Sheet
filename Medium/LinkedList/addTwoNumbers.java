package Medium.LinkedList;

class LinkedListNode {
    int data;
    LinkedListNode next;

    public LinkedListNode(int data) {
        this.data = data;
    }
}

public class addTwoNumbers {
    /*
     * Question
     * You are given two non-negative numbers 'num1' and 'num2' represented in the
     * form of linked lists.
     * The digits in the linked lists are stored in reverse order, i.e. starting
     * from least significant digit (LSD) to the most significant digit (MSD), and
     * each of their nodes contains a single digit.
     * Calculate the sum of the two numbers and return the head of the sum list.
     * Example :
     * Input:
     * 'num1' : 1 -> 2 -> 3 -> NULL
     * 'num2' : 4 -> 5 -> 6 -> NULL
     * Output: 5 -> 7 -> 9 -> NULL
     * Explanation: 'num1' represents the number 321 and 'num2' represents 654.
     * Their sum is 975.
     */
    static LinkedListNode addTwoNumbers(LinkedListNode head1, LinkedListNode head2) {
       LinkedListNode  dummy = new LinkedListNode(0);
        LinkedListNode curr = dummy;
        int carry = 0;


        while (head1 != null || head2 != null) {
            int x = (head1 != null) ? head1.data : 0;
            int y = (head2 != null) ? head2.data : 0;

            int sum = carry + x +y;

            carry = sum / 10;
            curr.next = new LinkedListNode(sum % 10);
            curr = curr.next;

            if(head1 != null) head1 = head1.next;
            if(head2 != null) head2 = head2.next;

        }

        if(carry > 0){
            curr.next = new LinkedListNode(carry);
        }

        return dummy.next;
    }
}
