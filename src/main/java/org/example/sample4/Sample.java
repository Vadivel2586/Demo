package org.example.sample4;

import java.util.Arrays;
import java.util.Comparator;
import java.util.Map;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class Sample {
    public static int countUniqueChars(String s) {
        Map<Character, Long> charCount = s.chars()
                .mapToObj(c -> (char) c)
                .collect(Collectors.groupingBy(c -> c, Collectors.counting()));

        return (int) charCount.values().stream()
                .filter(count -> count == 1)
                .count();
    }

    public static int sumOfUniqueCharsInSubstrings(String s) {
        int n = s.length();

        return IntStream.range(0, n)
                .flatMap(i -> IntStream.range(i + 1, n + 1)
                        .map(j -> {
                            String substring = s.substring(i, j);
                            System.out.println(substring+" "+i +","+j);
                            return countUniqueChars(substring);
                        }))
                .sum();
    }

    public static void main(String[] args) {
        // Test cases
        //System.out.println(sumOfUniqueCharsInSubstrings("ABC"));      // Output: 10
        //System.out.println(sumOfUniqueCharsInSubstrings("ABA"));      // Output: 8
        System.out.println(sumOfUniqueCharsInSubstrings("LEETCODE")); // Output: 92

        String s="LEETCODE";
        int n = 0;
        for(int i=0;i<s.length();i++){
            for(int j=i+1;j<s.length()+1;j++){
                String substring = s.substring(i, j);
                System.out.println(substring+" "+i +","+j);
                n+=substring.chars().mapToObj(c->(char)c).collect(Collectors.groupingBy(c->c,Collectors.counting()))
                        .entrySet().stream().filter(entry->entry.getValue()==1).map(entry->entry.getKey()).collect(Collectors.toList()).stream().count();
            }
        }
        System.out.println(n);

        System.out.println("=============================");
        int k = s.length();
        System.out.println(k);
        System.out.println(IntStream.range(0,k)
                .flatMap(i->IntStream.range(i+1,k+1)
                .map(j-> {
                    String subString = s.substring(i,j);
                    System.out.println(subString);
                    return (int)subString.chars().mapToObj(c->(char)c).collect(Collectors.groupingBy(c->c,Collectors.counting()))
                            .entrySet().stream().filter(entry->entry.getValue()==1).map(entry->entry.getKey()).collect(Collectors.toList()).stream().count();
                })).sum());

        System.out.println("========================");
        System.out.println(IntStream.range(0,s.length())
                .flatMap(i-> IntStream.range(i+1,s.length()+1)
                        .map( j-> {
                                    return (int)s.substring(i,j).chars().mapToObj(c->(char)c).collect(Collectors.groupingBy(c->c, Collectors.counting()))
                                            .entrySet().stream().filter(e->e.getValue()==1).map(e->e.getKey()).collect(Collectors.toList()).stream().count();
                                }
                        )
                ).sum());

        int[] nums = {2,1,3,4,32};
        System.out.println(Arrays.stream(nums).boxed().collect(Collectors.toList()));

        char[] chars = {'v','a','d','i','v'};
        char[] removedDupChar = new String(chars).chars().distinct().mapToObj(c->(char)c).collect(Collectors.toList())
                .stream().map(String::valueOf).collect(Collectors.joining()).toCharArray();
        System.out.println(removedDupChar);

        System.out.println("========================");
        IntStream.range(0,5).forEach(
                i->{
                    System.out.println(i++);
                }
        );
        System.out.println("========================");
        IntStream.range(0,5).forEach(
                i->{
                    System.out.println(++i);
                }
        );

        int[] nums1 = {2,1,3,4,2,1,32};
        System.out.println(Arrays.stream(nums1).boxed().distinct().sorted().collect(Collectors.toList()));

        char[] chars1 = {'v','a','d','i','v'};
        System.out.println(new String(chars1).chars().distinct().mapToObj(c->(char)c).collect(Collectors.toList()));

        String s1 = "vadivel";
        System.out.println(s1.chars().mapToObj(c->(char)c).distinct().collect(Collectors.toList()));


        System.out.println(IntStream.range(0,s.length())
                .flatMap(i-> IntStream.range(i+1, s.length()+1)
                .map( j-> {
                    String subString = s.substring(i,j);
                    return (int)subString.chars().mapToObj(ch->(char)ch).collect(Collectors.groupingBy(c->c, Collectors.counting()))
                            .entrySet().stream().filter(e->e.getValue()==1).map(e->e.getKey()).count();
                })).sum());

    }
}
