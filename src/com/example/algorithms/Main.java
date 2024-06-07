package com.example.algorithms;

public class Main {
	public static void main(String[] args) {
		int[] array = { 64, 25, 12, 22, 11 };

		// Bubble Sort
		BubbleSort.bubbleSort(array);
		System.out.println("Sorted array using Bubble Sort:");
		printArray(array);

		// Merge Sort
		int[] mergeSortArray = { 64, 25, 12, 22, 11 };
		MergeSort.mergeSort(mergeSortArray, 0, mergeSortArray.length - 1);
		System.out.println("Sorted array using Merge Sort:");
		printArray(mergeSortArray);

		// Quick Sort
		int[] quickSortArray = { 64, 25, 12, 22, 11 };
		QuickSort.quickSort(quickSortArray, 0, quickSortArray.length - 1);
		System.out.println("Sorted array using Quick Sort:");
		printArray(quickSortArray);

		// Heap Sort
		int[] heapSortArray = { 64, 25, 12, 22, 11 };
		HeapSort.heapSort(heapSortArray);
		System.out.println("Sorted array using Heap Sort:");
		printArray(heapSortArray);

		// Linear Search
		int searchElement = 22;
		int index = LinearSearch.linearSearch(array, searchElement);
		System.out.println("Element " + searchElement + " found at index: " + index);

		// Binary Search (Iterative)
		int[] sortedArray = { 11, 12, 22, 25, 64 };
		int binarySearchElement = 22;
		int binarySearchIndex = BinarySearch.binarySearchIterative(sortedArray, binarySearchElement);
		System.out.println("Element " + binarySearchElement + " found at index (Iterative): " + binarySearchIndex);

		// Binary Search (Recursive)
		binarySearchIndex = BinarySearch.binarySearchRecursive(sortedArray, 0, sortedArray.length - 1,
				binarySearchElement);
		System.out.println("Element " + binarySearchElement + " found at index (Recursive): " + binarySearchIndex);
	}

	public static void printArray(int[] arr) {
		for (int element : arr) {
			System.out.print(element + " ");
		}
		System.out.println();
	}
}
