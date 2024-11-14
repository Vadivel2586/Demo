package org.example.sample;

import java.util.*;
import java.util.function.Function;
import java.util.stream.Collectors;

public class StringToCharArray {
    public static void main(String[] args) {
        String str = "Vadivel vadi";

        List charArray = str.chars()
                .mapToObj(c -> (char) c)
                .collect(Collectors.toList());

        System.out.println(str.chars().mapToObj(c->(char)c).collect(Collectors.toList())
                        .stream().collect(Collectors.groupingBy(Function.identity(),Collectors.counting()))
                        .entrySet().stream().filter(e->e.getValue()>1).map(e->e.getKey()).collect(Collectors.toList()));

        System.out.println(str.chars().mapToObj(c->(char)c).collect(Collectors.toList()));

        System.out.println(charArray);


        List<Integer> numList = List.of(2,2,5,4,3,5,6,67,5,4,34,3,2,2);
        Map<Integer,Long> dupCount = numList.stream().collect(Collectors.groupingBy(Function.identity(),Collectors.counting()));
        System.out.println(dupCount);


        List<Integer> nubList = List.of(1,2,3,2,1,2,3,4,4,4);
        Map<Integer,Long> dupCount1 = nubList.stream().collect(Collectors.groupingBy(a->a,Collectors.counting()));
        System.out.println(dupCount1);

        System.out.println(nubList.stream().distinct().sorted(Comparator.reverseOrder()).skip(1).findFirst());


        System.out.println(numList.stream().sorted().distinct().collect(Collectors.toList()));

        int temp = 0;
        int arr[] = new int[] {5,3,6,2,1,6};
        System.out.println("Before sorting: "+Arrays.toString(arr));
        for(int i=0;i<arr.length;i++){
            for(int j=i+1;j<arr.length;j++){
                if(arr[i]>arr[j]){
                    temp = arr[i];
                    arr[i] = arr[j];
                    arr[j] = temp;
                }
            }
        }
        System.out.println("After sorting: "+Arrays.toString(arr));


        //Prime Number
        checkPrimeNumber(3);


        //reverse a string
        String givenString = "abcdef";
        char convertToChar[] = givenString.toCharArray();
        for(int i=convertToChar.length-1;i>=0;i--){
            System.out.print(convertToChar[i]);
        }
        System.out.println();
        for(int i=convertToChar.length-1;i>=0;i--){
            System.out.print(givenString.charAt(i));
        }
        System.out.println();
        //Find the Largest Element in an Array:
        String givenString1 = "abcdcbax";
        boolean flag = true;
        int startingIndex = 0;
        int endingIndex = givenString1.length()-1;
        for(int i=startingIndex;i<endingIndex;i++){
            if(givenString1.charAt(startingIndex) != givenString1.charAt(endingIndex)){
                flag = false;
                break;
            }
            startingIndex++;
            endingIndex--;
        }
        if(flag){
            System.out.println("Its palindrom");
        }else{
            System.out.println("Its not palindrom");
        }


        int[] numbers = {10, 22, 14, 26, 30, 15};
        int target = 20;

        int nearestNumber = findNearestNumber(numbers, target);

        System.out.println("The nearest number to " + target + " is: " + nearestNumber);
    }
    public static void checkPrimeNumber(int numToCheck){
        int n= numToCheck/2;
        int flag = 0;
        if(numToCheck == 0 || numToCheck == 1){
            System.out.println(numToCheck +" is not prime number.");
            flag = 1;
        }else{
            for(int i=2;i<=n;i++){
                if(numToCheck%i==0){
                    System.out.println(numToCheck +" is not prime number.");
                    flag = 1;
                }
            }
        }
        if(flag == 0){
            System.out.println(numToCheck +" is a prime number.");
        }
    }

    public static int findNearestNumber(int[] numbers, int target) {
        // Initialize nearest number with the first element of the array
        int nearest = numbers[0];
        int minDiff = Math.abs(target - nearest);
        System.out.println("minDiff: "+minDiff);

        for (int num : numbers) {
            int diff = Math.abs(target - num);
            if (diff < minDiff) {
                minDiff = diff;
                nearest = num;
            }
        }

        return nearest;
    }
}
