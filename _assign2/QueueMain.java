package ns222tv_assign2;

public class QueueMain {
    public static void main(String[] args) throws Exception {
        LinkedQueue<Integer> linkedQueue = new LinkedQueue<Integer>();
        linkedQueue.enqueue(5);
        linkedQueue.enqueue(15);
        linkedQueue.enqueue(25);
        linkedQueue.enqueue(54);
        linkedQueue.enqueue(58);
        System.out.print(linkedQueue.toString());
        linkedQueue.dequeue();
        linkedQueue.dequeue();
        int a = 0;
    }
}
