package org.example.sample2;

import java.util.*;
import java.util.function.Function;
import java.util.stream.Collectors;
import java.util.stream.DoubleStream;
import java.util.stream.IntStream;

public class sample {

    public static void main(String[] args) {
        List<Employee> empList = new ArrayList<>();
        empList.add(new Employee("Vel", 15000.0));
        empList.add(new Employee("Abi", 12000.0));
        empList.add(new Employee("Divi", 10000.0));

        System.out.println(empList.stream().map(emp->emp.getSalary()).sorted(Comparator.reverseOrder()).skip(1).findFirst().get());


        System.out.println(empList.stream().sorted(Comparator.comparingDouble(Employee::getSalary)).skip(1).findFirst().get());

        List<Double>  salary = empList.stream().map(emp-> emp.getSalary()).collect(Collectors.toList());
        OptionalDouble avgData = salary.stream().mapToDouble(sal->(double) sal).average();
        System.out.println("Avg Salary: "+ avgData.getAsDouble());


        //1,3,4,1,5,6,7,4,8
        List<Integer> nums =  Arrays.asList(1,3,4,1,5,6,7,4,8);
        Map<Integer, Long> dumList =  nums.stream().collect(Collectors.groupingBy(Function.identity(),Collectors.counting()));
        for(int i=0;i<nums.size();i++){
            if(dumList.get(nums.get(i))>1){
                System.out.println("index: "+ i +" - Dup num:"+nums.get(i));
            }
        }

        System.out.println(nums.stream().max(Integer::compareTo).get());

        System.out.println(nums.stream().min(Integer::compareTo).get());

        List<Integer> dupNums =  dumList.entrySet().stream().filter(entry-> entry.getValue()>1).map(entry-> entry.getKey()).collect(Collectors.toList());
        System.out.println(dupNums);

        IntStream.range(0, nums.size())
                .filter(i -> dumList.get(nums.get(i)) > 1)
                .forEach(i -> System.out.println("index: " + i + " - Dup num: " + nums.get(i)));


        for (int i=1;i<=15;i++){
            if(i%3==0 || i%5==0) {
                if (i % 3 == 0 && i % 5 == 0) {
                    System.out.println("FizzBuzz");
                    continue;
                }
                if (i % 3 == 0) {
                    System.out.println("Fizz");
                    continue;
                }
                if (i % 5 == 0) {
                    System.out.println("Buzz");
                    continue;
                }
            }
            System.out.println(i);
        }
    }
}
