package com.zeenet.insertionsort;

import java.util.Arrays;

public class InsertionSort {

	public static void main(String[] args) {

		int[] order = { 5, 3, 4, 7, 0, 1, 8, 2, 6, 9 };

		int[] sortedOrder = insertionSortProcess(order);

		System.out.println(Arrays.toString(sortedOrder));

	}

	private static int[] insertionSortProcess(int[] order) {

		for (int i = 1; i < order.length; i++) {
			int j = i - 1;
			while (j >= 0 && order[i] < order[j]) {

				int temp = order[i];
				order[i] = order[j];
				order[j] = temp;
				j--;
				i--;

			}
		}

		return order;
	}

}
