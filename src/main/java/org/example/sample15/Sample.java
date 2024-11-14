package org.example.sample15;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class Sample {

    record Employee(int id, String name, String manager){}
    public static void main(String[] args) {
        List<Employee> employees = Arrays.asList(
                new Employee(1, "Alice", "Bob"),
                new Employee(2, "Charlie", "Bob"),
                new Employee(3, "David", "Eve"),
                new Employee(4, "Eva", "Eve"),
                new Employee(5, "Frank", "Bob")
        );

        // Group employees by their manager
        Map<String, List<Employee>> groupedByManager = employees.stream()
                .collect(Collectors.groupingBy(Employee::manager, Collectors.toList()));

        // Print the grouped result
        groupedByManager.forEach((manager, employeesList) -> {
            System.out.println(manager + ": " + employeesList);
        });
    }

}
