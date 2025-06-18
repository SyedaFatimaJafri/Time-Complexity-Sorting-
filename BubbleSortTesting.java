package sorting;

import java.util.Random;
import java.util.Arrays;
public class BubbleSortTesting {
public static void main(String... args) {
	int arr[] = new int[10];
	Random r = new Random();
	//input in array
	for(int i = 0; i < arr.length; i++) {
		arr[i] = r.nextInt(10);
	}
	//System.out.println("Before Sorting " + Arrays.toString(arr));
	long startTime = System.nanoTime();
	//Bubble Sort
	for(int i = 0; i< arr.length-1; i++){
        for(int j = 0; j< arr.length-i-1; j++){
            //swap
           if(arr[j]> arr[j+1]){
                 int temp = arr[j];
                 arr[j] = arr[j+1];
                 arr[j+1] = temp;
            } 
        }		         
     }
	 long endTime = System.nanoTime();
	 long duration = endTime - startTime;
	 System.out.println("Execution Time: " + duration + " nanoSeconds");
	// System.out.println("After Sorting " + Arrays.toString(arr));
}
}
