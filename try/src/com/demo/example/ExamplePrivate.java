package com.demo.example;

public interface ExamplePrivate {

	default void display() {
		show();
	}

	private void show() {
		System.out.println("you are amazing");
	}
}
