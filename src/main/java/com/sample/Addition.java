package com.sample;

public class Addition {
    public static void main(String[] args) {

        System.out.println("Addition Result:"+add(10,5));
        System.out.println("Subtraction Result:"+sub(10,5));
    }

    private static int add(int a, int b){
       return a+b;
    }

    private static int sub(int a, int b){
        return a-b;
    }
}
