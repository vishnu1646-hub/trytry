package com.demo.example;

public class FunctionalImpl {

	public static void main(String[] args) {
		FunctionalExample fun = (int i) -> System.out.println(2 * i);
		fun.multiplyFun(10);
	}

}
