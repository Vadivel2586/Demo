package org.example.sample22;

import java.util.*;
import java.util.stream.Collectors;

public class sample2 {
    public static void main(String[] args) {
        List<Integer> inputList = Arrays.asList(2,2,1,4,4,5,7,7);

        Set<Integer> dupCheckSet = new HashSet<>();

        List<Integer> dupList =inputList.stream()
                .filter(val -> !dupCheckSet.add(val)).collect(Collectors.toList());
        System.out.println(dupList);

        //input 2,0,4,0,1,0
        //output 2,4,1,0,0,0

        List<Integer> inputList1 = Arrays.asList(2,0,4,0,1,0);

        System.out.println(inputList1.stream()
                .sorted(Comparator.reverseOrder()).collect(Collectors.toList()));
    }
}
