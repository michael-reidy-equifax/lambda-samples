package com.equifax.samples.types;

/**
 * Created by mxr214 on 24/03/2017.
 */
public class Customer {
	private String name;
	private int age;
	private int income;

	public Customer(String name, int age, int income) {
		this.name = name;
		this.age = age;
		this.income = income;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public int getIncome() {
		return income;
	}

	public void setIncome(int income) {
		this.income = income;
	}
}
