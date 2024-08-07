package org.example.sample;

import java.util.Arrays;
import java.util.List;
import java.util.regex.Pattern;
import java.util.stream.Collectors;

public class Sample2 {
    public static void main(String[] args) {
        /*

        From the given input string array, write a program in Java 8 streams api to convert them as Integer list in sorted order.
        sample 1 :
        input : ["1","3","4","2", "5", "11"]
        output : [1,2,3,4,5,11]

        sample 2 :
        input : ["1","3","7abc","4","2","xyz8", "5"]
        output : [1,2,3,4,5]
         */

        List<String> input1 = Arrays.asList("1","3","4","2", "5", "11");
        List<Integer> output1 = input1.stream().map(i->Integer.valueOf(i)).sorted().toList();
        System.out.println(output1);


        List<String> input2 = Arrays.asList("1","3","7abc","4","2","xyz8", "5");
        List<Integer> output2 = input2.stream().filter(val-> Pattern.matches("^[0-9]$",val)).map(i->Integer.valueOf(i)).sorted().collect(Collectors.toList());
        System.out.println(output2);




    }
}
