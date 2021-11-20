package com.zeenet.singleton;

import java.util.function.Consumer;
import java.util.function.IntConsumer;

public class SingletonMainClass {

	public static void main(String[] args) {

		IntConsumer consumer = integer -> System.out.println("Hashcode : " + integer);

		Consumer<String> printString = System.out::println;

		printString.accept("Eagerly loaded Singleton Examples");

		EagerlyLoadedSingleton instance = EagerlyLoadedSingleton.getInstance();
		consumer.accept(instance.hashCode());

		EagerlyLoadedSingleton instance2 = EagerlyLoadedSingleton.getInstance();
		consumer.accept(instance2.hashCode());

		printString.accept("=============================");

		printString.accept("Lazily loaded Singleton Examples");

		LazilyLoadedSingleton lazyInstance = LazilyLoadedSingleton.getInstance();
		consumer.accept(lazyInstance.hashCode());

		LazilyLoadedSingleton lazyInstance1 = LazilyLoadedSingleton.getInstance();
		consumer.accept(lazyInstance1.hashCode());

		printString.accept("=============================");
	}

}
