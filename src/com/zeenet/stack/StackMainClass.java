package com.zeenet.stack;

public class StackMainClass {

	public static void main(String[] args) {

		BasicStack<Integer> stack = new BasicStack<>();

		stack.push(1);
		stack.push(2);
		stack.push(3);
		stack.push(4);
		stack.push(5);

		System.out.println("the deleted item in stack is : " + stack.pop());
		System.out.println("the deleted item in stack is : " + stack.pop());
		System.out.println("the deleted item in stack is : " + stack.pop());
		System.out.println("the deleted item in stack is : " + stack.pop());

		System.out.println("Is item 2 present : " + stack.contains(2));

		System.out.println("trying to access the item : " + stack.access(1));

	}

}
