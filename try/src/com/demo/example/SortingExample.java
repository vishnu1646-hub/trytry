package com.demo.example;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class SortingExample {

	public static void main(String[] args) {
		List<String> list = Arrays.asList("zack", "sam", "ram", "anu", "vishnu", "radha", "balaji");
		for (String string : list) {
			System.out.println(string);
		}
		System.out.println("after sorting ");
		Collections.sort(list);
		System.out.println(list);
	}
}
