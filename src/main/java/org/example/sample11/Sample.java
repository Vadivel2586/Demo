package org.example.sample11;

import java.sql.SQLOutput;
import java.util.*;
import java.util.regex.Pattern;
import java.util.stream.Collectors;

public class Sample {

    static class Person{
        private int id;
        private int age;
        private String name;

        public Person(int id, int age, String name) {
            this.id = id;
            this.age = age;
            this.name = name;
        }

        public int getId() {
            return id;
        }

        public void setId(int id) {
            this.id = id;
        }

        public int getAge() {
            return age;
        }

        public void setAge(int age) {
            this.age = age;
        }

        public String getName() {
            return name;
        }

        public void setName(String name) {
            this.name = name;
        }

        @Override
        public String toString() {
            return "Person{" +
                    "id=" + id +
                    ", age=" + age +
                    ", name='" + name + '\'' +
                    '}';
        }
    }
    public static void main(String[] args) {

        //Sort it based on person age.
        Map<String,Person> mapObj = new HashMap<>();
        mapObj.put("g",new Person(5, 51, "EE"));
        mapObj.put("e",new Person(4,25,"DD"));
        mapObj.put("a",new Person(3, 44, "CC"));
        /*id,age,name
        Map<String,Person> resultmap = new HashMap<>();
        e,a,g
        25,44,51
        */
        mapObj.entrySet().stream().sorted(Comparator.comparing(entry->entry.getValue().getAge())).collect(Collectors.toList())
                        .forEach(System.out::println);




        mapObj.entrySet().stream()
                .sorted(Comparator.comparing(entry -> entry.getValue().getAge()))
                .collect(Collectors.toList())
                .forEach(System.out::println);

        //-------------------------------------------------------------



        //code for isAnagram
        //race care
        //dood dodo
        //peek keep
        String s1 ="peek";
        String s2 = "keep";
        System.out.println(isAnagram(s1,s2));

        String result = String.join(", ", "apple", "banana", "cherry");
        System.out.println(result); // Output: apple, banana, cherry


        String str = "hello world";
        String lRemvoedStr = str.chars().filter(c->c!='l').mapToObj(c->String.valueOf((char)c)).collect(Collectors.joining());
        System.out.println(lRemvoedStr);

        String input = "Java 8 String Manipulation";
        System.out.println(input.replaceAll("\\s",""));
        System.out.println(input.chars().filter(c->c!=' ').mapToObj(c->String.valueOf((char)c)).collect(Collectors.joining()));

        String input2 = "Java 8: 123";
        //input2.chars().filter(c->Pattern.matches("^[0-9]$",c)).

        int[] nums = {2,5,3,8,5,4,4,9,1};

        Arrays.stream(nums).mapToObj(n->(int)n).collect(Collectors.groupingBy(n->n, Collectors.counting()))
                .entrySet().forEach(e-> System.out.println(e.getKey()+":"+e.getValue()));

        System.out.println(Arrays.stream(nums).mapToObj(n->(int)n).collect(Collectors.groupingBy(n->n, Collectors.counting()))
                .entrySet().stream().filter(e->e.getValue()==1).map(e->e.getKey()).skip(1).findFirst().get());


    }

    public static boolean isAnagram(String s1, String s2){
        Map<Character, Long> charCountMap = s1.chars().mapToObj(ch->(char)ch)
                .collect(Collectors.groupingBy(c->c, Collectors.counting()));

       boolean isAnagram = s2.chars()
                .allMatch(c -> {
                    char character = (char) c;
                    if (!charCountMap.containsKey(character)) {
                        return false;
                    }
                    Long count = charCountMap.get(character) - 1;
                    if (count < 0) {
                        return false;
                    }
                    charCountMap.put(character, count);
                    return true;
                });
        return isAnagram;
    }


}
