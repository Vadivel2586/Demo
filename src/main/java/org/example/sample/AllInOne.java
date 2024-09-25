package org.example.sample;

import java.util.ArrayList;
import java.util.List;

public class AllInOne {
    public static void main(String[] args) {

        // to find number length and reverse the number
        int a = 234;
        int b= a;
        int length = 0;
        //to find length
        while(b!=0){
            length++;
            b= b/10;
        }
        System.out.println(length);
        b=a;
        System.out.println(a);
        List reverseNumList = new ArrayList();
        while(b!=0){
            reverseNumList.add(b%10);
            b = b/10;
        }
        System.out.println(reverseNumList);

        //to find prime number
        int inputNum = 4;
        boolean isPrimeFlag = isPrimeFlag(inputNum);
        if(isPrimeFlag){
            System.out.println(inputNum+" is Prime Number.");
        }else{
            System.out.println(inputNum+" is not Prime Number. ");
        }


    }

    private static boolean isPrimeFlag(int inputNum) {
        boolean isPrimeFlag = true;
        int halfOfCount = inputNum /2;
        if(inputNum ==0 || inputNum ==1){
            isPrimeFlag = false;
        }else{
            for(int i=2;i<=halfOfCount;i++){
                if(inputNum %i==0){
                    isPrimeFlag = false;
                    break;
                }
            }
        }
        return isPrimeFlag;
    }
}
