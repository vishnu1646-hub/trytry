package com.demo.example;

public class MethodReference2 {

	public static void status() {
		System.out.println("thread is running");
	}

	public static void main(String[] args) {

		Thread thread = new Thread(MethodReference2::status);
		thread.start();
		
	}

}
