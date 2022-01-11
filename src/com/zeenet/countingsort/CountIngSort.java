package com.zeenet.countingsort;

import java.util.ArrayList;
import java.util.List;

public class CountIngSort {

	public static void main(String[] args) {

		int[] order = { 10, 6, 7, 3, 9, 1, 4 };
		
		int max = getMaxElement(order);

		List<Integer> sortOrder = sortOrder(order, max);

		System.out.println(sortOrder);
		System.out.println(max);

	}

	private static int getMaxElement(int[] order) {
		int max = order[0];
		for (int i =1 ; i< order.length; i++) {
			if (max < order[i]) {
				max = order[i];
			}
		}
		
		return max;
	}

	private static List<Integer> sortOrder(int[] order, int max) {

		List<Integer> result = new ArrayList<>();

		for (int i = 0; i <= max; i++) {
			for (int j = 0; j < order.length; j++) {
				if (i == order[j]) {
					result.add(i);
				}
			}

		}

		return result;
	}

}
