package bubble;

import java.util.*;

public class BubbleSort {
	
	
	public static void main(String[] args) {
		int arr[] = new int[20];
		Random rand = new Random(47);
		for (int i = 0; i < 20; i++)
			arr[i] = rand.nextInt(100);
		
		System.out.println("unsort:");
		for (int x : arr)
			System.out.println(x);
		
//		bubbleSort(arr);
//		selectSort(arr);
//		insertSort(arr);
		shellSort(arr);
	}
	
	public static void bubbleSort(int[] arr) {
		
		for (int i = 0; i < 20; i++) 	{
			for (int j = i + 1; j < 20; j++) {
				if (arr[i] > arr[j]) {
					int temp = arr[i];
					arr[i] = arr[j];
					arr[j] =temp;
				}
			}
		}
		System.out.println("bubble sorted: ");
		for (int x : arr)
			System.out.println(x);
	}
	
	public static void selectSort(int[] arr) {
		int min = 0;
		int temp;
		for (int i = 0; i < arr.length; i++) {
			min = i;
			
			for (int j = i + 1; j < arr.length; j++) {
				if (arr[min] > arr[j])
					min = j;
			}
			
			if (min != i) {
				temp = arr[min];
				arr[min] = arr[i];
				arr[i] = temp;
			}				
		}
		System.out.println("select sorted: ");
		for (int x : arr)
			System.out.println(x);
	}
	
	public static void insertSort(int arr[]) {

		for (int i = 1; i < arr.length; i++) {
			int current = arr[i];
			int pos = i;
			
			for (int j = i - 1; j >= 0; j--) {
				if (arr[j] > current) {
					arr[j + 1] = arr[j];
					pos -= 1;
				} else {
					break;
				}
			}
			arr[pos] = current;
		}
		
		System.out.println("insert sorted: ");
		for (int x : arr)
			System.out.println(x);		
	}
	
	public static void shellSort(int arr[]) {
		int gap, temp;
		
		for (gap = arr.length / 2; gap > 0; gap /= 2) {
			for (int i = gap; i < arr.length; i++) {
				for (int j = i - gap; j >= 0; j-= gap) {
					if (arr[j] > arr[j + gap]) {
						temp = arr[j];
						arr[j] = arr[j + gap];
						arr[j + gap] = temp;
					}
				}
			}
		}
		System.out.println("shell sorted: ");
		for (int x : arr)
			System.out.println(x);
	}
	

	
}
