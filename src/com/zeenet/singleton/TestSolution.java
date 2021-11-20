package com.zeenet.singleton;

import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;
import java.util.function.IntConsumer;

public class TestSolution {

	public static void main(String[] args) {
		SolutionForHack1 instance = SolutionForHack1.getInstance();

		IntConsumer consumer = integer -> System.out.println("Hashcode : " + integer);

		consumer.accept(instance.hashCode());

		try {
			Constructor<?>[] constructors = SolutionForHack1.class.getDeclaredConstructors();
			Constructor<?> theConstructor = constructors[0];
			theConstructor.setAccessible(true);
			SolutionForHack1 newInstance = (SolutionForHack1) theConstructor.newInstance();
			consumer.accept(newInstance.hashCode());
		} catch (InstantiationException | IllegalAccessException | IllegalArgumentException
				| InvocationTargetException e) {

			e.printStackTrace();
		}

	}

}
