package com.zeenet.quicksort;

import java.util.Arrays;

public class QuickSort {

	public static void main(String[] args) {

		int[] order = { 5, 3, 4, 7, 0, 1, 8, 2, 6, 9 };

		int[] sortedOrder = quickSortProcess(order, 0, order.length - 1);

		System.out.println(Arrays.toString(sortedOrder));

	}

	private static int[] quickSortProcess(int[] order, int lowerBound, int upperBound) {

		if (lowerBound < upperBound) {
			int loc = partitions(order, lowerBound, upperBound);
			quickSortProcess(order, lowerBound, loc - 1);
			quickSortProcess(order, loc + 1, upperBound);
		}
		return order;
	}

	static int partitions(int[] order, int lowerBound, int upperBound) {

		int pivot = order[lowerBound];
		int start = lowerBound;
		int end = upperBound;

		while (start < end) {

			while (order[start] <= pivot) {
				start++;
			}

			while (order[end] > pivot) {
				end--;
			}

			if (start < end) {
				order = swap(order, start, end);
			} else {
				order = swap(order, lowerBound, end);
			}

		}

		return end;

	}

	private static int[] swap(int[] order, int start, int end) {
		int temp = order[start];
		order[start] = order[end];
		order[end] = temp;
		return order;

	}

}
