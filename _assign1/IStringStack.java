package ns222tv_assign1;
public interface IStringStack {
	   int size(); 			// Current stack size
	   boolean isEmpty(); 		// true if stack is empty
	   void push(String element); 	// Add element at top of stack
	   String pop(); 		// Return and remove top element,
					// exception if stack is empty
	   String peek(); 		// Return (without removing) top element,
					// exception if stack is empty.
	}
