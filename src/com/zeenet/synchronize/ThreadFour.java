package com.zeenet.synchronize;

public class ThreadFour extends Thread {
	
//	Table t;

//	ThreadFour(Table t) {
//		this.t = t;
//	}

//	@Override
//	public void run() {
//		t.printTable(1000);
//	}
	
	@Override
	public void run() {
		Table.printTable(1000);
	}

}
