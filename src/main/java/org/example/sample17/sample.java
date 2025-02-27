package org.example.sample17;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;

public class sample {
    public static void main(String[] args) {
        findNearestNumber();

        findUniqueNumber();

        ///Binary Search
        binarySearch();



    }
    static void findNearestNumber(){
        List<Integer> inputNum = List.of(1,2,3,6,7,8);
        int checkNearest = 4;
        int foundIndex = -1;

        int low = 0;
        int high = inputNum.size()-1;
        while(low<=high){
            int middle = (low+high)/2;
            if(inputNum.get(middle) == checkNearest){
                foundIndex = middle; break;
            } else if(inputNum.get(middle) > checkNearest){
                high = middle -1;
            } else {
                low = middle+1;
            }
        }
        if (low < inputNum.size() && high >= 0) {
            int lowNum = inputNum.get(low);
            int highNum = inputNum.get(high);

            System.out.println(Math.abs(lowNum - checkNearest) < Math.abs(highNum - checkNearest) ? lowNum : highNum);
        }
        else if (low < inputNum.size()) {
            System.out.println(inputNum.get(low));
        }
        else {
            System.out.println(inputNum.get(high));
        }

    }
    static  void findUniqueNumber(){
        List<Integer> input = List.of(3,2,1,2,1);
        int output = 0;
        for(int a: input){
            output^=a;
        }
        /*
         *  XOR GATE ^
         *  2+2 =0 (0010+0010=0000)
         *  1+1 =0 (0001+0001=0000)
         *  0+3 =0 (0000+0011=0011) (Answer)
         * */
        System.out.println(output);

    }
    static void binarySearch(){
        List<Integer> binarySearchList = List.of(4,2,1,6,78,5,4,3);
        List<Integer> sortedList = new ArrayList<>(binarySearchList);
        Collections.sort(sortedList);
        System.out.println("Sorted List: "+sortedList);
        int binarySearchValue = 78;
        int foundIndex = -1;
        int left = 0;
        int right = sortedList.size()-1;
        while(left<=right){
            int middle = (right+left)/2;
            if(sortedList.get(middle) == binarySearchValue){
                foundIndex = middle; break;
            } else if(sortedList.get(middle) > binarySearchValue){
                right = middle -1;
            } else {
                left = middle+1;
            }
        }
        System.out.println("Found Index:"+ foundIndex);
    }
}
