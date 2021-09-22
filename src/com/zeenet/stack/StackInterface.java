package com.zeenet.stack;

public interface StackInterface<X> {

	public void push(X item);

	public X pop();

	public boolean containsItem(X item);

	public X access(X item);

	public int size();

}
