package time;

public class PriorityQueue implements IPriorityQueue {

	private Task[] HeapArray;
	private int HeapSize;
	private int MaxSize;

	public PriorityQueue(int maxSize) {
		this.MaxSize = maxSize;
		this.HeapSize = 0;
		HeapArray = new Task[this.MaxSize + 1];

		WorkTask workTask = new WorkTask("", Integer.MAX_VALUE);
		HeapArray[0] = workTask;
	}

	@Override
	public void insert(Task task) {
		HeapArray[++HeapSize] = task;

		int current = HeapSize;
		while (HeapArray[current].Priority > HeapArray[parent(current)].Priority) {
			swap(current, parent(current));
			current = parent(current);
		}
	}

	@Override
	public Task pullHighest() {
		Task highest = HeapArray[1];
		HeapArray[1] = HeapArray[HeapSize--];
		maxHeapify(1);
		return highest;
	}

	@Override
	public boolean contains(Task task) {
		for (int i = 1; i <= HeapSize; i++) {

			var current = HeapArray[i];
			if (task.Priority > current.Priority)
				return false;

			if (current.Description.equalsIgnoreCase(task.Description) && current.Priority == task.Priority)
				return true;
		}

		return false;
	}

	@Override
	public int size() {
		return HeapSize;
	}

	@Override
	public boolean isEmpty() {
		return HeapSize == 0;
	}

	@Override
	public Task peekHighest() {
		return HeapArray[1];
	}

	public Task GetElementAtPosition(int position) {
		return HeapArray[position];
	}

	public int parent(int position) {
		return position / 2;
	}

	public int leftChild(int position)

	{
		return (2 * position);
	}

	public int rightChild(int position) {
		return (2 * position) + 1;
	}

	public boolean isLeaf(int position) {
		if (position >= (HeapSize / 2) && position <= HeapSize) {
			return true;
		}
		return false;
	}

	public void swap(int firstPosition, int secondPosition) {
		Task tempElement;
		tempElement = HeapArray[firstPosition];
		HeapArray[firstPosition] = HeapArray[secondPosition];
		HeapArray[secondPosition] = tempElement;
	}

	public void maxHeapify(int position) {
		if (isLeaf(position))
			return;

		if (HeapArray[position].Priority < HeapArray[leftChild(position)].Priority
				|| HeapArray[position].Priority < HeapArray[rightChild(position)].Priority) {

			if (HeapArray[leftChild(position)].Priority > HeapArray[rightChild(position)].Priority) {
				swap(position, leftChild(position));
				maxHeapify(leftChild(position));
			} else {
				swap(position, rightChild(position));
				maxHeapify(rightChild(position));
			}
		}
	}

	public void print() {
		for (int i = 1; i <= HeapSize / 2; i++) {
			System.out.print(" Parent : " + HeapArray[i].Description + " with priority of " + HeapArray[i].Priority
					+ " Left : " + HeapArray[2 * i].Description + " with priority of " + HeapArray[2 * i].Priority
					+ " Right :" + HeapArray[2 * i + 1].Description + " with priority of "
					+ HeapArray[2 * i + 1].Priority);
			System.out.println();
		}
	}
}
