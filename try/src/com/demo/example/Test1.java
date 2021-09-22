package com.demo.example;

public class Test1 {

	public static void main(String[] args) {
		new Thread(() -> {
			System.out.println("new thread is created");
		}).start();
	}

}
