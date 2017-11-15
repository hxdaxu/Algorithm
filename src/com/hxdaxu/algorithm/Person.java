package com.hxdaxu.algorithm;

public class Person {
	
	private static CallBack callback;

	public static void main(String[] args) {
		
		callback = new CallBack() {};

		System.out.println(callback.getClass().isMemberClass());
	}

	
	interface CallBack{}
}
