package arrayManipulation;

import java.util.Arrays;

public class KthSmallest {

	public static int kthsmallest(Integer[] arr, int k)
	{
		//Sort the array.
		Arrays.sort(arr);
		
		//Return the Kth element
		return arr[k-1];
	}
	
	public static void main(String[] args) {
		Integer arr[] = new Integer[] {7,11,2,20,15,1,32,5};
		int k = 5;
		System.out.println("Kth Smallest: "+kthsmallest(arr, k));
		

	}

}
