package com.demo.example;

import java.util.ArrayList;
import java.util.Arrays;

public class ReferenceExample {

	public static void main(String[] args) {
		ArrayList<Integer> list = new ArrayList<>();
		list.addAll(Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8));
		list.forEach(System.out::println);
	}
	
}
