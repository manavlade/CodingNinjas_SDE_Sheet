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
        LinkedListNode dummy = new LinkedListNode(0);
        LinkedListNode curr = dummy;
        int carry = 0;

        while (head1 != null || head2 != null) {
            int x = (head1 != null) ? head1.data : 0;
            int y = (head2 != null) ? head2.data : 0;

            int sum = carry + x + y;

            carry = sum / 10;
            curr.next = new LinkedListNode(sum % 10);
            curr = curr.next;

            if (head1 != null)
                head1 = head1.next;
            if (head2 != null)
                head2 = head2.next;

        }

        if (carry > 0) {
            curr.next = new LinkedListNode(carry);
        }

        return dummy.next;
    }

    public class ListNode {
        int val;
        ListNode next;

        ListNode() {
        }

        ListNode(int val) {
            this.val = val;
        }

        ListNode(int val, ListNode next) {
            this.val = val;
            this.next = next;
        }
    }

    /*
     * Question
     * You are given two non-empty linked lists representing two non-negative
     * integers. The digits are stored in reverse order, and each of their nodes
     * contains a single digit. Add the two numbers and return the sum as a linked
     * list.
     * You may assume the two numbers do not contain any leading zero, except the
     * number 0 itself.
     * Example
     * Input: l1 = [2,4,3], l2 = [5,6,4]
     * Output: [7,0,8]
     * Explanation: 342 + 465 = 807.
     * 
     */
    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {

        ListNode dummy = new ListNode(0);
        ListNode current = dummy;

        int carry = 0;

        while (l1 != null || l2 != null || carry != 0) {
            int sum = carry;

            if (l1 != null) {
                sum += l1.val;
                l1 = l1.next;
            }

            if (l2 != null) {
                sum += l2.val;
                l2 = l2.next;
            }

            carry = sum / 10;

            current.next = new ListNode(sum % 10);
            current = current.next;

        }

        return dummy.next;

    }
}
