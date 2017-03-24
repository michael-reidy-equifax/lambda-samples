package com.equifax.samples.lambda;

import com.equifax.samples.types.Customer;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

/**
 * Hello world!
 */
public class SampleThreeFlatMap {
    public static void main(String[] args) {
        String[][] data = new String[][]{{"a", "b"}, {"c", "d"}, {"e", "f"}};

        // Note : when we create a stream it's a stream of arrays
        Stream<String[]> dataStream = Arrays.stream(data);
        dataStream.forEach(System.out::println);

        // re-open dataStream
        dataStream = Arrays.stream(data);
        
        // But I want all the individual strings in a stream
        Stream<String> stringStream = dataStream.flatMap(x -> Arrays.stream(x));
        stringStream.forEach(System.out::println);

    }

}
