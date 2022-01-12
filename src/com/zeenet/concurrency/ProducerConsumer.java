package com.zeenet.concurrency;

public class ProducerConsumer {

	private static int[] buffer;
	private static int count;

	private static Object key = new Object();

	static class Producer {

		void produce() {
			synchronized (key) {
				if (isFull(buffer)) {
					try {
						key.wait();
					} catch (InterruptedException e) {
						e.printStackTrace();
					}
				}
				buffer[count++] = 1;
				key.notify();
			}

		}

	}

	static class Consumer {
		void consumer() {
			synchronized (key) {
				if (isEmpty()) {
					try {
						key.wait();
					} catch (InterruptedException e) {
						e.printStackTrace();
					}

				}
				buffer[--count] = 0;
				key.notify();
			}
		}
	}

	static boolean isEmpty() {
		return count == 0;
	}

	static boolean isFull(int[] buffer) {
		return count == buffer.length;
	}

	public static void main(String[] args) throws InterruptedException {
		buffer = new int[10];
		count = 0;

		Producer producer = new Producer();
		Consumer consumer = new Consumer();

		Runnable producerTask = () -> {
			for (int i = 0; i < 50; i++) {
				producer.produce();
			}
			System.out.println("Done produced !!!");
		};

		Runnable consumerTask = () -> {
			for (int i = 0; i < 50; i++) {
				consumer.consumer();
			}
			System.out.println("Done consumed !!!");
		};

		Thread consumerThread = new Thread(consumerTask);
		Thread producerThread = new Thread(producerTask);

		consumerThread.start();
		producerThread.start();

		consumerThread.join();
		producerThread.join();

		System.out.println("Data read : " + count);

	}

}
