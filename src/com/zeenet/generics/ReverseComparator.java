package com.zeenet.generics;

import java.util.Comparator;

public class ReverseComparator<T> implements Comparator<T> {

	private Comparator<T> delegateComparator;

	ReverseComparator(Comparator<T> delegatedComparator) {
		this.delegateComparator = delegatedComparator;
	}

	@Override
	public int compare(T o1, T o2) {
		return -1 * delegateComparator.compare(o1, o2);
	}

}
