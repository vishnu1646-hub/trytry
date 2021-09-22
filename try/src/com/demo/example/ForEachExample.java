package com.demo.example;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ForEachExample {

	public static void main(String[] args) {
		List<String> list = new ArrayList<>();
		list.addAll(Arrays.asList("batman", "superman", "spiderman", "ironman", "blackpanther", "blackwidow"));
		list.forEach((n) -> System.out.println(n));
	}

}
