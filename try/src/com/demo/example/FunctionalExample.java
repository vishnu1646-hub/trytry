package com.demo.example;

public interface FunctionalExample {
	
	void multiplyFun(int i);
	
	default void printSome() {
		System.out.println("hello!!!");
	}

}
