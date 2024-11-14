package org.example.sample8;

import java.util.*;
import java.util.function.Function;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class SampleDemo {
    public static void main(String[] args) {
        String inputStr = "abbcdzacdzux";

        List<Character> dupChar = inputStr.chars().mapToObj(c->(char)c).collect(Collectors.groupingBy(c->c,Collectors.counting()))
                .entrySet().stream().filter(e->e.getValue()==1).map(e->e.getKey()).collect(Collectors.toList());

        dupChar.forEach(System.out::println);

    }
}
