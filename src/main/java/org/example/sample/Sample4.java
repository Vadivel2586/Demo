package org.example.sample;

import java.util.Arrays;
import java.util.List;

public class Sample4 {
    public static void main(String[] args) {

        //int s1= 1001;
        String s1 = "TOOT";
        StringBuffer sb = new StringBuffer();

        String input = String.valueOf(s1);
        char s2[] = input.toCharArray();

        for(int i=s2.length-1;i>=0;i--){
            sb.append(s2[i]);
        }
        if(input.equalsIgnoreCase(sb.toString())){
            System.out.println("Given String is Palindrom");
        }else{
            System.out.println("Given String is not Palindrom");
        }

        List<Integer> listOfNumbers = Arrays.asList(1, 2, 3, 4);
        int sum = listOfNumbers.parallelStream().reduce(5, Integer::sum);
        System.out.println(sum);

        int sum1 = listOfNumbers.stream().reduce(0, Integer::sum);
        System.out.println(sum1);

    }
}
