package com.zeenet.synchronize;

public class ThreadTwo extends Thread {

//	Table t;

//	ThreadTwo(Table t) {
//		this.t = t;
//	}

//	@Override
//	public void run() {
//		t.printTable(10);
//	}
	
	@Override
	public void run() {
		Table.printTable(10);
	}

}
