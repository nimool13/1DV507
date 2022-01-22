package time;
import static org.junit.jupiter.api.Assertions.*;


import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class BinaryIntHeapTest {
	
	BinaryIntHeap binaryIntHeap;

	@BeforeEach
	void setUp() {
	    binaryIntHeap = new BinaryIntHeap(15);
        binaryIntHeap.insert(5); 
        binaryIntHeap.insert(3); 
        binaryIntHeap.insert(17); 
        binaryIntHeap.insert(10); 
        binaryIntHeap.insert(84); 
        binaryIntHeap.insert(19); 
        binaryIntHeap.insert(6); 
        binaryIntHeap.insert(22); 
        binaryIntHeap.insert(9); 
	}



	@Test
	void testParent() {
		var parentIndex = binaryIntHeap.parent(2);
		var actualParent = binaryIntHeap.GetElementAtPosition(parentIndex);
		var expectedParent = 84;
		
		assertEquals(expectedParent, actualParent);	
	}

	@Test
	void testLeftChild() {
		var leftChildIndex = binaryIntHeap.leftChild(3);
		var actualLeftChild = binaryIntHeap.GetElementAtPosition(leftChildIndex);
		var expectedLeftChild = 5;
		
		assertEquals(expectedLeftChild, actualLeftChild);	
	}

	@Test
	void testRightChild() {
		var rightChildIndex = binaryIntHeap.rightChild(4);
		var actualrightChild = binaryIntHeap.GetElementAtPosition(rightChildIndex);
		var expectedrightChild = 9;
		
		assertEquals(expectedrightChild, actualrightChild);	
	}

	@Test
	void testIsLeaf() {
		var isLeaf = binaryIntHeap.isLeaf(7);
		assertEquals(true, isLeaf);
	}

	@Test
	void testSwap() {
		var firstElement = binaryIntHeap.GetElementAtPosition(5);
		var secondElement = binaryIntHeap.GetElementAtPosition(8);
		binaryIntHeap.swap(5, 8);
		
		
		assertEquals(secondElement, binaryIntHeap.GetElementAtPosition(5));
		assertEquals(firstElement, binaryIntHeap.GetElementAtPosition(8));
	}



	@Test
	void testPullHighest() {
		var firstHigest = binaryIntHeap.pullHighest();
		var expectedFirstHighest = 84;
		var secondHigest = binaryIntHeap.pullHighest();
		var expectedSecondHighest = 22;
		var thirdHigest = binaryIntHeap.pullHighest();
		var expectedThirdHighest = 19;
		var fourthHigest = binaryIntHeap.pullHighest();
		var expectedFourthHighest = 17;
		
		assertEquals(expectedFirstHighest, firstHigest);
		assertEquals(expectedSecondHighest, secondHigest);
		assertEquals(expectedThirdHighest, thirdHigest);
		assertEquals(expectedFourthHighest, fourthHigest);
	}
}
