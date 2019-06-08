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
		
		/* 
		  calling sorting algorithm
		  array as first argument 
		  left most index as second argument 
		  right most index as third argument 
		*/
		
		// printing array to console 
		
		sort.mergeSort(intArray, 0, intArray.length - 1);
		for(int i = 0;i<intArray.length;i++)
			System.out.println(intArray[i]); 
		
		// testing sorting algorithm 
		// makes sure each number is in correct index (sorted order)
		
		assertEquals(1,intArray[0]);
		assertEquals(5,intArray[1]);
		assertEquals(10,intArray[2]);
		assertEquals(20,intArray[3]);
		assertEquals(90,intArray[4]);
		
		 
		
	}
	
	

}
