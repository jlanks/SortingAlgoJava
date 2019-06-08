
public class MergeSort {
	
	/*
	   MERGESORT:
	   Function which sorts the array arr[]
	   l is the left index 
	   n is the right index
	   by recursively calling the MERGESORT function
	 */
	
	public void prinArr(int Arr[]) {
		for(int i =0;i<Arr.length;i++)
			System.out.println(Arr[i]);
		System.out.printf("%n");
	}
	
	public void mergeSort(int arr[], int l, int n) {
			
			/* 
			  if the left index is less than the right index:
			   
			  make this statement because when the left is 
			  greater or equal than the right then 
			  there is only on element in the array arr[] 
			  
			  there's no need to sort an array of one element
			*/
		
			if(l < n) {
				
				// find mid point of the array
				
				int mid = (l+n)/2; 
				
				// make recursive calls to MERGESORT for each half
				
				mergeSort(arr,l,mid);
				mergeSort(arr,mid+1,n); 
				
				// merge the two sorted halves 
				
				merge(arr, l, mid, n); 
				
				
				
				
				
			}	
		}
	
	/* 
	   MERGE: 
	   Merges two subarrays
	   first sa is from index [0..m]
	   second sa is from index [m+1..n]
	*/ 
	
	public void merge(int arr[], int l, int m, int n) {
		
		/* 
		   assigning size of first subarray 
		   this is up to the mid point
		   (midpoint - left index + one)
		   add one since the index starts at 0
		   and we are calculating the size
		*/
		
		int n1 = m - l + 1; 
		
		// size of second array (total number of elements - midpoint)
		
		int n2 = n - m; 
		
		// create temporary arrays of correct sizes 
		
		int L[] = new int [n1]; 
		int R[] = new int [n2]; 

		// copy data into the temporary arrays from the original array 
		
		for(int i = 0; i<n1; ++i)
			
			// assign each index in left array to i plus the left index 
			
			L[i] = arr[i+l]; 
		
		for(int j = 0; j<n2; ++j) 
			
			// assign each index in right array to j plus the midpoint plus one
			// midpoint plus one since the midpoint will be in the left array 
			// therefore don't include it in the right array
			
			R[j] = arr[j+m+1]; 
		
		 
	
		// set starting indexes for the subarrays to zero
		
		int i = 0, j = 0; 
		
		// set starting index for the merged subarray array
		// this gets set to the left index argument 
		
		int k = l; 
		
		// while the left index is smaller than the size if the left array and,
		// while the right index is smaller than the size if the right array
		
		while(i < n1 && j < n2) {
			
			/* 
			   if the item in the left array @ index i is less or equal
			   to the item in the right array @ index j
			 */
			
			if(L[i] <= R[j]) {
				
				/* 
				  the merged array at the index k 
				  (current index for the merged subarray array)
				  is assigned to the lower value, in
				  this case it's L[i]
				 */
				
				arr[k] = L[i];
				
				/* 
				   increase the index i, move to the next value since 
				   the old one was already passed and 
				   no longer needs to be compared
				*/
				
				i ++; 
			}
			
			/* 
			   if the item in the right array @ index i is less or equal
			   to the item in the left array @ index j
			 */
			
			else {
				
				arr[k] = R[j]; 
				j ++; 
				
			}
			
			// increase the value of k since a value has been added
			k ++; 
				
		}
		
		/* 
		   add the remaining elements from the 
		   subarrays L[] and R[] to the merged array
		
		*/
		
		while(i < n1) {
			arr[k] = L[i];
			i ++;
			k ++; 
		}
		
		while(j < n2) {
			arr[k] = R[j];
			j ++; 
			k ++; 
		}
		
	}

}
