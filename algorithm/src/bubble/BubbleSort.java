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
		
		bubbleSort(arr);
		selectSort(arr);
		insertSort(arr);
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
	
}
