package org.example.sample1;

import java.sql.SQLOutput;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class sample {

    public static void main(String[] args) {
        Employee e1 = new Employee(1,"Vel","IT");
        Employee e2 = new Employee(2,"Divi","cse");
        Employee e3 = new Employee(3,"Abi","IT");
        Employee e4 = new Employee(4,"lax","cse");
        List<Employee> empList = new ArrayList<>();
        empList.add(e1);
        empList.add(e2);
        empList.add(e3);
        empList.add(e4);

        Map<String, Long> map = empList.stream().collect(Collectors.groupingBy(Employee::getDepartment, Collectors.counting()));
        System.out.println(map);

        //palindrome check
        String givenString = "velev";
        String reverseString = new StringBuilder(givenString).reverse().toString();
        if(givenString.equalsIgnoreCase(reverseString)){
            System.out.println("Yes its palindrome");
        } else {
            System.out.println("Yes its not palindrome");
        }



        // Count Vowels and Consonants
        givenString = "Hello Vadivel";
        int vowels = 0;
        int consonants = 0;

        for(char ch: givenString.toCharArray()){
            if("aeiou".indexOf(ch)!=-1){
                vowels++;
            }else{
                consonants++;
            }
        }
        System.out.println("Vowels count:"+ vowels +"\nConsonants Count:"+ consonants);

    }
}
