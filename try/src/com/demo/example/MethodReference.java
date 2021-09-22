package com.demo.example;

public class MethodReference {

	/*
	 * public static void saySomething() {
	 * System.out.println("printing from static method"); }
	 */
	
	public  void saySomething() {
		System.out.println("printing from non static method");
	}

	public static void main(String[] args) {
		MethodReference methodReference = new MethodReference();
		MethodExample method = methodReference::saySomething;
		method.printSomething();
	}
}
