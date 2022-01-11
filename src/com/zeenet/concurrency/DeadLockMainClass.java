package com.zeenet.concurrency;

public class DeadLockMainClass {

	public static void main(String[] args) throws InterruptedException {

		DeadLock dl = new DeadLock();
		Runnable run1 = dl::a;
		Runnable run2 = dl::b;

		Thread t1 = new Thread(run1);
		t1.start();

		Thread t2 = new Thread(run2);
		t2.start();

		t1.join();
		t2.join();

	}

}
