package com.zeenet.singleton;

public class EagerlyLoadedSingleton {

	private static EagerlyLoadedSingleton instance = new EagerlyLoadedSingleton();

	private EagerlyLoadedSingleton() {

	}

	public static EagerlyLoadedSingleton getInstance() {
		return instance;
	}

}
