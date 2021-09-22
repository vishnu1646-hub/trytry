package com.demo.example;

public class ConstructorReference {

	public static void main(String[] args) {
		StudentFI student = Student::new;
		student.getStudentName("maddy");
	}

}
