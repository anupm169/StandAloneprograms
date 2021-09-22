package com.zeenet.stack;

public class BasicStack<X> implements StackInterface<X>{

	private X[] data;

	private int stackPointer;

	@SuppressWarnings("unchecked")
	public BasicStack() {
		data = (X[]) new Object[1000];
		stackPointer = 0;
	}

	public void push(X item) {
		data[stackPointer++] = item;
	}

	public X pop() {
		if (stackPointer == 0) {
			throw new IllegalStateException("The Stack is Empty");
		}

		return data[--stackPointer];
	}

	public int size() {
		return stackPointer;
	}

	public boolean containsItem(X item) {

		for (int i = 0; i < size(); i++) {
			if (data[i].equals(item)) {
				return true;
			}
		}
		return false;
	}

	public X access(X item) {

		X stackItem = null;
		while (stackPointer > -1) {
			stackItem = pop();
			if (stackItem.equals(item)) {
				return stackItem;
			}
		}
		throw new IllegalStateException("Specified elements could not be found");

	}

}
