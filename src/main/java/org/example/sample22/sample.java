package org.example.sample22;

import java.util.Comparator;
import java.util.List;
import java.util.Optional;

public class sample {

    private static final List<List<String>> task = List.of(
            List.of("1", "3", "99", "2", "1940", "2"),
            List.of("111", "7", "199", "92", "14", "20"),
            List.of("10", "31", "9", "21", "243", "432"),
            List.of("31", "13", "999", "5", "41", "222"),
            List.of("10", "31", "401", "42", "11", "77")
    );

    public static Integer findMax(List<List<String>> list) {

        Optional<Integer> maxVal = list.stream().flatMap(l->l.stream()).map(val->Integer.parseInt(val)).sorted(Comparator.reverseOrder()).findFirst();
        if(maxVal.isPresent()){
            return maxVal.get();
        }
        return -1;
    }

    public static void main(String[] args) {
        System.out.println("max for task: " + findMax(task));
    }

}
