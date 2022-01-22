package ns222tv_assign2;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class LinkedQueueAssignment1Assignment1Test {

    LinkedQueueAssignment1 LinkedQueueAssignment1;

    @Test
    void size() {

        LinkedQueueAssignment1 = new LinkedQueueAssignment1();
        var queueSize = LinkedQueueAssignment1.size();
        assertEquals(0, queueSize);

        LinkedQueueAssignment1.enqueue(5);
        queueSize = LinkedQueueAssignment1.size();
        assertEquals(1, queueSize);

        LinkedQueueAssignment1.enqueue(5);
        queueSize = LinkedQueueAssignment1.size();
        assertEquals(2, queueSize);

        LinkedQueueAssignment1.dequeue();
        queueSize = LinkedQueueAssignment1.size();
        assertEquals(1, queueSize);
    }

    @Test
    void isEmpty() {
        LinkedQueueAssignment1 = new LinkedQueueAssignment1();
        var actualIsEmpty = LinkedQueueAssignment1.isEmpty();
        assertEquals(true, actualIsEmpty);

        LinkedQueueAssignment1.enqueue(5);
        actualIsEmpty = LinkedQueueAssignment1.isEmpty();
        assertEquals(false, actualIsEmpty);

        LinkedQueueAssignment1.dequeue();
        actualIsEmpty = LinkedQueueAssignment1.isEmpty();
        assertEquals(true, actualIsEmpty);
    }


    @Test
    void enqueue() {
        LinkedQueueAssignment1 = new LinkedQueueAssignment1();

        LinkedQueueAssignment1.enqueue(5);
        var first = LinkedQueueAssignment1.first();
        assertEquals(5, first);

        LinkedQueueAssignment1.enqueue(6);
        var last = LinkedQueueAssignment1.last();
        assertEquals(6, last);
    }

    @Test
    void dequeue() {
        LinkedQueueAssignment1 = new LinkedQueueAssignment1();
        LinkedQueueAssignment1.enqueue(5);
        var dequeuedItem = LinkedQueueAssignment1.dequeue();
        assertEquals(5, dequeuedItem);

        LinkedQueueAssignment1.enqueue(10);
        dequeuedItem = LinkedQueueAssignment1.dequeue();
        assertEquals(10, dequeuedItem);
    }

    @Test
    void first() {
        LinkedQueueAssignment1 = new LinkedQueueAssignment1();
        LinkedQueueAssignment1.enqueue(5);
        var first = LinkedQueueAssignment1.first();
        assertEquals(5, first);
    }

    @Test
    void last() {
        LinkedQueueAssignment1 = new LinkedQueueAssignment1();
        LinkedQueueAssignment1.enqueue(5);
        LinkedQueueAssignment1.enqueue(6);
        var last = LinkedQueueAssignment1.last();
        assertEquals(6, last);

        LinkedQueueAssignment1.enqueue(7);
        last = LinkedQueueAssignment1.last();
        assertEquals(7, last);

        LinkedQueueAssignment1.enqueue(8);
        last = LinkedQueueAssignment1.last();
        assertEquals(8, last);
    }

    @Test
    void testToString() {
        LinkedQueueAssignment1 = new LinkedQueueAssignment1();
        LinkedQueueAssignment1.enqueue(5);
        LinkedQueueAssignment1.enqueue(6);
        LinkedQueueAssignment1.enqueue(7);
        LinkedQueueAssignment1.enqueue(8);

        String expectedResult = " 5  6  7  8 ";
        String actualResult = LinkedQueueAssignment1.toString();

        assertTrue(expectedResult.equals(actualResult));

        LinkedQueueAssignment1.dequeue();
        expectedResult = " 6  7  8 ";
        actualResult = LinkedQueueAssignment1.toString();
        assertTrue(expectedResult.equals(actualResult));
    }
}