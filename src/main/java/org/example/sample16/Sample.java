package org.example.sample16;

import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;

public class Sample {
    public static void main(String[] args) {
        //print non-repeated char in given order.
        //Input: Java programs are more secure
        //Output: Jvpgcu
        String input = "Java programs are more secure";
        Map<Character, Long> charCount = input.chars()
                .mapToObj(c -> (char) c)
                .collect(Collectors.groupingBy(Function.identity(), Collectors.counting()));

        input.chars()
                .mapToObj(c -> (char) c)
                .filter(c -> charCount.get(c) == 1)
                .forEach(System.out::print);


        int a=10;
        System.out.println("");
        if(a>20){
            System.out.println("Yes");
        }else{
            System.out.println("No");
        }

        for(int i=1;i<=10;i++){
            System.out.println(i);
        }

        while(a>20){
            a++;
        }







    }
}
