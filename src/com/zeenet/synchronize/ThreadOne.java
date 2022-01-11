package com.zeenet.synchronize;

public class ThreadOne extends Thread {

//	Table t;

//	ThreadOne(Table t) {
//		this.t = t;
//	}

//	@Override
//	public void run() {
//		t.printTable(1);
//	}
	
	@Override
	public void run() {
		Table.printTable(1);
	}

}
