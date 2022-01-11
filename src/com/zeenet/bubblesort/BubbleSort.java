package com.zeenet.bubblesort;

import java.util.Arrays;

public class BubbleSort {

	public static void main(String[] args) {

		int[] order = { 16, 14, 5, 6, 8, 1};

		int[] sortedorder = bubbleSort(order);

		System.out.println(Arrays.toString(sortedorder));

	}

	private static int[] bubbleSort(int[] order) {

		int size = order.length;

		for (int i = 0; i < size - 1; i++) {
			int flag = 0;
			for (int j = 0; j < size - 1 - i; j++) {

				if (order[j] > order[j + 1]) {
					int temp = order[j + 1];
					order[j + 1] = order[j];
					order[j] = temp;
					flag = 1;

				}

			}
			if (flag == 0) {
				break;
			}
		}

		return order;
	}

}
