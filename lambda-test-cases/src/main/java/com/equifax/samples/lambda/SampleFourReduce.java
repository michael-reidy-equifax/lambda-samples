package com.equifax.samples.lambda;

import java.util.Arrays;
import java.util.List;

/**
 * Hello world!
 */
public class SampleFourReduce    {
    public static void main(String[] args) {
        List<Integer> listOfNumbers = Arrays.asList(101, 202, 303, 404);

        int totalVal = listOfNumbers.stream().reduce(0, (a, b) -> a + b);
        System.out.println("Total val is ==>" + totalVal);
        int highestVal =  listOfNumbers.stream().reduce(0, (a, b) -> a >= b ? a : b);
        System.out.println("Highest val is ==>" + highestVal);
        int lowestVal =  listOfNumbers.stream().reduce(Integer.MAX_VALUE, (a, b) -> a <= b ? a : b);
        System.out.println("Lowest val is ==>" + lowestVal);

        // Ok now I want you to add 10 to each of the numbers and then add them all up
        // Hint : use a map call followed by a reduce call
    }
}
