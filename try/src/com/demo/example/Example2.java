package com.demo.example;

import java.util.Comparator;
import java.util.SortedMap;
import java.util.TreeMap;

public class Example2 {

	public static void main(String[] args) {
		/*
		 * SortedMap<Integer, String> mapHttpStatus = new TreeMap<>(new
		 * Example2ReverseComparator());
		 */
		SortedMap<Integer, String> mapHttpStatus = new TreeMap<>();
		mapHttpStatus.put(100, "Continue");
		mapHttpStatus.put(200, "OK");
		mapHttpStatus.put(300, "Multiple Choices");

		mapHttpStatus.put(400, "Bad Request");
		mapHttpStatus.put(401, "Unauthorized");
		mapHttpStatus.put(402, "Payment Required");
		mapHttpStatus.put(403, "Forbidden");
		mapHttpStatus.put(404, "Not Found");

		mapHttpStatus.put(500, "Internal Server Error");
		mapHttpStatus.put(501, "Not Implemented");
		mapHttpStatus.put(502, "Bad Gateway");

		System.out.println("All key-value pairs: ");
		for (Integer code : mapHttpStatus.keySet()) {
			System.out.println(code + " - > " + mapHttpStatus.get(code));
		}

		System.out.println();

		Integer firstKey = mapHttpStatus.firstKey();
		String firstValue = mapHttpStatus.get(firstKey);
		System.out.println("first key is : " + firstKey + " and value is : " + firstValue);
		System.out.println();

		Integer lastKey = mapHttpStatus.lastKey();
		String lastValue = mapHttpStatus.get(lastKey);
		System.out.println("last key is : " + lastKey + " and value is : " + lastValue);
		System.out.println();

		System.out.println("range view operation given by sorted map ");
		SortedMap<Integer, String> mapRange = mapHttpStatus.subMap(300, 501);
		for (Integer code : mapRange.keySet()) {
			System.out.println(code + " - > " + mapRange.get(code));
		}
		System.out.println();
		System.out.println("head map reutrns keys which are less than provided key");
		SortedMap<Integer, String> mapHead = mapHttpStatus.headMap(404);
		for (Integer code : mapHead.keySet()) {
			System.out.println(code + " - > " + mapHead.get(code));
		}
		System.out.println();
		System.out.println("tail map returns key whose key is greater than or equal to provided key");
		SortedMap<Integer, String> mapTail = mapHttpStatus.tailMap(404);
		for (Integer code : mapTail.keySet()) {
			System.out.println(code + " - > " + mapTail.get(code));
		}
		System.out.println();
		Comparator comparator = mapHttpStatus.comparator();
		System.out.println("sorted map uses natural ordering ? " + (comparator == null));

	}
}
