package org.example.sample;


import java.util.*;
import java.util.regex.Pattern;
import java.util.stream.Collectors;


public class Sample1 {
    public static void main(String[] args) {
        List<Integer> ary = List.of(3,2,1,4,5,3,7,8);
        List<Integer> ar = ary.stream().distinct().collect(Collectors.toList());
        System.out.println(ar);

        List<Integer> sortedAr = ary.stream().sorted().distinct().collect(Collectors.toList());
        System.out.println(sortedAr);

        Set<Integer> set = new HashSet();
        Set<Integer> dupOnly = ary.stream().filter(s-> !set.add(s)).collect(Collectors.toSet());
        System.out.println(dupOnly);

       // Map<Integer,Integer> countMap = ary.stream().

        String str[] = {"Divya","Abinesh","Lakshmi","Vadivel"};

        List<String> strList = Arrays.asList(str).stream().filter(s->s.length()>5).collect(Collectors.toList());
        System.out.println(strList);

        List<String> strSortedList = Arrays.asList(str).stream().sorted().collect(Collectors.toList());
        System.out.println(strSortedList);

        int intVal = 234;

        int n = intVal;
        int count = 0;
        ArrayList<Integer> intValList = new ArrayList<>();
        while(n!=0){
            intValList.add(n%10);
            n=n/10;
            count++;
        }
        Collections.reverse(intValList);
        System.out.println("intVal Length:"+count);
        System.out.println("intVal List:"+intValList);


        List<String> input2 = Arrays.asList("1","3","7abc","4","2","xyz8", "5");

        List<Integer> intList = input2.stream().filter(val-> Pattern.matches("^[0-9]$",val))
                .map(val->Integer.parseInt(val)).collect(Collectors.toList());

    }
}
