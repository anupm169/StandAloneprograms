package com.zeenet.stack;

import java.util.Arrays;

public class StockSpanProblem {

	public static void main(String[] args) {

		 int[] price = { 70, 80, 100, 70, 90, 75, 85 };

//		int[] price = { 100, 80, 60, 70, 60, 75, 85 };

		int[] span = new int[price.length];

		StackInterface<Integer> stack = new BasicStack<Integer>();

		stack.push(0); // first element of the price
		span[0] = 1; // first element by default will be having 1 because its a reference to itself

		for (int i = 1; i < price.length; i++) {

			while (stack.size() > 0 && 
					price[stack.top()] <= price[i]) {
				stack.pop();
			}
			if (stack.size() == 0) {
				span[i] = i + 1;
				stack.push(i);
			} else {
				span[i] = i - stack.top();
				stack.push(i);
			}

		}

		System.out.println(Arrays.toString(span));

	}

}
