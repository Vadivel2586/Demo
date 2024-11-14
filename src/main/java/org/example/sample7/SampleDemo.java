package org.example.sample7;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.function.Function;
import java.util.stream.Collector;
import java.util.stream.Collectors;

public class SampleDemo {
    public static void main(String[] args) {
        // Given a Integer, find the 2nd non-repeated element using java8?
        int[] input = {2,5,3,8,5,4,4,9,1};

        List<Integer> nonRepeatedList = Arrays.stream(input).boxed().collect(Collectors.groupingBy(Function.identity(), Collectors.counting()))
                .entrySet().stream().filter(entry -> entry.getValue()==1).map(entry -> entry.getKey())
                .collect(Collectors.toList());
        nonRepeatedList.forEach(System.out::print);
        System.out.println();

        int second = nonRepeatedList.stream().sorted(Comparator.reverseOrder()).skip(1).findFirst().get();
        System.out.println(second);
    }
}
