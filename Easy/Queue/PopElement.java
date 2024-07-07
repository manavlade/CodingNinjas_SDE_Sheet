package Easy.Queue;

import java.util.List;

public class PopElement {
    /*
     * Question
     * You have to implement the pop function of Max Priority Queue and implement
     * using a heap.
     * 
     * 
     * 
     * Functions :
     * a) push(int x) : 'x' has to be inserted in the priority queue. This has been
     * implemented already
     * 
     * b) pop() : return the maximum element in the priority queue, if priority
     * queue is empty then return '-1'.
     * 
     * 
     * Example:
     * We perform the following operations on an empty priority queue:
     * 
     * When operation push(5) is performed, we insert 1 in the priority queue.
     * 
     * When operation push(2) is performed, we insert 2 in the priority queue.
     * 
     * When operation pop() is performed, we remove the maximum element from the
     * priority queue and print which is 5.
     * 
     * When operation push(3) is performed, we insert 1 in the priority queue.
     * 
     * When operation pop() is performed, we remove the maximum element from the
     * priority queue and print which is 3.
     */
    public static int pop(List<Integer> heap) {

        if (heap.isEmpty()) {
            return -1;
        }
        swap(heap, 0, heap.size() - 1);

        int max = heap.remove(heap.size() - 1);

        heapify(heap, 0);

        return max;
    }

    private static void heapify(List<Integer> heap, int i) {
        int left = 2 * i + 1;
        int right = 2 * i + 2;
        int largest = i;

        if (left < heap.size() && heap.get(left) > heap.get(largest)) {
            largest = left;
        }
        if (right < heap.size() && heap.get(right) > heap.get(largest)) {
            largest = right;
        }

        if (largest != i) {
            swap(heap, i, largest);
            heapify(heap, largest);
        }
    }

    private static void swap(List<Integer> heap, int i, int j) {
        int temp = heap.get(i);
        heap.set(i, heap.get(j));
        heap.set(j, temp);
    }

    // Code Snippet of the push function:
    // public static void push(List<Integer> heap, int x) {
    // heap.add(x);
    //
    // // Position of the current inserted element.
    // int pos = heap.size() - 1;
    //
    // // Shifting the element up until it reaches the topmost node if it is larger
    // than its parent.
    // while (pos > 0) {
    // int parent = (pos - 1) / 2;
    // if (heap.get(pos) > heap.get(parent)) {
    // // Swapping the elements.
    // int temp = heap.get(parent);
    // heap.set(parent, heap.get(pos));
    // heap.set(pos, temp);
    // pos = parent;
    // } else {
    // // As parent is larger, the element is now in its correct position.
    // break;
    // }
    // }
    // }
}
