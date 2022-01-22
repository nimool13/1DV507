package time;

public class WorkMain {

	public static void main(String[] arg) {
		System.out.println("The priority queue looks like this: ");
		PriorityQueue priorityQueue = new PriorityQueue(15);
		
		WorkTask workTask1 = new WorkTask("Task1", 5);
		priorityQueue.insert(workTask1);

		WorkTask workTask2 = new WorkTask("Task2", 3);
		priorityQueue.insert(workTask2);
		
		WorkTask workTask3 = new WorkTask("Task3", 17);
		priorityQueue.insert(workTask3);
		
		WorkTask workTask4 = new WorkTask("Task4", 10);
		priorityQueue.insert(workTask4);
		
		WorkTask workTask5 = new WorkTask("Task5", 84);
		priorityQueue.insert(workTask5);
		
		WorkTask workTask6 = new WorkTask("Task6", 19);
		priorityQueue.insert(workTask6);
		
		WorkTask workTask7 = new WorkTask("Task7", 6);
		priorityQueue.insert(workTask7);
		
		WorkTask workTask8 = new WorkTask("Task8", 22);
		priorityQueue.insert(workTask8);
		
		WorkTask workTask9 = new WorkTask("Task9", 9);
		priorityQueue.insert(workTask9);
		
        priorityQueue.print(); 
        
        var highestTask = priorityQueue.peekHighest();
        
        
        var contains = priorityQueue.contains(workTask8);
        if(contains)
            System.out.println("Item was found"); 
        else
            System.out.println("Item was not found"); 
        
        System.out.println("The max val is " + highestTask.Description + " with priority of : " + highestTask.Priority); 
	}
}
