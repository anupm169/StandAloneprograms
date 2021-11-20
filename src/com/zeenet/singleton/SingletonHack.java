package com.zeenet.singleton;

import java.lang.reflect.Constructor;
import java.util.function.IntConsumer;

public class SingletonHack {

	public static void main(String[] args) {

		IntConsumer consumer = integer -> System.out.println("Hashcode : " + integer);

		LazilyLoadedSingleton instance = LazilyLoadedSingleton.getInstance();

		consumer.accept(instance.hashCode());

		try {
			Constructor<?>[] constructors = LazilyLoadedSingleton.class.getDeclaredConstructors();
			Constructor<?> theConstructor = constructors[0];
			theConstructor.setAccessible(true);
			LazilyLoadedSingleton newInstance = (LazilyLoadedSingleton) theConstructor.newInstance();
			consumer.accept(newInstance.hashCode());
		} catch (Exception e) {
			e.printStackTrace();
		}

	}

}
