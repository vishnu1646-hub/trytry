package com.demo.example;

import java.util.ArrayList;
import java.util.List;
import java.util.Vector;

public class Demo {

	public void testVector() {

		long startTime = System.currentTimeMillis();
		Vector<Integer> vector = new Vector<>();
		for (int i = 1; i < 100000; i++) {
			vector.addElement(i);
		}
		long endTime = System.currentTimeMillis();
		long totalTime = endTime - startTime;
		System.out.println("vector time is : " + totalTime + " ms");
	}

	public void testArrayList() {
		long startTime = System.currentTimeMillis();
		List<Integer> list = new ArrayList<>();
		for (int i = 1; i < 100000; i++) {
			list.add(i);
		}
		long endTime = System.currentTimeMillis();
		long totalTime = endTime - startTime;
		System.out.println("array list time is : " + totalTime + " ms");
	}

	public static void main(String[] args) {
		Demo demo = new Demo();
		demo.testVector();
		demo.testArrayList();
	}
}
