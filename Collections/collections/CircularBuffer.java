package collections;

import java.util.*;

public class CircularBuffer {
    static class CircularQueue {
        int[] buffer;
        int size, start, count;

        public CircularQueue(int capacity) {
            buffer = new int[capacity];
            size = capacity;
            start = 0;
            count = 0;
        }

        public void insert(int value) {
            int end = (start + count) % size;
            buffer[end] = value;
            if (count < size) {
                count++;
            } else {
                start = (start + 1) % size;
            }
        }

        public void printBuffer() {
            for (int i = 0; i < count; i++) {
                int index = (start + i) % size;
                System.out.print(buffer[index] + " ");
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter buffer size: ");
        int capacity = sc.nextInt();

        CircularQueue cb = new CircularQueue(capacity);

        System.out.print("Enter number of elements to insert: ");
        int n = sc.nextInt();

        System.out.println("Enter elements:");
        for (int i = 0; i < n; i++) {
            cb.insert(sc.nextInt());
        }

        System.out.print("Buffer contents: ");
        cb.printBuffer();
    }
}