package org.example.sample22;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Sample3 {
    public static void main(String[] args) {
        int[] array1 = {1,2,3,4,5,6};
        int[] array2 = {1,2,3,4,5,6,7};

        List<Integer> outputList = Stream.concat(
                        Arrays.stream(array1).boxed(),
                        Arrays.stream(array2).boxed()
                ).collect(Collectors.toList());
        System.out.println(outputList);

        int[] array3 = {1,1,2,1,3,1,4,5,6};

        List<Integer> outputList2 = Stream.concat(
                        Arrays.stream(array3).boxed().filter(val -> val == 1),
                        Arrays.stream(array3).filter(val -> val > 1).boxed()
                ).collect(Collectors.toList());
        System.out.println(outputList2);
    }
}
