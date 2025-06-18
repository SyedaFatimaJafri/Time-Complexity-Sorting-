
package sorting;

import java.util.Random;

public class InsertionSort {
public static void main(String... args) {
	int arr[] = new int[10];
	Random r = new Random();
	//input in array
	for(int i = 0; i < arr.length; i++) {
		arr[i] = r.nextInt(10);
	}
	//System.out.println("Before Sorting " + Arrays.toString(arr));
	long startTime = System.nanoTime();
	//insertion Sort
	for(int i = 1; i<arr.length; i++) {
		int current = arr[i];
		int j = i -1;
		while(j >= 0 && current < arr[j]) {
			arr[j+1] = arr[j];
			j--;
		}
		// Placement
		arr[j+1] = current;
	}
	 long endTime = System.nanoTime();
	 long duration = endTime - startTime;
	 System.out.println("Execution Time: " + duration + " nanoSeconds");
}
}
