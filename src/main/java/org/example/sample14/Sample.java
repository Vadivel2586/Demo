package org.example.sample14;

import java.util.*;
import java.util.stream.Collectors;

public class Sample {

    record Employee(String name, String department, double salary){}
    public static void main(String[] args) {
        List<Employee> employees = Arrays.asList(
                new Employee("Alice", "HR", 5000),
                new Employee("Bob", "IT", 7000),
                new Employee("Charlie", "IT", 9000),
                new Employee("David", "HR", 6000),
                new Employee("Eva", "IT", 8000),
                new Employee("Frank", "HR", 4500)
        );

        //second salary from each department
        employees.stream().collect(Collectors.groupingBy(Employee::department, Collectors.mapping(Employee::salary, Collectors.toList())))
                .forEach((dept, salary) -> System.out.println(dept +":"+
                        salary.stream().distinct().sorted(Comparator.reverseOrder()).skip(1).findFirst().orElse(null)));


        System.out.println("************************************************");
        //average salary from each department
        System.out.println(employees.stream().collect(Collectors.groupingBy(Employee::department,
                Collectors.averagingDouble(Employee::salary))));

        System.out.println("************************************************");

        //max salary from each department
        System.out.println(employees.stream().collect(Collectors.groupingBy(Employee::department,
                Collectors.maxBy(Comparator.comparing(Employee::salary)))));

        System.out.println("************************************************");

         List<Integer> numList = List.of(1,2,3,4,5);
         IntSummaryStatistics intSummaryStatistics = numList.stream().collect(Collectors.summarizingInt(Integer::intValue));
         System.out.println(intSummaryStatistics);
         System.out.println(intSummaryStatistics.getAverage());

        System.out.println("************************************************");




    }
}
