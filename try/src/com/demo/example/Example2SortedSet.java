package com.demo.example;

import java.util.Arrays;
import java.util.SortedSet;
import java.util.TreeSet;

public class Example2SortedSet {

	public static void main(String[] args) {
		SortedSet<Integer> set = new TreeSet<>();
		set.addAll(Arrays.asList(1, 6, 7, 0, 9, 8, 3, 2, 4, 11, -1,1));
		System.out.println(set);
	}

}
