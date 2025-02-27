package org.example.sample22;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

public class sample1 {
    public static void main(String[] args) {
        List<String> names = Arrays.asList (" Nandhini", "Vijay", "Hemanth", "Mohanlal", "Rajulal", null);
        System.out.println((names.stream().filter(name1-> Optional.ofNullable(name1).isPresent())
                .filter(name-> !name.endsWith("lal")).collect(Collectors.toList())));
    }
}
