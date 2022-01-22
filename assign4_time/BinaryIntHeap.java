package time;

//https://www.geeksforgeeks.org/max-heap-in-java/
public class BinaryIntHeap {
	    private int[] HeapArray; 
	    private int HeapSize; 
	    private int MaxSize; 
	  
	    public BinaryIntHeap(int maxsize) 
	    { 
	        this.MaxSize = maxsize; 
	        this.HeapSize = 0; 
	        HeapArray = new int[this.MaxSize + 1]; 
	        HeapArray[0] = Integer.MAX_VALUE; 
	    } 
	    
	    public int GetElementAtPosition(int position) 
	    { 
	        return HeapArray[position]; 
	    } 
	    
	  
	    public int parent(int position) 
	    { 
	        return position / 2; 
	    } 
	  
	    public int leftChild(int position) 
	    { 
	        return (2 * position); 
	    } 
	    public int rightChild(int position) 
	    { 
	        return (2 * position) + 1; 
	    }

	// Returns true of given node is leaf
	    public boolean isLeaf(int position) 
	    { 
	        if (position >= (HeapSize / 2) && position <= HeapSize) { 
	            return true; 
	        } 
	        return false; 
	    } 
	  
	    public void swap(int firstPosition, int secondPosition) 
	    { 
	        int tempElement; 
	        tempElement = HeapArray[firstPosition]; 
	        HeapArray[firstPosition] = HeapArray[secondPosition]; 
	        HeapArray[secondPosition] = tempElement; 
	    } 
	  
	    public void maxHeapify(int position) 
	    { 
	        if (isLeaf(position)) 
	            return; 
	  
	        if (HeapArray[position] < HeapArray[leftChild(position)] ||  
	            HeapArray[position] < HeapArray[rightChild(position)]) { 
	  
	            if (HeapArray[leftChild(position)] > HeapArray[rightChild(position)]) { 
	                swap(position, leftChild(position)); 
	                maxHeapify(leftChild(position)); 
	            } 
	            else { 
	                swap(position, rightChild(position)); 
	                maxHeapify(rightChild(position)); 
	            } 
	        } 
	    } 
	  
	    public void insert(int element) 
	    { 
	        HeapArray[++HeapSize] = element; 
	  
	        int current = HeapSize; 
	        while (HeapArray[current] > HeapArray[parent(current)]) { 
	            swap(current, parent(current)); 
	            current = parent(current); 
	        } 
	    } 
	  
	    public void print() 
	    { 
	        for (int i = 1; i <= HeapSize / 2; i++) { 
	            System.out.print(" Parent : " + HeapArray[i] + " Left : " + 
	                      HeapArray[2 * i] + " Right :" + HeapArray[2 * i + 1]); 
	            System.out.println(); 
	        } 
	    } 
	  
	    public int pullHighest() 
	    { 
	        int highest = HeapArray[1]; 
	        HeapArray[1] = HeapArray[HeapSize--]; 
	        maxHeapify(1); 
	        return highest; 
	    } 
	     
	  
	    public static void main(String[] arg) 
	    { 
	        System.out.println("The Max Heap is "); 
	        BinaryIntHeap binaryIntHeap = new BinaryIntHeap(15); 
	        binaryIntHeap.insert(24);
	        binaryIntHeap.insert(37);
	        binaryIntHeap.insert(12);
	        binaryIntHeap.insert(15);
	        binaryIntHeap.insert(41);
	       binaryIntHeap.insert(19);
	   //     binaryIntHeap.insert(24);
	   //    binaryIntHeap.insert(46);
	    //    binaryIntHeap.insert(9);
	  
	        binaryIntHeap.print(); 
	        System.out.println("The max val is " + binaryIntHeap.pullHighest()); 
	    } 
	} 

