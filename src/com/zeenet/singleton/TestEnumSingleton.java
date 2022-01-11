package com.zeenet.singleton;

import java.util.function.IntConsumer;

public class TestEnumSingleton {

	public static void main(String[] args) {
		
		IntConsumer consumer = integer -> System.out.println("HashCode : "+ integer);
		
		EnumSingleton instance = EnumSingleton.INSTANCE;
		
		consumer.accept(instance.hashCode());
		
		EnumSingleton newInstance = EnumSingleton.INSTANCE;
		
		consumer.accept(newInstance.hashCode());

	}

}
