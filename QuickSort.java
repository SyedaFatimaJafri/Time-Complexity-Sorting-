package Test;

import java.util.Random;

public class QuickSort {
    public static void quickSort(int arr[],int low , int high) {
    	if(low < high) {
    		int pi = partition(arr,low, high);
    		
    		quickSort(arr, low, pi - 1);
    		quickSort(arr, pi + 1, high);
    	}
    }
    public static int partition(int[] arr, int low, int high) {
    	int pivot = arr[high];
    	int i = low-1;
    	
    	for(int j = low ; j < high; j++) {
    		if(arr[j] < pivot) {
    			i++;
    			//swap
    			int temp = arr[i];
    			arr[i] = arr[j];
    			arr[j] = temp;
    		}
    	}
    	//swap with pivot
    	i++;
    	int temp = arr[i];
    	arr[i] = arr[high];
    	arr[high] = temp;
    	return i;
    }
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
		//Quick Sort
		int n = arr.length;
		quickSort(arr, 0, n-1);
		long endTime = System.nanoTime();
		 long duration = endTime - startTime;
		 System.out.println("Execution Time: " + duration + " nanoSeconds");
	}

}
