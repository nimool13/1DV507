package ns222tv_assign1;

	public class StackMain {
	    public static void main(String[] args) {
	        Stack testStack = new Stack();
	        testStack.push(" Bad Friends ");
	        testStack.push(" Loyal Friends ");
	        testStack.push(" Lombe Friends ");
	        
	        String popOut = testStack.pop();
	        System.out.println(popOut);
	        System.out.println(testStack.peek());
	        
	        System.out.println(testStack.peek());
	        
	        System.out.println(testStack.toString());
	    }
	}