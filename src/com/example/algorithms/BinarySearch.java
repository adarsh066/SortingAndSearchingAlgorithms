package com.example.algorithms;

public class BinarySearch {
	public static int binarySearchIterative(int[] arr, int x) {
		int left = 0, right = arr.length - 1;
		while (left <= right) {
			int mid = left + (right - left) / 2;
			if (arr[mid] == x)
				return mid;
			if (arr[mid] < x)
				left = mid + 1;
			else
				right = mid - 1;
		}
		return -1;
	}

	public static int binarySearchRecursive(int[] arr, int left, int right, int x) {
		if (right >= left) {
			int mid = left + (right - left) / 2;
			if (arr[mid] == x)
				return mid;
			if (arr[mid] > x)
				return binarySearchRecursive(arr, left, mid - 1, x);
			return binarySearchRecursive(arr, mid + 1, right, x);
		}
		return -1;
	}
}
