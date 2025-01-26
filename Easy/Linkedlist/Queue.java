class Node {
    int data;
    Node next;

    Node(int data) {
        this.data = data;
        this.next = null;
    }
}
/*
 * Question
 * Implement a Queue Data Structure specifically to store integer data using a
 * Singly Linked List or an array.
 * 
 * You need to implement the following public functions :
 * 
 * 1. Constructor: It initializes the data members as required.
 * 
 * 2. enqueue(data): This function should take one argument of type integer. It
 * enqueues the element into the queue.
 * 
 * 3. dequeue(): It dequeues/removes the element from the front of the queue and
 * in turn, returns the element being dequeued or removed. In case the queue is
 * empty, it returns -1.
 * 
 * 4. front(): It returns the element being kept at the front of the queue. In
 * case the queue is empty, it returns -1.
 * 
 * 5. isEmpty(): It returns a boolean value indicating whether the queue is
 * empty or not.
 * Operations Performed on the Queue :
 * Query-1(Denoted by an integer 1): Enqueues integer data to the queue.
 * 
 * Query-2(Denoted by an integer 2): Dequeues the data kept at the front of the
 * queue and returns it to the caller, return -1 if no element is present in the
 * queue.
 * 
 * Query-3(Denoted by an integer 3): Fetches and returns the data being kept at
 * the front of the queue but doesn't remove it, unlike the dequeue function,
 * return -1 if no element is present in the queue.
 * 
 * Query-4(Denoted by an integer 4): Returns a boolean value denoting whether
 * the queue is empty or not.
 */

public class Queue {
    private Node front;
    private Node rear;
    private int size;

    public Queue() {
        this.front = null;
        this.rear = null;
        this.size = 0;
    }

    /*----------------- Public Functions of Queue -----------------*/

    boolean isEmpty() {
        return size == 0;
    }

    void enqueue(int data) {
        Node newNode = new Node(data);
        if(rear == null){
            front = newNode;
            rear = newNode;
        }
        else {
            rear.next = newNode;
            rear = newNode;
        }
        size++;
    }

    int dequeue() {
        if(isEmpty()){
            return -1;
        }

        int dequeu = front.data;
        front = front.next;

        if(front == null){
            rear = null;
        }
        size--;
        return dequeu;
    }

    int front() {
        if(isEmpty()){
            return -1;
        }
        
        return front.data;
    }
}
