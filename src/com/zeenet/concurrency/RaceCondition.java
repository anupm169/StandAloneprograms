package com.zeenet.concurrency;

public class RaceCondition {

	public static void main(String[] args) throws InterruptedException {

		LongWrapper longWrapper = new LongWrapper(0L);

		Runnable run = () -> {
			for (int i = 0; i < 1000; i++) {
				longWrapper.increementLong();
			}
		};

		Thread[] threads = new Thread[1000];
		for (int i = 0; i < threads.length; i++) {
			threads[i] = new Thread(run);
			threads[i].start();

		}

		for (int i = 0; i < threads.length; i++) {
			threads[i].join();
		}

		System.out.println("the value = " + longWrapper.getValue());

	}

}
