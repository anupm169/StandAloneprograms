package com.zeenet.binarysearch;

public class BinarySearch {

	public static void main(String[] ars) {

		int[] order = { 1, 2, 3, 4, 5, 6 };

		int searchElement = 5;

		int result = search(order, searchElement, 0, order.length);

		System.out.println("the element was found in index : " + result);

	}

	private static int search(int[] order, int searchElement, int lowerBound, int upperBound) {

		int pivot = (lowerBound + upperBound) / 2;

		if (order[pivot] == searchElement) {
			return pivot;
		} else if (searchElement < order[pivot]) {
			return search(order, searchElement, 0, pivot);
		} else {
			return search(order, searchElement, pivot + 1, upperBound);
		}

	}

}
