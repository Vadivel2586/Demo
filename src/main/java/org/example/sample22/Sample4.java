package org.example.sample22;

import java.sql.SQLOutput;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;
import java.util.stream.Collectors;

public class Sample4 {
    public static void main(String[] args) {
        String inputStr = "aacbddefggh";

        Map<Character,Long> countMap = inputStr.chars().mapToObj(c->(char)c).collect(Collectors.groupingBy(c->c,Collectors.counting()));
        char[] chars = inputStr.toCharArray();
        for(int i=0;i<chars.length;i++){
            if(countMap.get(chars[i]) == 1){
                System.out.println(chars[i]);break;
            }
        }

        //select top 5 * from employee order by salary desc;

        String inputStr1 = "vadivel";

        char[] chars1 = inputStr1.toCharArray();
        for(int i=chars1.length-1;i>=0;i--){
            System.out.print(chars1[i]);
        }

        int[] arr = {2,1,8,4,9,5,3,5};

        for(int i=0;i<arr.length-1;i++){
            for(int j=i+1;j<arr.length-1;j++){
                if(arr[i]>arr[j]){
                    int temp = arr[i];
                    arr[i] = arr[j];
                    arr[j] = temp;
                }
            }
        }
        for(int i=0;i<arr.length-1;i++) {
            System.out.print(arr[i]);
        }


    }
}
