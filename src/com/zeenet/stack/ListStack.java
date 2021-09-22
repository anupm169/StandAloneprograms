package com.zeenet.stack;

import java.util.ArrayList;
import java.util.List;

public class ListStack<X> implements StackInterface<X>{

	List<X> list;

	public ListStack() {
		list = new ArrayList<X>();
	}

	public void push(X item) {
		list.add(item);
	}

	public X pop() {

		if (list.size() == 0) {
			throw new IllegalStateException("the stack is empty");
		}

		X item = list.get(list.size() - 1);
		list.remove(list.size() - 1);
		return item;
	}

	public boolean containsItem(X item) {
		boolean found = false;

		for (int i = 0; i < list.size(); i++) {
			if (item.equals(list.get(i))) {
				found = true;
			}
		}
		return found;

	}

	public X access(X item) {
		X result = null;

		while (list.size() > -1) {
			result = pop();
			if (result.equals(item)) {
				return result;
			}
		}

		throw new IllegalStateException("the request element was not found");
	}

	public String toString() {
		return list.toString();
	}

	public int size() {
		return list.size();
	}

}
