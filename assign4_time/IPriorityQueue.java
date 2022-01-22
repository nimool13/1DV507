package time;

public interface IPriorityQueue {
	
	public void insert(Task t);
	public Task pullHighest();
	public boolean contains(Task t);
	public int size();
	public boolean isEmpty();
	public Task peekHighest();
}
