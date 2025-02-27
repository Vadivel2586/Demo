package org.example.sample;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.Map;
import java.util.concurrent.ConcurrentMap;
import java.util.function.Function;
import java.util.stream.Collectors;

public class Sample7 {
    public static void main(String[] args) {
        List<Integer> list = Arrays.asList(2,3,4,1,5,5,2,5,2,5,7,6,3,8,1,8);
        Map<Integer,Long> dupCountMap = list.stream().collect(Collectors.groupingBy(Function.identity(),Collectors.counting()));
        System.out.println(dupCountMap);
        System.out.println(list.stream().collect(Collectors.groupingBy(Function.identity(),Collectors.counting())));

        System.out.println(list.stream().collect(Collectors.groupingBy(val->val,Collectors.counting())));

        dupCountMap.entrySet().stream().filter(entry -> entry.getValue()>1).map(entry -> entry.getKey()).forEach(System.out::println);

        list.stream().sorted(Comparator.reverseOrder()).toList().forEach(System.out::print);

System.out.println();
        list.stream().collect(Collectors.groupingBy(Function.identity(),Collectors.counting()))
                .entrySet().stream().filter(entry -> entry.getValue()>1).forEach(entry-> System.out.println(entry.getKey()));


        String name = "vadivel";
        name.chars().mapToObj(n->(char)n).distinct().forEach(System.out::println);

    }
}
