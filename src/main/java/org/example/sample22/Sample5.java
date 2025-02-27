package org.example.sample22;

import java.util.Arrays;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class Sample5 {
    public static void main(String[] args) {
        //Input - 8,4,3,6,9,1,2
        //Output- {8,2}, {9,1}, {6,4} //each sum of 10
        List<Integer> numbers = Arrays.asList(8,4,3,6,9,1,2);
        List<int[]> pairs = IntStream.range(0, numbers.size())
                .boxed()
                .flatMap(i -> IntStream.range(i + 1, numbers.size())
                        .filter(j -> numbers.get(i) + numbers.get(j) == 10)
                        .mapToObj(j -> new int[]{numbers.get(i), numbers.get(j)}))
                .collect(Collectors.toList());
        pairs.forEach(pair -> System.out.println("{" + pair[0] + "," + pair[1] + "}"));

        List<Integer> inputList = Arrays.asList(8,4,3,6,9,1,2);

        System.out.println(inputList.stream().max(Integer::compareTo).get());
        System.out.println(inputList.stream().min(Integer::compareTo).get());

        String inputStr = "google"; // first non-repeated character
        System.out.println(inputStr.chars().mapToObj(c->(char)c).collect(Collectors.groupingBy(ch->ch, LinkedHashMap::new, Collectors.counting()))
                .entrySet().stream().filter(entry->entry.getValue()==1).map(entry->entry.getKey()).findFirst().get());


        List<int[]> outputList = IntStream.range(0,numbers.size()).boxed()
                .flatMap(i -> IntStream.range(i+1, numbers.size())
                        .filter(j -> numbers.get(i)+numbers.get(j) == 10)
                        .mapToObj(j -> new int[]{numbers.get(i), numbers.get(j)})
                ).collect(Collectors.toList());
        outputList.forEach(data-> System.out.println(data[0] +" "+data[1]));

    }
}
