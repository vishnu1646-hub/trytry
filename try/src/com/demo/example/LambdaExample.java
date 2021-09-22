package com.demo.example;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.function.Consumer;

public class LambdaExample {

	public static void main(String[] args) {
		ArrayList<Integer> list = new ArrayList<>();
		list.addAll(Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8));
		list.forEach(n -> System.out.println(n));
		System.out.println("only even : ");
		list.forEach(n -> {
			if (n % 2 == 0)
				System.out.println(n);
		});
	}

}
