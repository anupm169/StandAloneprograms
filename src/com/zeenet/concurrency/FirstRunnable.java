package com.zeenet.concurrency;

public class FirstRunnable {

	public static void main(String[] args) {

		Runnable runnable = () -> {
			System.out.println("I am running this thread : " + Thread.currentThread().getName());
		};

		Thread t1 = new Thread(runnable);
		t1.setName("My Thread");
		 t1.start(); // creates and runs in a new thread. Output : I am running this thread : My Thread
//		 t1.run(); // runs in the main() thread.  Output : I am running this thread : main

	}

}
