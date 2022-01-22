package time;
import java.nio.charset.Charset;
import java.util.Comparator;
import java.util.Random;

public class Exercise7 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		SortingAlgorithms sortingAlgorithms = new SortingAlgorithms();
		Random random = new Random();
		
		var c = new Comparator<String>(){
			 
            @Override
            public int compare(String o1, String o2) {
                return o1.compareTo(o2);
            }};
		
		
		
		int[] randomIntegerArray = new int[80000];
		for (int i = 0; i < randomIntegerArray.length; i++) {
			randomIntegerArray[i] = random.nextInt();
		}
		
		String[] randomStringArray = new String[18000];
		for (int i = 0; i < randomStringArray.length; i++) {
			byte[] array = new byte[10]; // length is bounded by 10
			random.nextBytes(array);
			String generatedString = new String(array, Charset.forName("UTF-8"));
			randomStringArray[i] = generatedString;
		}
		
		
		long startTime = System.currentTimeMillis(); // fetch starting time
		var tempArray3 =sortingAlgorithms.insertionSort(randomIntegerArray);
		long timeEllapsed = System.currentTimeMillis() - startTime;
		System.out.println("Sorting int array with size 80000 and with random generated integers using insertion sort took: "  + timeEllapsed + "milliSeconds. \n\n");
		
		
		
		startTime = System.currentTimeMillis(); // fetch starting time
		var tempArray4 =sortingAlgorithms.insertionSort(randomStringArray, c);
		timeEllapsed = System.currentTimeMillis() - startTime;
		System.out.println("Sorting String array with size 18000 and with random generated strings using insertion sort took: "  + timeEllapsed + "milliSeconds. \n\n");
		
		
//	************************************************************************************************************************************************************************
		
		int[] xlargeSizeRandomIntegerArray = new int[5000000];
		for (int i = 0; i < xlargeSizeRandomIntegerArray.length; i++) {
			xlargeSizeRandomIntegerArray[i] = random.nextInt();
		}
		
		String[] xlargeSizeRandomStringArray = new String[1300000];
		for (int i = 0; i < xlargeSizeRandomStringArray.length; i++) {
			byte[] array = new byte[10]; // length is bounded by 10
			random.nextBytes(array);
			String generatedString = new String(array, Charset.forName("UTF-8"));
			xlargeSizeRandomStringArray[i] = generatedString;
		}
		
		
		startTime = System.currentTimeMillis(); // fetch starting time
		tempArray3 =sortingAlgorithms.mergeSort(xlargeSizeRandomIntegerArray);
		timeEllapsed = System.currentTimeMillis() - startTime;
		System.out.println("Sorting int array with size 3 000 000 and with random generated integers using merge sort took: "  + timeEllapsed + "milliSeconds. \n\n"); 
		
		
		
		startTime = System.currentTimeMillis(); // fetch starting time
		tempArray4 =sortingAlgorithms.mergeSort(xlargeSizeRandomStringArray, c);
		timeEllapsed = System.currentTimeMillis() - startTime;
		System.out.println("Sorting String array with size 1 300 000 and with random generated strings using merge sort took: "  + timeEllapsed + "milliSeconds. \n\n");
		
	}

}
