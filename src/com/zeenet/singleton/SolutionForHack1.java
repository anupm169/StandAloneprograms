package com.zeenet.singleton;

public class SolutionForHack1 {

	private static SolutionForHack1 instance = null;

	private SolutionForHack1() {

		if (instance != null) {
			throw new RuntimeException("use getInstance method to create a new instance");
		}

//		System.setSecurityManager(new SecurityManager()); Deprecated method

	}

	public static SolutionForHack1 getInstance() {
		if (instance == null) {
			instance = new SolutionForHack1();
		}
		return instance;
	}

}
