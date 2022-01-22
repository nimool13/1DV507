package ns222tv_assign3;

import static org.junit.jupiter.api.Assertions.*;

import java.util.Comparator;

import org.junit.jupiter.api.Test;


class SortingAlgorithmsTest {

	@Test
	void testInsertionSortIntArray() {

		int[] in = new int[] { 3, 67, 9, 1, 26, 96, 54, 72, 15, 83, 23, 42 };
		int[] expected = new int[] { 1, 3, 9, 15, 23, 26, 42, 54, 67, 72, 83, 96 };

		var actual = SortingAlgorithms.insertionSort(in);

		assertArrayEquals(expected, actual);
	}

	@Test
	void testMergeSortIntArray() {
		int[] in = new int[] { 3, 67, 9, 1, 26, 96, 54, 72, 15, 83, 23, 42 };
		int[] expected = new int[] { 1, 3, 9, 15, 23, 26, 42, 54, 67, 72, 83, 96 };

		var actual = SortingAlgorithms.mergeSort(in);

		assertArrayEquals(expected, actual);
	}

	@Test
	void testInsertionSortStringArrayComparatorOfString() {
		String[] in = new String[] { "ZB", "HS", "TY", "KV", "ML", "PD", "XW" };
		String[] expected = new String[] { "HS", "KV", "ML", "PD", "TY", "XW", "ZB"};
		
		var c = new Comparator<String>(){
 
            @Override
            public int compare(String o1, String o2) {
                return o1.compareTo(o2);
            }};
                     
		var actual = SortingAlgorithms.insertionSort(in, c);
			
		assertArrayEquals(expected, actual);
	}

	@Test
	void testMergeSortStringArrayComparatorOfString() {
		String[] in = new String[] { "ZB", "HS", "TY", "KV", "ML", "PD", "XW" };
		String[] expected = new String[] { "HS", "KV", "ML", "PD", "TY", "XW", "ZB"};
		
		var c = new Comparator<String>(){
 
            @Override
            public int compare(String o1, String o2) {
                return o1.compareTo(o2);
            }};
                     
		var actual = SortingAlgorithms.mergeSort(in, c);
			
		assertArrayEquals(expected, actual);
	}

}
