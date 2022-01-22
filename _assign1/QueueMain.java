package ns222tv_assign1;

public class QueueMain {


	public static void main(String[] args) {
		
		// create a queue of capacity 5
				LinkedQueue nima = new LinkedQueue();
				nima.enqueue(1);
				nima.enqueue(2);
				nima.enqueue(3);
				nima.enqueue(4);

				String queueString = nima.toString();
				System.out.println("String representation of queue: " + queueString);
				
				System.out.println("Front element is: " + nima.first());
				nima.dequeue();
				System.out.println("Front element is: " + nima.first());

				System.out.println("Queue size is " + nima.size());

				nima.dequeue();
				nima.dequeue();
				
				if (nima.isEmpty())
					System.out.println("Queue Is Empty");
				else
					System.out.println("Queue Is Not Empty");
	}

}
