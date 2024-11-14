package org.example.sample13;

import java.util.List;
import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class Sample {
    public static void main(String[] args) {
        /*First Non-repeated character from the String

        Input : { "array", "apple", "rat"}
        output : y a r*/
        List<String> inputList = List.of("array", "apple", "rat");
        IntStream.range(0,inputList.size()).forEach(i->{
            String str = inputList.get(i);
            Map<Character,Long> dupCountMap = str.chars().mapToObj(ch->(char)ch)
                                                    .collect(Collectors.groupingBy(Function.identity(),Collectors.counting()));
            List<Character> charList =  str.chars().mapToObj(ch->(char)ch).collect(Collectors.toList());
            System.out.println(charList.stream().filter(ch->dupCountMap.get(ch)==1).findFirst().get());
            /*for(Character ch:charList){
                if(dupCountMap.get(ch) == 1){
                    System.out.print(ch+ " ");
                    break;
                }
            }*/
        });
    }
}
