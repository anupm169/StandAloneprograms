package com.zeenet.commons;

import java.util.ArrayList;
import java.util.List;

public class GrabTest {

	public static void main(String[] args) {

		// int[] testElements = { 2, 1, 3, 5, 4 };

		// int[] testElements = { 2, 3, 4, 1, 5 };

		int[] testElements = { 1, 3, 4, 2, 5 };

		List<Integer> result = getShineList(testElements);

		System.out.println(result);

	}

	private static List<Integer> getShineList(int[] testElements) {

		List<Integer> onlist = new ArrayList<>();
		List<Integer> shinningList = new ArrayList<>();
		boolean isShinning = false;
		for (int i = 0; i < testElements.length; i++) {
			onlist.add(testElements[i]);
			for (int j = testElements[i]; j > 0; --j) {
				if (onlist.contains(j)) {
					isShinning = true;
				} else {
					isShinning = false;
					break;
				}
			}
			if (isShinning) {
				shinningList.add(i);
			}
		}
		return shinningList;
	}

}
