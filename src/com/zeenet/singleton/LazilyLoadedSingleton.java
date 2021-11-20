package com.zeenet.singleton;

public class LazilyLoadedSingleton {

	private static LazilyLoadedSingleton instance = null;

	private LazilyLoadedSingleton() {

	}

	public static LazilyLoadedSingleton getInstance() {
		if (instance == null) {
			instance = new LazilyLoadedSingleton();
		}
		return instance;
	}

}
