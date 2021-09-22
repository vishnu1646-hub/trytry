package com.demo.example;

import java.io.BufferedReader;
import java.io.FileReader;

public class ReadCSVSplit {

	public static void main(String[] args) throws Exception {
		String line = "";
		String splitBy = ",";
		BufferedReader bufferedReader = new BufferedReader(new FileReader("D://csvfiles/csvdemo.csv"));
		while ((line = bufferedReader.readLine()) != null) {
			String[] values = line.split(splitBy);
			System.out.println(values[0] + " : " + values[1] + " : " + values[2]);
		}
		bufferedReader.close();
	}

}
