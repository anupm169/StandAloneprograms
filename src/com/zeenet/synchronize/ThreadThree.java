package com.zeenet.synchronize;

public class ThreadThree extends Thread {
	
//	Table t;
//
//	ThreadThree(Table t) {
//		this.t = t;
//	}

//	@Override
//	public void run() {
//		t.printTable(100);
//	}
	
	@Override
	public void run() {
		Table.printTable(100);
	}

}
