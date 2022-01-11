package com.zeenet.synchronize;

public class WithSynchronizedMethodExample {

	public static void main(String[] args) {

//		Table table = new Table();
//		ThreadOne t1 = new ThreadOne(table);
//		ThreadTwo t2 = new ThreadTwo(table);
//		ThreadThree t3 = new ThreadThree(table);
//		ThreadFour t4 = new ThreadFour(table);
		
		ThreadOne t1 = new ThreadOne();
		ThreadTwo t2 = new ThreadTwo();
		ThreadThree t3 = new ThreadThree();
		ThreadFour t4 = new ThreadFour();
		
		t1.start();
		t2.start();
		t3.start();
		t4.start();

	}

}
