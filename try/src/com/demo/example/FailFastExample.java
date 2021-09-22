package com.demo.example;

import java.util.ArrayList;
import java.util.List;
import java.util.ListIterator;

public class FailFastExample {

	private List<Integer> list = new ArrayList<>();

	public FailFastExample() {
		for (int i = 0; i < 10000; i++) {
			list.add(i);
		}
	}

	public void runUpdationThread() {

		Thread thread1 = new Thread(new Runnable() {

			@Override
			public void run() {
				for (int i = 10000; i < 20000; i++) {
					list.add(i);
				}

			}
		});
		thread1.start();
	}

	public void runIterationThread() {

		Thread thread2 = new Thread(new Runnable() {

			@Override
			public void run() {
				ListIterator<Integer> iterator = list.listIterator();
				while (iterator.hasNext()) {
					Integer number = iterator.next();
					System.out.println(number);
				}

			}
		});
		thread2.start();

	}

	public static void main(String[] args) {
		FailFastExample failFastExample = new FailFastExample();
		failFastExample.runIterationThread();
		failFastExample.runUpdationThread();
	}
}
