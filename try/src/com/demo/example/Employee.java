package com.demo.example;

import java.util.Date;

public class Employee implements Comparable<Employee> {

	String firstName;
	String lastName;
	Date joinDate;

	public Employee(String firstName, String lastName) {
		this.firstName = firstName;
		this.lastName = lastName;
	}

	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	public Date getJoinDate() {
		return joinDate;
	}

	public void setJoinDate(Date joinDate) {
		this.joinDate = joinDate;
	}

	public String toString() {
		return firstName + " " + lastName;
	}

	@Override
	public int compareTo(Employee employee) {
		int compareValue = this.firstName.compareTo(employee.firstName);
		if (compareValue == 0) {
			return this.lastName.compareTo(employee.lastName);
		}
		return compareValue;
	}

}
