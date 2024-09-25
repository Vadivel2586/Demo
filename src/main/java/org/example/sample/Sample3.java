package org.example.sample;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.Optional;

public class Sample3 {
    public static void main(String[] args) {
        /*
        34 78 33 17 68 93 57 86 81

        Find the second highest number divisible by 2
         */
        List<Integer> list = Arrays.asList(34,78,33,17,68,93,57,86,81);
        Optional<Integer> secondHighestNum = list.stream().sorted().filter(val->val%2==0).skip(1).findFirst();
        System.out.println(secondHighestNum);


        Optional<Integer> secondHighestNumber = list.stream().sorted(Comparator.reverseOrder()).skip(1).findFirst();
        secondHighestNumber.ifPresentOrElse(num-> System.out.println(num),()->System.out.println("illayea"));

    }
}
