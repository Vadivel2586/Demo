package org.example.sample;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class Sample4 {
    public static void main(String[] args) {

        //int s1= 1001;
        String s1 = "madam";
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

        String inputStr = "programming";
        Map<Character,Long> dupMap =  inputStr.chars().mapToObj(c->(char)c).collect(Collectors.groupingBy(c->c, Collectors.counting()))
                .entrySet().stream().filter(entry-> entry.getValue()>1).collect(Collectors.toMap(Map.Entry::getKey,Map.Entry::getValue));
        System.out.println(dupMap);

        String sentence ="The quick brown for jumped over the lazy dog";
        String longWord = Arrays.stream(sentence.split(" ")).reduce("", (w1,w2)-> w1.length()>= w2.length() ? w1: w2);
        System.out.println("longWord: "+longWord);
    }
}
