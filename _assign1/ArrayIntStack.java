package ns222tv_assign1;

import java.util.Arrays;
import java.util.EmptyStackException;


public class ArrayIntStack extends AbstractIntCollection implements IntStack {



	public ArrayIntStack() {
		this.values=new int[0];
	}


	@Override
	public void push(int n) {

		int[] tempArray = values;
		values=Arrays.copyOf(tempArray,values.length+1);

		values[values.length-1]=n;
		size++;
	}

	@Override
	public int pop() throws IndexOutOfBoundsException {
		if (size==0) 
			throw new IndexOutOfBoundsException();
		else 
		{
			int temp= values[values.length-1];
			values=Arrays.copyOf(values,values.length-1);
			size--;
			return temp;
		}

	}

	@Override
	public int peek() throws IndexOutOfBoundsException {
		if(values.length == 0) {
			throw new EmptyStackException();
		} else {
			return values[values.length-1];
		}

	}	@Override
	public int size() {
		return this.size;
	}
	@Override
	public boolean isEmpty() {
		if (this.size==0) {
			return true;
			}
		else {
			return false;
		}

	}

	@Override
	public String toString() {
		String D ="";
		for (int i = 0 ;i<values.length;i++) {
			if (i==values.length-1)	
				D+=values[i] ;
			else {
				D+=values[i] + " ,";
			}
		} 
		return D;

	}
}
