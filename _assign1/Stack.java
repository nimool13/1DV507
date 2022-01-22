package ns222tv_assign1;
import java.util.*;
import java.util.EmptyStackException;

public class Stack implements IStringStack {
	private String[] arrayN;

	public Stack() {

		arrayN = new String[0];
	}
	public int size() {
		return arrayN.length;
	}
	public boolean isEmpty() {
		return arrayN.length == 0;
	}

	public void push(String element) {
		String [] temparrayN = this.arrayN;
		this.arrayN = Arrays.copyOf(temparrayN, arrayN.length+1);
		this.arrayN[arrayN.length-1] = element;
	}

	// getting rid of top element,
	public String pop() {
		if(arrayN.length == 0) {
			throw new EmptyStackException();
		} else {
			String Temp = arrayN[arrayN.length-1];
			this.arrayN = Arrays.copyOf(arrayN, arrayN.length-1);
			return Temp;
		}
	}

	public String peek() {
		if(arrayN.length == 0) {
			throw new EmptyStackException();
		} else {
			return arrayN[arrayN.length-1];
		}
	}

	@Override
	public String toString() {
		String A = "{";
		for(String x: arrayN) {
			A +=" "+x+",";
		}
		if(arrayN.length>0) {
			A = A.substring(0, A.length() - 1);
		}
		return A+ " }";
	}
}