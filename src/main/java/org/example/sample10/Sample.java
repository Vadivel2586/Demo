package org.example.sample10;

import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class Sample {
    public static void main(String[] args) {
        Map<Character, Integer> romanMap = new HashMap<>();
        romanMap.put('I',1);
        romanMap.put('V',5);
        romanMap.put('X',10);
        romanMap.put('L',50);
        romanMap.put('C',100);
        romanMap.put('D',500);
        romanMap.put('M',1000);

        String s= "III";
        char[] charArray = s.toCharArray();
        int sum = 0;

        int prevValue = 0;
        for(int i=charArray.length-1;i>=0;i--){
            int currentValue = romanMap.get(charArray[i]);
            if(currentValue >= prevValue) {
                sum += romanMap.get(charArray[i]);
                //System.out.println("+: "+sum);
            }else {
                sum -= romanMap.get(charArray[i]);
                //System.out.println("-:" +sum);
            }
            prevValue = currentValue;
        }
        System.out.println(sum);
    }

    /*romanMap.put('I',1);
        romanMap.put('V',5);
        romanMap.put('X',10);
        romanMap.put('L',50);
        romanMap.put('C',100);
        romanMap.put('D',500);
        romanMap.put('M',1000);
    MCMXCIV
    +: 1100
            -:2000
            +: 3010
            -:3100
            +: 3201
            -:3205*/

   /* Exercise: Manipulating a List of Numbers
    Objective: Given a list of integers, use the Stream API to perform the following operations:
    Filter out the even numbers.
    Multiply each even number by 2.
    Get the sum of all the resulting numbers*/

}
