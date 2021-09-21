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
		
		System.out.println("============Stack using List Interface =============");

		ListStack<Integer> listStack = new ListStack<>();

		listStack.push(1);
		listStack.push(2);
		listStack.push(3);
		listStack.push(4);
		listStack.push(5);

		System.out.println(listStack);

		System.out.println("the deleted item in stack is : " + listStack.pop());
		System.out.println("the deleted item in stack is : " + listStack.pop());
		System.out.println("the deleted item in stack is : " + listStack.pop());
		System.out.println("the deleted item in stack is : " + listStack.pop());

		System.out.println("Is item 2 present : " + listStack.containsitem(2));

		System.out.println("trying to access the item : " + listStack.access(1));
		
		System.out.println(listStack);

	}

}
