package com.demo.example;

public class Test {

	public static void main(String[] args) {
		new Thread(new Runnable() {
			
			@Override
			public void run() {
				System.out.println("thread is running");
				
			}
		}).start();
	}
	
}
