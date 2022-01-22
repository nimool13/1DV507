package ns222tv_assign2;

import java.util.Iterator;
import java.util.NoSuchElementException;

public class LinkedQueue<T> implements IQueue<T> {

    private int numberOfElements;
    private Node first;
    private Node last;

    public LinkedQueue() {
        first = null;
        last  = null;
        numberOfElements = 0;
    }

    @Override
    public int size() {
        return numberOfElements;
    }

    @Override
    public boolean isEmpty() {
        return first == null;
    }

    @Override
    public void enqueue(T item) {
            Node oldlast = last;
            last = new Node();
            last.item = item;
            last.next = null;
            if (isEmpty())
                first = last;
            else
                oldlast.next = last;
            numberOfElements++;
    }

    @Override
    public T dequeue() {
        if (isEmpty()) throw new NoSuchElementException("Queue underflow");
        T item = (T) first.item;
        first = first.next;
        numberOfElements--;
        if (isEmpty())
        {
            last = null;
            first = null;
        }

        return item;
    }

    @Override
    public T first() {
        if(first == null)
            return null;
        else return (T) first.item;
    }

    @Override
    public T last() {
        if(last == null)
            return null;
        else return (T) last.item;
    }

    @Override
    public Iterator<T> iterator() {
        return null;
    }

    @Override
    public String toString()
    {
        String queueToText = new String();
        if(first == null)
            return "Queue is Empty.";
var temp = first;

        while(temp != null)
        {
            queueToText += " " + temp.item.toString() + " ";
            temp = temp.next;
        }

        return queueToText;
    }
}
