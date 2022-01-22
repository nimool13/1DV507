package ns222tv_assign2;

public interface IntQueueAssignment1 {
    public int size();                     // current queue size
    public boolean isEmpty();              // true if queue is empty
    public void enqueue(int element);   // add element at end of queue
    public int dequeue();               // return and remove first element.
    public int first();                 // return (without removing) first element
    public int last();                  // return (without removing) last element
    public String toString();
}
