package org.example.sample;

import java.util.*;
import java.util.function.Function;
import java.util.stream.Collectors;

public class Sample11 {
    public static void main(String[] args) {
        List<List<String>> listOfList = Arrays.asList(
                Arrays.asList("one","two","three"),
                Arrays.asList("1","2","3")
        );
        List<String> allValues= listOfList.stream().flatMap(a->a.stream()).collect(Collectors.toList());
        System.out.println(allValues);

        Map<Integer, String> map = new HashMap<>();
        map.put(14,"skv");
        map.put(1,"divi");
        map.put(12,"abi");
        System.out.println(map.entrySet().stream().min(Map.Entry.comparingByKey()).stream().collect(Collectors.toList()));
        System.out.println(map.entrySet().stream().max(Map.Entry.comparingByKey()).get().getKey());
        System.out.println(map.entrySet().stream().max(Map.Entry.comparingByKey()).get().getValue());
        System.out.println(map.entrySet().stream().map(entry->entry.getValue()).collect(Collectors.toList()));
        System.out.println(map.entrySet().stream().map(entry->entry.getKey()).collect(Collectors.toList()));
        Map<Integer, String> mapFiltered =  map.entrySet().stream().filter(entry->entry.getKey()>5).collect(Collectors.toMap(x->x.getKey(),x->x.getValue()));
        System.out.println(mapFiltered);

        Map<Integer, String> mapFiltered1 =  map.entrySet().stream().filter(entry->entry.getValue().contains("i")).collect(Collectors.toMap(Map.Entry::getKey,Map.Entry::getValue));
        System.out.println(mapFiltered1);


    }
}
