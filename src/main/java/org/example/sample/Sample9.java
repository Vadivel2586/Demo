package org.example.sample;

import java.util.*;

public class Sample9 {
    public static void main(String[] args) {
        List<Integer> intList = Arrays.asList(1,2,3,4,5,6,7,8);
        OptionalDouble avg = intList.stream().mapToDouble(a->a).average();
        System.out.println(avg.getAsDouble());

        Map<Integer, String> map= new HashMap<>();
        map.put(12, "Hello");
        map.put(56, "Hi");
        map.put(9, "Okay");

        Integer maxKey = map.entrySet().stream().max(Map.Entry.comparingByKey()).get().getKey();
        System.out.println(maxKey);
    }
}
