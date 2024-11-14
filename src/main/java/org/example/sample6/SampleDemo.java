package org.example.sample6;

import java.util.Comparator;
import java.util.List;
import java.util.Optional;

public class SampleDemo {
    public static void main(String[] args) {
        List<Integer> inputList = List.of(6,3,2,4,57,8,2,4);
        Optional output = inputList.stream().sorted(Comparator.reverseOrder()).findFirst();
        System.out.println(output.isPresent());
        System.out.println(output.get());
    }
}
