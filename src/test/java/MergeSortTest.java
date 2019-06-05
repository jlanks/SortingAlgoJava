import static org.junit.Assert.*;
import junit.framework.*;

import org.junit.Test;

public class MergeSortTest extends TestCase{

	@Test
	public void testSort() {
		
		// Instantiating class 
		MergeSort sort = new MergeSort(); 
		
		// creating array to be sorted 
		int intArray[] = new int[] {20,90,10,1,5};
		
		// calling sorting algorithm
		sort.MergeSort(intArray);
		
		// testing sorting algorithm 
		assertEquals(intArray[0], 1);
		assertEquals(intArray[1], 5);
		assertEquals(intArray[2], 10);
		assertEquals(intArray[3], 20);
		assertEquals(intArray[4], 90);
		
		
		
	}

}
