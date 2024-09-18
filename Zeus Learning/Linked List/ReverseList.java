public class ReverseList {

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

    public ListNode reverseList(ListNode head) {
        /*
         * Question
         * Given the head of a singly linked list, reverse the list, and return the
         * reversed list.
         */

        if (head == null) {
            return null;
        }
        ListNode prev = head;
        ListNode current = head.next;

        while (current != null) {
            ListNode next = current.next;

            current.next = prev;

            // update
            prev = current;
            current = next;

        }
        head.next = null;
        head = prev;

        return prev;
    }
}
