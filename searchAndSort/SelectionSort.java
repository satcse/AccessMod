package searchAndSort;

public class SelectionSort {

    public static void main(String[] args) {

    int[] arr = {9,6,3,1,2,4,5};
    int length = arr.length;
    selectionSort(arr);
    System.out.println("The sorted elements are:");
    for(int i:arr){

        System.out.println(i);
         }
     }

    public static void selectionSort(int[] arr){

        for(int i=0;i<arr.length-1;i++){

            int index =i;
            for(int j=i+1;j<arr.length;j++){
                if(arr[j]<arr[index]){

                    index =j; // index is the minimum
                }

            }
            int smallNumber = arr[index]; // M value here
            arr[index]= arr[i]; //Swapping arr[0] with smallNumber(M)
            arr[i]= smallNumber;
        }

    }
}

