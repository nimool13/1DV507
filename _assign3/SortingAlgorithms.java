package ns222tv_assign3;

import java.util.Comparator;

public class SortingAlgorithms {

	public static void main(String[] args) {

		int[] in = new int[] { 3, 67, 9, 1, 3, 96, 54, 23, 15,83,23, 42 };
		String[] in2 = new String[] { "zarzad", "vamqwad", "tholöi", "scg", "acvhg", "wSDE", "klg" };
		var tmp = mergeSort(in);
		
		var c = new Comparator<String>(){
			 
            @Override
            public int compare(String o1, String o2) {
                return o1.compareTo(o2);
            }};
		
		var tmp2 = mergeSort(in2, c);
	}

	public static int[] insertionSort(int[] in) {

		if (in == null) 
			return null;
		
		var tmpArray = in;
		for (int i = 1; i < tmpArray.length; ++i) {
			int key = tmpArray[i];
			int j = i - 1;

			while (j >= 0 && tmpArray[j] > key) {
				tmpArray[j + 1] = tmpArray[j];
				j = j - 1;
			}
			tmpArray[j + 1] = key;
		}
		return tmpArray;
	}

	 public static int[] mergeSort(int[] in) {
			if (in == null) 
				return null;
			
		    return sort(in, 0, in.length - 1);
		  }
  
	 //https://www.java67.com/2018/03/mergesort-in-java-algorithm-example-and.html
	 private static int[] sort(int[] in, int startIndex, int endIndex) {

			var tmpArray = in;
			
		    int middlePosition = (startIndex + endIndex) / 2;
		    if (startIndex < endIndex) {
		      sort(tmpArray, startIndex, middlePosition);
		      sort(tmpArray, middlePosition + 1, endIndex);
		    }

		    // merge solved pieces to get solution to original problem
		    int i = 0, first = startIndex, last = middlePosition + 1;
		    int[] tmp = new int[endIndex - startIndex + 1];

		    while (first <= middlePosition && last <= endIndex) {
		      tmp[i++] = tmpArray[first] < tmpArray[last] ? tmpArray[first++] : tmpArray[last++]; // if tmpfirst<tmplast tmp[first++] o mirize to tmp[i++]
				//age na tmp[last++] beriz to temp[i++]
		    }
		    while (first <= middlePosition) {
		      tmp[i++] = tmpArray[first++];
		    }
		    while (last <= endIndex) {
		      tmp[i++] = tmpArray[last++];
		    }
		    i = 0;
		    while (startIndex <= endIndex) {
		    	tmpArray[startIndex++] = tmp[i++];
		    }
		    
		    return tmpArray;
		  }

	  
	  
	  
	  
	  
  
	  
	public static String[] insertionSort(String[] in, Comparator<String> c) {
		if (in == null) 
			return null;
		
		var tmpArray = in;
		for (int i = 1; i < tmpArray.length; ++i) {
			String key = tmpArray[i];
			int j = i - 1;

			while (j >= 0 && c.compare(tmpArray[j], key) > 0) {
				tmpArray[j + 1] = tmpArray[j];
				j = j - 1;
			}
			tmpArray[j + 1] = key;
		}
		return tmpArray;
	}

	public static String[] mergeSort(String[] in, Comparator<String> c) {
		if (in == null) 
			return null;
		
	    return sortString(in, 0, in.length - 1, c);
	}
	
	 //https://www.java67.com/2018/03/mergesort-in-java-algorithm-example-and.html
	 private static String[] sortString(String[] in, int startIndex, int endIndex, Comparator<String> c) {

		//int a = c.compare("Farzad", "Farza");
		 
			var tmpArray = in;
			
		    int middlePosition = (startIndex + endIndex) / 2;
		    if (startIndex < endIndex) {
		    	sortString(tmpArray, startIndex, middlePosition, c);
		    	sortString(tmpArray, middlePosition + 1, endIndex, c);
		    }

		    // merge solved pieces to get solution to original problem
		    int i = 0, first = startIndex, last = middlePosition + 1;
		    String[] tmp = new String[endIndex - startIndex + 1];

		    while (first <= middlePosition && last <= endIndex) {
		      tmp[i++] = c.compare(tmpArray[first] , tmpArray[last]) < 0  ? tmpArray[first++] : tmpArray[last++];
		    }
		    while (first <= middlePosition) {
		      tmp[i++] = tmpArray[first++];
		    }
		    while (last <= endIndex) {
		      tmp[i++] = tmpArray[last++];
		    }
		    i = 0;
		    while (startIndex <= endIndex) {
		    	tmpArray[startIndex++] = tmp[i++];
		    }
		    
		    return tmpArray;
		  }
}



