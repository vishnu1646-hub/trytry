package com.demo.example;

import java.io.File;
import java.util.Scanner;

public class ReadCSVScanner {

	public static void main(String[] args) throws Exception {

		Scanner scanner = new Scanner(new File("D://csvfiles/csvdemo.csv"));
		scanner.useDelimiter(",");
		while (scanner.hasNext()) {
			System.out.print(scanner.next());
		}
		scanner.close();
	}
}
