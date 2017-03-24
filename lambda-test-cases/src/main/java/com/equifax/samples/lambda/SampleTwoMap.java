package com.equifax.samples.lambda;

import com.equifax.samples.types.Customer;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

/**
 * Hello world!
 */
public class SampleTwoMap {
    public static void main(String[] args) {
        List<Customer> customers = Arrays.asList(new Customer("john", 22, 30000), new Customer("mary", 32, 60000), new Customer("tim", 25, 20000));

        // this is the non lambda-version
        List<String> resultNames = new ArrayList<>();

        // we are getting the name of each customer and saving into resultNames
        for (Customer customer : customers) {
            resultNames.add(customer.getName());
        }

        for (String temp : resultNames) {
            System.out.println(temp);
        }

        // now how might we do this with lambda expression?
        // Uncomment the following lines and fill in the call to map below
        //
        // Hint : it will be of the form x -> ???
        // List<String> lambdaResult = customers.stream()
        //        .map(what goes in here???)
        //        .collect(Collectors.toList());
        //
        //    lambdaResult.forEach(System.out::println);

    }

}
