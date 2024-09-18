public class rotateList {
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

    public ListNode rotateRight(ListNode head, int k) {
        /*
         * Question
         * Given the head of a linked list, rotate the list to the right by k places
         * ISKO EK BAAR REVISE KARNA HOGA EASY HAI FIR BHI 
         */ 

        if(head == null || head.next == null || k == 0){
            return head;
        }
        ListNode current = head;

        int length = 1;

        while (current.next != null) {
            current = current.next;
            length++;
        }

        current.next = head;

        k = k % length;
        int stepsToNewTail = length - k;

        ListNode newTail = head;

        for (int i = 1; i < stepsToNewTail; i++) {
            newTail = newTail.next;
        }

        ListNode newHead = newTail.next;

        newTail.next = null;

        return newHead;
    }

}
