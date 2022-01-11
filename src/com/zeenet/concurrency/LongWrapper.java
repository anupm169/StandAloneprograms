package com.zeenet.concurrency;

public class LongWrapper {

	private long l;
	private Object key = new Object();

	public LongWrapper(long l) {
		this.l = l;
	}

	public long getValue() {
		return l;
	}

// this method leads to race condition.
//	public void increementLong() { 
//		l = l + 1;
//	}

	public void increementLong() {
		synchronized (key) {
			l = l + 1;
		}

	}

}
