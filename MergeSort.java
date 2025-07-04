package sorting;

import java.util.Random;

public class MergeSort {

	public static void divide(int arr[],int si, int ei) {
		if(si >= ei) {
			return;
		}
		int mid = si + (ei - si)/ 2;
		divide(arr, si, mid);
		divide(arr, mid+1, ei);
		conquer(arr, si, mid , ei);
	}
	
	public static void conquer(int arr[],int si, int mid, int ei) {
		int merged[] = new int[ei-si +1];
		int idx1 = si;
		int idx2 = mid +1;
		int x = 0;
		while(idx1 <= mid && idx2 <= ei) {
			if(arr[idx1] <= arr[idx2]) {
				merged[x++] = arr[idx1++];
			}else {
				merged[x++] = arr[idx2++];
			}
		}
		while(idx1 <= mid) {
			merged[x++] = arr[idx1++];
		}
		while(idx2 <= ei) {
			merged[x++] = arr[idx2++];
		}
		for(int i = 0, j =si; i < merged.length; i++ , j++) {
			arr[j] = merged[i];
		}
		
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int arr[] = new int[1000000];
		Random r = new Random();
		//input in array
		for(int i = 0; i < arr.length; i++) {
			arr[i] = r.nextInt(1000000);
		}
		//System.out.println("Before Sorting " + Arrays.toString(arr));
		long startTime = System.nanoTime();
		//Merge Sort
		int n = arr.length;
		divide(arr, 0, n-1);
		 long endTime = System.nanoTime();
		 long duration = endTime - startTime;
		 System.out.println("Execution Time: " + duration + " nanoSeconds");
	}

}
