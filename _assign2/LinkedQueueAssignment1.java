package ns222tv_assign2;

import java.util.Arrays;
import java.util.Iterator;

    public class LinkedQueueAssignment1 implements IntQueueAssignment1 {
        private int queueArray[];         // array to store queue elements
        private int count;         // current size of the queue

        // Constructor to initialize queue
        LinkedQueueAssignment1() {
            queueArray = new int[0];
            count = 0;
        }

        @Override
        public int size() {
            return count;
        }

        @Override
        public boolean isEmpty() {
            return (size() == 0);
        }


        @Override
        public void enqueue(int X) {
            queueArray = Arrays.copyOf(queueArray, queueArray.length + 1);
            queueArray[queueArray.length - 1] = X;
            count++;
        }

        @Override
        public int dequeue() {

            if (isEmpty()) {
                System.out.println("Queue is empty. There is no element to dequeue\nProgram closed");
                System.exit(1);
            }

            int dequeuedItem = queueArray[0];

            queueArray = Arrays.copyOfRange(queueArray, 1, queueArray.length);
            count--;

            return dequeuedItem;
        }

        @Override
        public int first() {

            return queueArray[0];
        }

        @Override
        public int last() {

            return queueArray[queueArray.length - 1];
        }

        @Override
        public String toString() {

            String queueToText = new String();

            for (int i = 0; i < size(); i++)
                queueToText += (" " + queueArray[i] + " ");

            return queueToText;
        }
    }


