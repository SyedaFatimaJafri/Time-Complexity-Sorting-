package sorting;

import java.util.Random;

public class SelectionSort {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int arr[] = new int[10];
		Random r = new Random();
		//input in array
		for(int i = 0; i < arr.length; i++) {
			arr[i] = r.nextInt(10);
		}
		//System.out.println("Before Sorting " + Arrays.toString(arr));
		long startTime = System.nanoTime();
		//Selection Sort
		for(int i = 0; i<arr.length-1; i++) {
			int smallest =i;
			for(int j = i+1; j<arr.length; j++) {
				if(arr[smallest]> arr[j]) {
					smallest =j;
				}
			}
			int temp = arr[smallest];
			arr[smallest] = arr[i];
			arr[i] = temp;
			
		}
		 long endTime = System.nanoTime();
		 long duration = endTime - startTime;
		 System.out.println("Execution Time: " + duration + " nanoSeconds");
	}

}
