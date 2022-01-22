package ns222tv_assign2;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class LinkedQueueTestString {
    LinkedQueue<String> stringLinkedQueue;

    @Test
    void size() {

        stringLinkedQueue = new LinkedQueue<String>();
        var queueSize = stringLinkedQueue.size();
        assertEquals(0, queueSize);

        stringLinkedQueue.enqueue("Test1");
        queueSize = stringLinkedQueue.size();
        assertEquals(1, queueSize);
    }

    @Test
    void isEmpty() throws Exception {
        stringLinkedQueue = new LinkedQueue<String>();

        var isQueueEmpty = stringLinkedQueue.isEmpty();
        assertEquals(true, isQueueEmpty);

        stringLinkedQueue.enqueue("Test1");
        isQueueEmpty = stringLinkedQueue.isEmpty();
        assertEquals(false, isQueueEmpty);

        stringLinkedQueue.dequeue();
        isQueueEmpty = stringLinkedQueue.isEmpty();
        assertEquals(true, isQueueEmpty);
    }

    @Test
    void enqueue() {

        stringLinkedQueue = new LinkedQueue<String>();
        stringLinkedQueue.enqueue("Test1");
        var first = stringLinkedQueue.first();
        assertEquals("Test1", first);

        stringLinkedQueue.enqueue("Test2");
        var last = stringLinkedQueue.last();
        assertEquals("Test2", last);
    }

    @Test
    void dequeue() {

        stringLinkedQueue = new LinkedQueue<String>();
        stringLinkedQueue.enqueue("Test1");
        var dequeuedItem = stringLinkedQueue.dequeue();
        assertEquals("Test1", dequeuedItem);
    }

    @Test
    void first() {
        stringLinkedQueue = new LinkedQueue<String>();
        stringLinkedQueue.enqueue("Test1");
        var first = stringLinkedQueue.first();
        assertEquals("Test1", first);
        stringLinkedQueue.dequeue();
    }

    @Test
    void last() {
        stringLinkedQueue = new LinkedQueue<String>();
        stringLinkedQueue.enqueue("Test1");
        stringLinkedQueue.enqueue("Test2");
        var last = stringLinkedQueue.last();
        assertEquals("Test2", last);
        stringLinkedQueue.dequeue();
        stringLinkedQueue.dequeue();
    }

}