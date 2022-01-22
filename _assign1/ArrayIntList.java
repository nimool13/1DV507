package ns222tv_assign1;

import java.util.Arrays;

public class ArrayIntList extends AbstractIntCollection implements IntList{



	public ArrayIntList (int n) {
		values = new int[n];
	}


	@Override
	public void add(int n) {	
		int[] tempArray = values;
		values=Arrays.copyOf(tempArray,values.length+1);			
		values[values.length-1]=n;
		size++;
	}



	public void addAt(int n, int index) throws IndexOutOfBoundsException {
		if(index<0 || index>=size)
			throw new IndexOutOfBoundsException();

		if (size ==values.length) {
			int[] tempArray = values;
			values=Arrays.copyOf(tempArray,values.length+1);

		}
		for( int i =values.length-2; i >=index ; i-- )
			values[i+1] = values [i];

		values[index]=n;

		size++;
	}

	@Override
	public void remove(int index) throws IndexOutOfBoundsException {
		if(index<0 ||index>=size) throw new IndexOutOfBoundsException();
		for ( int i=index;i<values.length-1; i++){
			values [ i ] = values[ i+1];} // Move one step backward
		size--;
		values = Arrays.copyOf(values, size); //this line and for loops changed after submission :(
	}

	@Override
	public int get(int index) throws IndexOutOfBoundsException {
		if(index<0 || index>=size)
			throw new IndexOutOfBoundsException();
		for ( int k=0;k<size; k++)
			if (index==k) {
				return values[k];
			}
		return -1;

	}

	@Override
	public int indexOf(int n) {
		for ( int j=0;j<size; j++)
			if (values[j]==n) {
				return j;
			}
		return -1;
	}
	@Override
	public boolean isEmpty() {
		if (this.size==0) {

			return false;}
		else {
			return false;
		}

	}
	@Override
	public String toString() {
		String Q ="";
		for (int i = 0 ;i<values.length;i++) {
			if (i==values.length-1)	
				Q+=values[i] ;
			else {
				Q+=values[i] + ",";
			}
		} 
		return Q;

	}
}