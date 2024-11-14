package org.example.sample6;


import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

record Student(String name,int score,int rank) {}
public class StudentRank {
    public static void main(String[] args) {
        List<Student> students = Arrays.asList(
                new Student("Alice", 90, 0),
                new Student("Bob", 85, 0),
                new Student("Abinesh", 95, 0),
                new Student("David", 85, 0),
                new Student("Eve", 70, 0)
        );

        List<Student> scoreSortedList = students.stream()
                .sorted(Comparator.comparingInt(Student::score).reversed())
                .collect(Collectors.toList());

        List<Student> scoreRankList = IntStream.range(0,scoreSortedList.size())
                                        .mapToObj(i-> new Student(scoreSortedList.get(i).name(),scoreSortedList.get(i).score(), i+1))
                                        .collect(Collectors.toList());

        scoreRankList.forEach(System.out::println);

    }
}
