package org.example.sample20;

import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class sample {
    public static void main(String[] args) {
        List<Integer> inputList = List.of(1,2,3,4,5,6,7,8,9);
        List<Integer> outputList = Stream.concat(
                inputList.stream().filter(num->num%2==0),
                inputList.stream().filter(num->num%2!=0)
        ).collect(Collectors.toList());
        System.out.println(outputList);
    }
}
