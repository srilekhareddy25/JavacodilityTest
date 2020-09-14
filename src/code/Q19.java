package code;

import java.util.Arrays;

//What is stable algorithm? write an algorithm for quicksort.
//sort the fallowing using quicksort. is quick sort is stable algorithm. 
//if not give reason. 50 70 10 40 50
//A sorting algorithm is said to be stable if it maintains the relative order of records 
//in the case of equality of keys. QuickSort is an unstable algorithm 
//because we do swapping of elements according to pivot's position
//(without considering their original positions).

public class Q19 {

	public static void main(String[] args) {
		
			int[] unsorted = {50, 70, 10 ,40, 50}; 
			System.out.println("Unsorted array :" + Arrays.toString(unsorted)); 
			QuickSort algorithm = new QuickSort(); 
			// sorting integer array using quicksort algorithm 
			algorithm.sort(unsorted); 
			// printing sorted array 
			System.out.println("Sorted array :" + Arrays.toString(unsorted)); 
			
		}

	}

class QuickSort { 
	private int input[]; 
	private int length; 
	public void sort(int[] numbers) { 
		if (numbers == null || numbers.length == 0) { 
			return; 
			} 
		this.input = numbers; 
		length = numbers.length; 
		quickSort(0, length - 1); 
		} 
	private void quickSort(int low, int high) { 
		int i = low; 
		int j = high; // pivot is middle index 
		int pivot = input[low + (high - low) / 2];
		
		while (i <= j) {
			while (input[i] < pivot) {
				i++; 
				} 
			while (input[j] > pivot) { 
				j--; 
				} 
			if (i <= j) { 
				swap(i, j); 
				// move index to next position on both sides
				i++; 
				j--; 
				} } 
		// calls quickSort() method recursively 
		if (low < j) { 
			quickSort(low, j); 
			} 
		if (i < high) { 
			quickSort(i, high);
			} } 
	private void swap(int i, int j) { 
		int temp = input[i]; 
		input[i] = input[j]; 
		input[j] = temp; 
		} 
	}



