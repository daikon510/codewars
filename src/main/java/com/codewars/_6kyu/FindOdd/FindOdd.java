package com.codewars._6kyu.FindOdd;

import java.util.Arrays;
import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;

public class FindOdd {
    public static int findIt(int[] a) {
        Map<Integer, Long> map = Arrays.stream(a)
                .sorted()
                .boxed()
                .collect(Collectors.groupingBy(Function.identity(), Collectors.counting()));

        for (Map.Entry<Integer, Long> tmp : map.entrySet()) {
            if (tmp.getValue()%2 != 0) {
                return tmp.getKey();
            }
        }
        throw new RuntimeException("unique number not found");
    }
}