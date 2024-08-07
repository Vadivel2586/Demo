package org.example.sample;

import java.util.ArrayList;

public class Sample8 {
    /*
    Abundant Numbers - A number n is said to be an abundant number if the sum of its proper divisors is greater than the
    number n.
    For example, 12 is an abundant number 1 + 2 + 3 + 4 + 6 = 16.
    Write a program that will print all the abundant numbers below 1,000,000
     */
    public static void main(String[] args) {
        int abundantNum = 1000000;
        int sum = 0;
        ArrayList<Integer> numList = new ArrayList<>();
        for(int i=1;i<abundantNum;i++){
            if(abundantNum%i==0){
                numList.add(i);
                sum +=i;
            }
        }
        if(abundantNum < sum) {
            int n=0;
            for(Integer i:numList){
                n++;
                System.out.print(i);
                if(n!=numList.size()){
                    System.out.print("+");
                }
            }
            System.out.println("="+sum);
        }
    }
}
