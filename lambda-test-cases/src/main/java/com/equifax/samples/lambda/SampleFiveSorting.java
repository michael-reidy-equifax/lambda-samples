package com.equifax.samples.lambda;

import com.equifax.samples.types.Customer;

import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class SampleFiveSorting {
	public static void main(String[] args) {
		List<Customer> customerList = Arrays.asList(new Customer("john", 22, 30000), new Customer("mary", 32, 60000),
				new Customer("tim", 25, 20000));

		System.out.println("Before Sort");
		for (Customer customer : customerList) {
			System.out.println(customer);
		}

		// sort by age
		Collections.sort(customerList, new Comparator<Customer>() {
			@Override
			public int compare(Customer o1, Customer o2) {
				return o1.getAge() - o2.getAge();
			}
		});

		System.out.println("After Sort");
		for (Customer customer : customerList) {
			System.out.println(customer);
		}

		// Now let's sort using a lambda expresion
		System.out.println("Before Sort");
		customerList.forEach((developer) -> System.out.println(developer));

		// put a lambda expression in sort method here!
		// customerList.sort(what goes here?);

		System.out.println("After Sort");

		// java 8 only, lambda also, to print the List
		customerList.forEach((developer) -> System.out.println(developer));

		// is there another way to write the lambda in the forEach above?
	}
}
