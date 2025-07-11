package Stack_and_Queue_and_HashMaps;

import java.util.Stack;

class MyQueue {
    private Stack<Integer> stackEnqueue;
    private Stack<Integer> stackDequeue;

    public MyQueue() {
        stackEnqueue = new Stack<>();
        stackDequeue = new Stack<>();
    }

    public void enqueue(int x) {
        stackEnqueue.push(x);
    }

    public int dequeue() {
        shiftStacks();
        if (stackDequeue.isEmpty()) {
            throw new RuntimeException("Queue is empty");
        }
        return stackDequeue.pop();
    }

    public int peek() {
        shiftStacks();
        if (stackDequeue.isEmpty()) {
            throw new RuntimeException("Queue is empty");
        }
        return stackDequeue.peek();
    }

    public boolean isEmpty() {
        return stackEnqueue.isEmpty() && stackDequeue.isEmpty();
    }

    private void shiftStacks() {
        if (stackDequeue.isEmpty()) {
            while (!stackEnqueue.isEmpty()) {
                stackDequeue.push(stackEnqueue.pop());
            }
        }
    }
}

public class QueuebyStack {
    public static void main(String[] args) {
        runQueueDemo(); 
    }

    public static void runQueueDemo() {
        MyQueue queue = new MyQueue();

        queue.enqueue(10);
        queue.enqueue(20);
        queue.enqueue(30);

        System.out.println(queue.dequeue()); 
        queue.enqueue(40);
        System.out.println(queue.peek());   
        System.out.println(queue.dequeue()); 
        System.out.println(queue.dequeue());
        System.out.println(queue.dequeue());
        System.out.println(queue.isEmpty()); 
    }
}

