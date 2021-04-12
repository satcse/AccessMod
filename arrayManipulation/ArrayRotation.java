package arrayManipulation;

public class ArrayRotation {

	void rotate(int arr[], int d, int n)
	{
		for(int i=0;i < d;i++)
			rotatePositions(arr,n);
	}
	
	void rotatePositions(int arr[], int n)
	{
		int i,temp;
		temp = arr[0];
		for(i=0;i< n- 1;i++)
			arr[i] = arr[i+1];
		
		arr[n-1] = temp;
	}
	
	void printArray(int arr[], int n)
	{
		for(int i=0;i<n;i++)
			System.out.print(arr[i] + ",");
	}
	
	public static void main(String[] args) {
		
		ArrayRotation obj = new ArrayRotation();
		int arr[] = {1,2,3,4,5,6,7};
		obj.rotate(arr,2,7);
		obj.printArray(arr,7);
	}

}
