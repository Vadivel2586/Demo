package org.example.sample10;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Sample1 {
    public static void main(String[] args) {
        // List of integers
        List<Integer> numbers = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10);

        numbers.stream().mapToInt(Integer::intValue).sum();

        List<Integer> list1 =  numbers.stream().filter(num->num%2==0).map(i->i*2).collect(Collectors.toList());

        list1.stream().mapToInt(i->i).sum();

        int sum=0;
        for(Integer num: list1){
            sum+=num;
        }




        // Sum the results// Print the result
        System.out.println("The sum of even numbers multiplied by 2 is: " + sum);

    }
}
