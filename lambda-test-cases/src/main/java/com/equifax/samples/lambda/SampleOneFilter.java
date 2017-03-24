package com.equifax.samples.lambda;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * Hello world!
 */
public class SampleOneFilter {
    public static void main(String[] args) {
        List<String> listOfColours = Arrays.asList("blue", "green", "red", "yellow");

        // this is the non lambda-version
        List<String> result = new ArrayList<>();

        // we are filtering out "green"
        for (String line : listOfColours) {
            if (!"green".equals(line)) {
                result.add(line);
            }
        }

        /// now print out result
        for (String temp : result) {
            System.out.println(temp);
        }

        // now how might we do this with lambda expression?

        // Uncomment the following lines and fill in the call to filter below
        //
        // Hint : it will be of the form x -> ???
        //
        //    List<String> lambdaResult = listOfColours.stream()
        //            .filter(what goes here??)
        //            .collect(Collectors.toList());
        //
        //    lambdaResult.forEach(System.out::println);
        //
        // Notice how we are using the method reference in the forEach
        // Could you re-write the parameter to forEach in another way?
        // Again, should be of the form x -> ????
    }

}
