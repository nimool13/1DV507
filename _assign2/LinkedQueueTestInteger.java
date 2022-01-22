package ns222tv_assign2;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class LinkedQueueTestInteger {

    LinkedQueue<Integer> integerLinkedQueue;

    @Test
    void size() {

        integerLinkedQueue = new LinkedQueue<Integer>();
        var queueSize = integerLinkedQueue.size();
        assertEquals(0, queueSize);

        integerLinkedQueue.enqueue(5);
        queueSize = integerLinkedQueue.size();
        assertEquals(1, queueSize);
    }

    @Test
    void isEmpty() throws Exception {
        integerLinkedQueue = new LinkedQueue<Integer>();

        var isQueueEmpty = integerLinkedQueue.isEmpty();
        assertEquals(true, isQueueEmpty);

        integerLinkedQueue.enqueue(5);
        isQueueEmpty = integerLinkedQueue.isEmpty();
        assertEquals(false, isQueueEmpty);

        integerLinkedQueue.dequeue();
        isQueueEmpty = integerLinkedQueue.isEmpty();
        assertEquals(true, isQueueEmpty);
    }

    @Test
    void enqueue() {

        integerLinkedQueue = new LinkedQueue<Integer>();
        integerLinkedQueue.enqueue(5);
        var first = integerLinkedQueue.first();
        assertEquals(5, first);

        integerLinkedQueue.enqueue(6);
        var last = integerLinkedQueue.last();
        assertEquals(6, last);
    }

    @Test
    void dequeue() {

        integerLinkedQueue = new LinkedQueue<Integer>();
        integerLinkedQueue.enqueue(5);
        var dequeuedItem = integerLinkedQueue.dequeue();
        assertEquals(5, dequeuedItem);
    }

    @Test
    void first() {
        integerLinkedQueue = new LinkedQueue<Integer>();
        integerLinkedQueue.enqueue(5);
        var first = integerLinkedQueue.first();
        assertEquals(5, first);
        integerLinkedQueue.dequeue();
        integerLinkedQueue.enqueue(15);
        first = integerLinkedQueue.first();
        assertEquals(15, first);
    }

    @Test
    void last() {
        integerLinkedQueue = new LinkedQueue<Integer>();
        integerLinkedQueue.enqueue(5);
        integerLinkedQueue.enqueue(6);
        var last = integerLinkedQueue.last();
        assertEquals(6, last);
    }

    @Test
    void testToString() {
        integerLinkedQueue = new LinkedQueue<Integer>();
        integerLinkedQueue.enqueue(5);
        integerLinkedQueue.enqueue(6);
        integerLinkedQueue.enqueue(7);
        integerLinkedQueue.enqueue(8);

        String expectedResult = " 5  6  7  8 ";
        String actualResult = integerLinkedQueue.toString();

        assertTrue(expectedResult.equals(actualResult));

        integerLinkedQueue.dequeue();
        expectedResult = " 6  7  8 ";
        actualResult = integerLinkedQueue.toString();
        assertTrue(expectedResult.equals(actualResult));
    }

}