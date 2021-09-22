package com.demo.example;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class EmployeeMain {

	public static void main(String[] args) {
		List<Employee> listEmployees = new ArrayList<>();
		Employee employee1 = new Employee("Tom", "Eagar");
		Employee employee2 = new Employee("Tom", "Smith");
		Employee employee3 = new Employee("Bill", "Joy");
		Employee employee4 = new Employee("Bill", "Gates");
		Employee employee5 = new Employee("Alice", "Wooden");
		listEmployees.add(employee1);
		listEmployees.add(employee2);
		listEmployees.add(employee3);
		listEmployees.add(employee4);
		listEmployees.add(employee5);
		System.out.println("Before sorting: " + listEmployees);
		Collections.sort(listEmployees);
		System.out.println("After sorting: " + listEmployees);
	}

}
